package org.example.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void printMessage(String message) {
        System.out.println("Message : " + message);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1);
        numbers = numbers.stream()
                .distinct()
                .limit(2)
                .collect(Collectors.toList());

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        numbers.forEach(System.out::println);
    }
}
