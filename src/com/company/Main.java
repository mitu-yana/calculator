package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи число х");
        float numx = in.nextFloat();
        System.out.println("Введи число y");
        float numy = in.nextFloat();
        System.out.println("Введи число оператор ‘+’, ‘-’, ‘*’ или ‘/’.");
        String op = in.next();
        float rez = 0;
        switch(op) {
            case "+":
               rez = numx + numy;
                break;
            case "-":
                rez = numx - numy;
                break;
            case "*":
                rez = numx * numy;
                break;
            case "/":
                rez = numx / numy;
                break;
            default:
                System.out.println("введите правильный символ");
                break;
        }
        System.out.println(rez);
    }
}
