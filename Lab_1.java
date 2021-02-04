package com.company;
import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input alpha:");
        float alpha = in.nextInt();
        float z_1 = (float) (1 - 2 * (Math.pow(Math.sin(alpha), 2)) / (1 + Math.sin(2 * alpha)));
        System.out.println(z_1);


    }

    }
