package com.company;

public class Main {

    public static void main(String[] args) {

        byte byteNum = 25;
        short shortNum = 75;
        int intNum = 100;
        long longNum = 50000 + (10 *(byteNum + shortNum + intNum));

        System.out.println(longNum);
    }
}
