package com.company;
import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input amount SIN(s):");
        double u = 0.1;
        int x = in.nextInt();
        double answer = 1;
        while(x != 0) {
            answer *= (1 + Math.sin(u));
            u += 0.1;
            x --;
        }
        System.out.printf("%.3f", answer);


    }

    }
