package com.Callable.Future;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    public String call(){
        throw new RuntimeException("Callable task ecception");
    }
}
