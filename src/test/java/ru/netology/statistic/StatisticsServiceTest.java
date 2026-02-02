package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenMaxIsFirst() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsInMiddle() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 5, 8, 4, 5, 30, 8, 6, 11, 11, 12};
        long expected = 30;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxIsLast() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 120};
        long expected = 120;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllElementsAreSame() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {15, 15, 15, 15};
        long expected = 15;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenArrayHasNegativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-10, -5, -8, -4, -1};
        long expected = -1;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7};
        long expected = 7;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void findMaxWhenFirstIsMaximumAndConditionIsAlwaysFalse() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {100, 50, 25, 10, 5};
        long expected = 100;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}