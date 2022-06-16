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

    }

}
