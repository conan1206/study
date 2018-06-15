package com.conan.service.TestDebugThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestDebugJob {

    ExecutorService executorService = new ThreadPoolExecutor(30, 200, 180, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

    public void execute(){
        executorService.submit(new TestDebugRunnable());
    }

}
