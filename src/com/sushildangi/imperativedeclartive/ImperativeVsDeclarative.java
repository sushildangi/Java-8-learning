package com.sushildangi.imperativedeclartive;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        /**
         * Imperative -- How style of programming
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.err.println("Sum Using Imperative Approach : " + sum);

        /**
         * Declarative Style of programming - what style of programming
         */
        sum = IntStream.rangeClosed(0, 100).sum();
        System.err.println("Sum using Declarative Approach : " + sum);
    }
}
