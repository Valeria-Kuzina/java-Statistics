package ru.netology.stats;

public class StatsService {

    public static int salesAmount(int[] months) {
        int sum = 0;
        for (int i = 0; i < months.length; i++) {
            sum += months[i];
        }
        return sum;
    }

    public static double average(int[] months) {
        int sum = 0;
        for (int i = 0; i < months.length; i++) {
            sum += months[i];
        }
        return sum / months.length;
    }

    public static String monthMaximumSales(int[] months) {
        int max = 0;
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < months.length; i++) {
            if (max == months[i]) {
                count2 = i + 1;
            }
            if (max < months[i]) {
                max = months[i];
                count = i + 1;
            }
        }
        return (String) (count + ", " + count2);
    }

    public static int monthMinimumSales(int[] months) {
        int min = months[0];
        int count = 0;
        for (int i = 0; i < months.length; i++) {
            if (min > months[i]) {
                min = months[i];
                count = i + 1;
            }
        }
        return count;
    }

    public static int salesBelowAverage(int[] months, double average) {
        int count = 0;
        for (int i = 0; i < months.length; i++) {
            if (average > months[i]) count++;
        }
        return count;
    }

    public static int salesAboveAverage(int[] months, double average) {
        int count = 0;
        for (int i = 0; i < months.length; i++) {
            if (average < months[i]) count++;
        }
        return count;
    }
}

