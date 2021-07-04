package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumOfAllSalesForTheYear() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.allSalesSum(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void averageSalesPerMonth() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.averageSales(allSales);

        assertEquals(expected, actual);

    }

    @Test
    void maximumSalesPerMonth() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maximumSale(allSales);

        assertEquals(expected, actual);

    }

    @Test
    void minimumSalesPerMonth() {
        StatsService service = new StatsService();


        int expected = 9;
        int actual = service.minimumSale(allSales);

        assertEquals(expected, actual);

    }

    @Test
    void numberOfMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.monthBelowAverageSales(allSales);

        assertEquals(expected, actual);

    }

    @Test
    void numberOfMonthsWithUnderAverageSales() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.monthUnderAverageSales(allSales);

        assertEquals(expected, actual);

    }

}