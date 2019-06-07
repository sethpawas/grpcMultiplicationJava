import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.FibonacciResponse;
import com.proto.calculator.Request;
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

        fibonacciSeries(ch);

        ch.shutdown();
    }

    private void fibonacciSeries(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        //Request req = Request.newBuilder().build();
       Request req = Request.newBuilder().setNumber(23).build();

        FibonacciResponse res = stub.fibonacciSeries(req);


        System.out.println("Multiplication is: " + res.getResult());
    }
}