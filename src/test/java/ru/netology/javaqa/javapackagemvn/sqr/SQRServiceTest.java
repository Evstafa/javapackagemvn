package ru.netology.javaqa.javapackagemvn.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.javapackagemvn.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int expected = 10;
        int actual = service.calcSqrt(99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();
        int expected = 10;
        int actual = service.calcSqrt(50);
        Assertions.assertEquals(expected, actual);
    }
}
