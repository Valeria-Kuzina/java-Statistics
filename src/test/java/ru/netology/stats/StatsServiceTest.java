package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSalesAmountForAllMonths() {
        int expected = 180;
        int actual = StatsService.salesAmount(months);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageForAllMonths() {
        double expected = 15.0;
        double actual = StatsService.average(months);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMaximumSalesForAllMonths() {
        int expected = 8;
        int actual = StatsService.monthMaximumSales(months);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMinimumSalesForAllMonths() {
        int expected = 9;
        int actual = StatsService.monthMinimumSales(months);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSalesBelowAverageForHowManyOfAllMonths() {
        int expected = 5;
        int actual = StatsService.salesBelowAverage(months);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSalesAboveAverageForHowManyOfAllMonths() {
        int expected = 5;
        int actual = StatsService.salesAboveAverage(months);
        assertEquals(expected, actual);
    }
}