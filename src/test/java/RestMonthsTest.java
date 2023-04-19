import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestMonthsTest {
    @Test
    public void RestMonthsService() {
        RestMonthsService servece = new RestMonthsService();

        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int expected = 3;

        // вызываем целевой метод:
        int actual = servece.calculate(income, expenses, threshold);
       Assertions.assertEquals(expected, actual);


    }


}
