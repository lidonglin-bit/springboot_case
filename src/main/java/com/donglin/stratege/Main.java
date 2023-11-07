package com.donglin.stratege;

import com.donglin.stratege.ByBus;
import com.donglin.stratege.ByDiDiExpress;
import com.donglin.stratege.BySharedBicycle;
import com.donglin.stratege.TrafficFeeCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(10);
        list.add(100);
        List<Integer> collect = list.stream().filter(x -> x > 8).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

}
