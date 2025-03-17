package com.debuggeando_ideas.real_appplications;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ConcurrenceLambdas {

	
	static Runnable printerSum = () -> {
		long result = 0;
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<1000000; i++) {
			result += i;
		}
		System.out.println(result);
	};
	
	static Callable<Long> getSum = () -> {
		long result = 0;
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<1000000; i++) {
			result += i;
		}
		return result;
	};	
	
	private static CompletableFuture<Void> getCompletableFutureSum(){
        return CompletableFuture.runAsync(() -> {
    		long result = 0;
    		System.out.println(Thread.currentThread().getName());
    		for(int i=0; i<1000000; i++) {
    			result += i;
    		}
    		System.out.println(result);
        });
	}
	
   
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println(Thread.currentThread().getName());
				
		var exec = Executors.newSingleThreadExecutor();
		exec.submit(printerSum);
		
		var exec2 = Executors.newSingleThreadExecutor();
		System.out.println(exec2.submit(getSum).get());
		
		getCompletableFutureSum();

	}
}
