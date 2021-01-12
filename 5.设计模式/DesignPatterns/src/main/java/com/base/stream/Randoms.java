package com.base.stream;

import java.util.*;
import java.util.stream.Stream;

public class Randoms {

    public static void main(String[] args) {
        List<String> worldList= Arrays.asList("ab","cd","abcqwqwdefghigklmnopqrst");
        Stream<String> base=worldList.stream();
        Stream<String> longwords=base
                .filter(w->w.length()>12);
        longwords.forEach(System.out::println);
        base.forEach(System.out::println);//error
        Optional
    }

}
