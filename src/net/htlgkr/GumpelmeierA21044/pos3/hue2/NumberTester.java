package net.htlgkr.GumpelmeierA21044.pos3.hue2;

import net.htlgkr.GumpelmeierA21044.pos3.hue2.interfaces.NumberTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberTester {

    private String filename;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private List<int[]> testCases;

    public NumberTester(String filename) {
        testCases = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int numberOfTests = Integer.parseInt(reader.readLine().trim());

            for (int i = 0; i < numberOfTests; i++) {
                String[] line = reader.readLine().trim().split("\\s+");
                int testType = Integer.parseInt(line[0]);
                int number = Integer.parseInt(line[1]);
                testCases.add(new int[]{testType, number});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {

    }
}