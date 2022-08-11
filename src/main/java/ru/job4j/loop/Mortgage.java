package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double credit = amount * (1 + percent / 100);
        while (credit > 0) {
            credit = (credit - salary) * (1 + percent / 100);
            year++;
        }
        return year;
    }
}