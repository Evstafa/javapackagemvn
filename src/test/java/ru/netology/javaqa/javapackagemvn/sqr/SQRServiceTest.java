package ru.netology.javaqa.javapackagemvn.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.javapackagemvn.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcboundaryvalues() {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(10, 100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}
