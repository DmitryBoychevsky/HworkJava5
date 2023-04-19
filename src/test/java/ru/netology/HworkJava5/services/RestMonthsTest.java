package ru.netology.HworkJava5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestMonthsTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestMonths.csv")
    public void RestMonthsService(int income, int expenses, int threshold, int expected) {
        RestMonthsService service = new RestMonthsService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }

}
