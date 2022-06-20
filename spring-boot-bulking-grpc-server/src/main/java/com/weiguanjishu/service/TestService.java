package com.weiguanjishu.service;

import com.example.grpc.TestRequest;
import com.example.grpc.TestResponse;
import com.example.grpc.TestServiceGrpc;
import com.weiguanjishu.annotation.GrpcService;
import io.grpc.stub.StreamObserver;

@GrpcService
public class TestService extends TestServiceGrpc.TestServiceImplBase {

    @Override
    public void queryTest(TestRequest request, StreamObserver<TestResponse> responseObserver) {
        System.out.println(" TestService 接收到的参数，name：" + request.getName());

        TestResponse response = TestResponse.newBuilder().setName(request.getName()).setAge(30).setAddress("上海").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
