package ru.mirea.lab10;

import java.util.Scanner;

public class Task7 {
    public static int Divisions(int n, int division) {
        if (division*2 == n)
            return division*2;
        if (n % division == 0)
            System.out.println(division);
        return Divisions(n, division+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Divisions(n, 2));
    }
}