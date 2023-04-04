package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long stats[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumSales(stats);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageSum(stats);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(stats);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(stats);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.lessAverageSales(stats);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.moreAverageSales(stats);
        Assertions.assertEquals(expected, actual);
    }
}
