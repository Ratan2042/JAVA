package com.Anshu;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Sum();
    }
    static void Sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum = " + sum);
    }
}
