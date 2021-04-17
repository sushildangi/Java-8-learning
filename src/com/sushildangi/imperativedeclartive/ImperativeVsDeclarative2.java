package com.sushildangi.imperativedeclartive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarative2 {
    public static void main(String[] args) {
        List<Integer> integerList =
                Arrays.asList(1, 2, 3, 4, 5, 6, 1, 3, 4, 3, 5, 6, 7, 8, 9, 5, 9);
        /**
         * Imperative
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (int integer : integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }
        System.out.println("Unique List : " + uniqueList);

        /**
         * Declarative
         */
        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique List : " + uniqueList1);
    }
}
