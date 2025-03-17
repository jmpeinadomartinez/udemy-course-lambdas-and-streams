package com.debuggeando_ideas.pallalel_streams;

import java.util.List;

public class ParallelStream {

    //-D java.util.concurrent.ForkJoinPool.common.parallelism=5    // por defecto, el pull es de 9
    public static void main(String[] args) {

    	List<Integer> numbers = List.of(1,2,3,4,5);
    	numbers.stream().forEach(v -> System.out.println(v + " - " + Thread.currentThread().getName()));
    }
}
