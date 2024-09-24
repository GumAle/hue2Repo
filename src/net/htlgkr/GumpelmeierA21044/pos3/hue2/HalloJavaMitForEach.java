package net.htlgkr.GumpelmeierA21044.pos3.hue2;

import java.util.ArrayList;
import java.util.List;

public class HalloJavaMitForEach {
    private List<String> stringList = new ArrayList<String>();

    public void printList() {
        stringList.add("java");
        stringList.add("python");

        for(int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        stringList.forEach(System.out::println);
    }
}
