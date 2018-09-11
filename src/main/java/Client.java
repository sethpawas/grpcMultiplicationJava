import com.proto.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        System.out.println("Starting Client...");
        Client c = new Client();
        c.run();
    }

    private void run() {
        ManagedChannel ch = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext().build();

        square(ch);

        primeFactors(ch);

        average(ch);

        oddEven(ch);

        ch.shutdown();
    }

    private void square(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        CalculatorRequest req = CalculatorRequest.newBuilder()
                .setNumber(5).build();

        CalculatorResponse res = stub.square(req);

        System.out.println("Square: " + res.getResult());
    }

    private void primeFactors(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        CalculatorRequest req = CalculatorRequest.newBuilder()
                .setNumber(120).build();

        stub.primeFactors(req).forEachRemaining(primeFactorResponse -> {
            System.out.println("Prime Factors: " +primeFactorResponse.getResult());
        });
    }

    private void average(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<CalculatorRequest> reqObserver = stub.average(new StreamObserver<CalculatorAverageResponse>() {
            @Override
            public void onNext(CalculatorAverageResponse value) {
                System.out.println("Average: " + value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Finished");
                latch.countDown();
            }
        });

        for(int i = 0; i < 10000; i++) {
            reqObserver.onNext(CalculatorRequest.newBuilder()
                    .setNumber(i).build());
        }

        reqObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void oddEven(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<CalculatorRequest> reqObserver = stub.oddEven(new StreamObserver<CalculatorOddEvenResponse>() {
            @Override
            public void onNext(CalculatorOddEvenResponse value) {
                System.out.println("Number: " + value.getResult() + " Type" + value.getType());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Finished");
                latch.countDown();
            }
        });

        for(int i = 0; i < 10000; i++) {
            reqObserver.onNext(CalculatorRequest.newBuilder()
                    .setNumber(i).build());
        }

        reqObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}