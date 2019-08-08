package com.home.organaizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0, c = 0;
        try {
            System.out.println("Введите первое число:");
            a = Integer.parseInt(reader.readLine());
            System.out.println("Введите второе число:");
            b = Integer.parseInt(reader.readLine());
            System.out.println("Введите третье число:");
            c = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        int n = 0;
        int m = 0;
        if (a > 0) n++;
        else if (a < 0) m++;
        if (b > 0) n++;
        else if (b < 0) m++;
        if (c > 0) n++;
        else if (c < 0) m++;
        System.out.println("количество положительных чисел: " + n);
        System.out.println("количество отрицательных чисел: " + m);
    }

}
