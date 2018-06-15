package com.conan.service.TestDebugThread;

import org.junit.Test;

import java.util.concurrent.*;

public class TestDebugMain {

    @Test
    public void main(){
        TestDebugJob testDebugJob = new TestDebugJob();
        testDebugJob.execute();
    }

}
