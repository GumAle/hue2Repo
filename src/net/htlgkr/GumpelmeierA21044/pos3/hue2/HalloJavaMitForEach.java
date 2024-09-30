package net.htlgkr.GumpelmeierA21044.pos3.hue2;

import java.util.ArrayList;
import java.util.List;

public class HalloJavaMitForEach {
    private List<String> stringList = new ArrayList<String>();

    public void printList() {
        stringList.add("java");
        stringList.add("python");

        for(String s : stringList) {
            System.out.println(s);
        }

        stringList.forEach(s -> System.out.println(s));

        stringList.forEach(System.out::println);
    }
}
