package net.htlgkr.GumpelmeierA21044.pos3.hue2;

import net.htlgkr.GumpelmeierA21044.pos3.hue2.interfaces.NumberTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class NumberTester {

    private String filename;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int n = Integer.parseInt(reader.readLine()); // Anzahl der Testfälle
            for (int i = 0; i < n; i++) {
                String[] parts = reader.readLine().split(" ");
                int testType = Integer.parseInt(parts[0]);
                int number = Integer.parseInt(parts[1]);

                switch (testType) {
                    case 1:
                        System.out.println(oddTester.testNumber(number) ? "EVEN" : "ODD");
                        break;
                    case 2:
                        System.out.println(primeTester.testNumber(number) ? "PRIME" : "NO PRIME");
                        break;
                    case 3:
                        System.out.println(palindromeTester.testNumber(number) ? "PALINDROME" : "NO PALINDROME");
                        break;
                }
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