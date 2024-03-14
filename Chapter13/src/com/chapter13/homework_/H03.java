package com.chapter13.homework_;

public class H03 {
    public static void main(String[] args) {
        String s = "Hello, World! 123";
        countChars(s);
    }

    public static void countChars(String s) {
        int numUpper = 0, numLower = 0, numDigits = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                numUpper++;
            } else if (Character.isLowerCase(c)) {
                numLower++;
            } else if (Character.isDigit(c)) {
                numDigits++;
            }
        }

        System.out.println("大写字母: " + numUpper);
        System.out.println("小写字母: " + numLower);
        System.out.println("数字: " + numDigits);
    }
}

