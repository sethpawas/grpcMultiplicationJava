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

        tables(ch);
        greet(ch);
        GCD(ch);

        ch.shutdown();
    }

    private void tables(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        tableRequest req = tableRequest.newBuilder().setNumber(10).build();
        tableResponse res = stub.tables(req);

        System.out.println("Cube: " + res.getResult());
    }

    private void greet(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        greetingsRequest req = greetingsRequest.newBuilder().setA("ayush").build();

        greetingsResponse res =stub.greet(req);
//        stub.primeFactors(req).forEachRemaining(primeFactorResponse -> {
//            System.out.println("Prime Factors: " + primeFactorResponse.getResult());
//        });
        System.out.println(res.getB());
    }

//    private void average(ManagedChannel channel) {
//        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);
//
//        CountDownLatch latch = new CountDownLatch(1);
//
//        StreamObserver<TableRequest> reqObserver = stub.average(new StreamObserver<CalculatorAverageResponse>() {
//            @Override
//            public void onNext(CalculatorAverageResponse value) {
//                System.out.println("Average: " + value.getResult());
//            }
//
//            @Override
//            public void onError(Throwable t) {
//
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("Finished");
//                latch.countDown();
//            }
//        });
//
//        for(int i = 0; i < 10000; i++) {
//            reqObserver.onNext(TableRequest.newBuilder()
//                    .setNumber(i).build());
//        }
//
//        reqObserver.onCompleted();a
//
//        try {
//            latch.await(3, TimeUnit.SECONDS);
//        } catch(InterruptedException ex) {
//            ex.printStackTrace();
//        }
//    }

    private void GCD(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<tableRequest> reqObserver = stub.gCD(new StreamObserver<divisorResponse>() {
            @Override
            public void onNext(divisorResponse value) {
                System.out.println("Number: " + value.getNum());
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

        for(int i = 0; i < 10; i++) {
            reqObserver.onNext(tableRequest.newBuilder()
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