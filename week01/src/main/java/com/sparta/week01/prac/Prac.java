package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        System.out.println("안녕, 스파르타!");
        List<String> myList = new ArrayList<>();
        String course1 = "Web Spring";
        String course2 = "Frontend React";
        myList.add(course1);
        myList.add(course2);
        System.out.println(myList);
    }
}
