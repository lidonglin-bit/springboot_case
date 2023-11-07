package com.donglin.utils;

import java.util.*;

public class TestServiceLoader{

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();
        String camelCaseString = "camelCaseString";
        String underScoreString = camelCaseString.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
        System.out.println(underScoreString);



//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String ele=iterator.next();
//            if(ele.equals("1")) //（1）处
//                iterator.remove(); //(2)处
//        }
//        System.out.println(list);
    }
}