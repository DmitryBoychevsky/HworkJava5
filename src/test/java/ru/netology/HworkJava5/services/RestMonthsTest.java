package ru.netology.HworkJava5.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestMonthsTest {
    @Test
    public void RestMonthsService() {
        RestMonthsService service = new RestMonthsService();

        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold); // вызываем целевой метод
        Assertions.assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический)

    }

    @Test public void RestMonthsService2() {
        RestMonthsService service = new RestMonthsService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);// вызываем целевой метод:
        Assertions.assertEquals(expected, actual); // производим проверку (сравниваем ожидаемый и фактический)

    }
}