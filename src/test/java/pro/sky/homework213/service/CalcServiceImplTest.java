package pro.sky.homework213.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.homework213.constant.CalcServiceImplTestConstants.*;
import static pro.sky.homework213.constant.CalcServiceImplTestConstants.DIVIDE_TEST4_RESULT;

class CalcServiceImplTest {

    private final CalcServiceImpl calcOut = new CalcServiceImpl();

    @Test
    void add() {
        Assertions.assertEquals(PLUS_TEST1_RESULT, calcOut.add(PLUS_TEST1_NUM1, PLUS_TEST1_NUM2));
        Assertions.assertEquals(PLUS_TEST2_RESULT, calcOut.add(PLUS_TEST2_NUM1, PLUS_TEST2_NUM2));
        Assertions.assertEquals(PLUS_TEST3_RESULT, calcOut.add(PLUS_TEST3_NUM1, PLUS_TEST3_NUM2));
        Assertions.assertEquals(PLUS_TEST4_RESULT, calcOut.add(PLUS_TEST4_NUM1, PLUS_TEST4_NUM2));
    }

    @Test
    void minus() {
        Assertions.assertEquals(MINUS_TEST1_RESULT, calcOut.minus(MINUS_TEST1_NUM1, MINUS_TEST1_NUM2));
        Assertions.assertEquals(MINUS_TEST2_RESULT, calcOut.minus(MINUS_TEST2_NUM1, MINUS_TEST2_NUM2));
        Assertions.assertEquals(MINUS_TEST3_RESULT, calcOut.minus(MINUS_TEST3_NUM1, MINUS_TEST3_NUM2));
        Assertions.assertEquals(MINUS_TEST4_RESULT, calcOut.minus(MINUS_TEST4_NUM1, MINUS_TEST4_NUM2));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(MULTIPLY_TEST1_RESULT, calcOut.multiply(MULTIPLY_TEST1_NUM1, MULTIPLY_TEST1_NUM2));
        Assertions.assertEquals(MULTIPLY_TEST2_RESULT, calcOut.multiply(MULTIPLY_TEST2_NUM1, MULTIPLY_TEST2_NUM2));
        Assertions.assertEquals(MULTIPLY_TEST3_RESULT, calcOut.multiply(MULTIPLY_TEST3_NUM1, MULTIPLY_TEST3_NUM2));
        Assertions.assertEquals(MULTIPLY_TEST4_RESULT, calcOut.multiply(MULTIPLY_TEST4_NUM1, MULTIPLY_TEST4_NUM2));
    }

    @Test
    void divide() {
        Assertions.assertEquals(DIVIDE_TEST1_RESULT, calcOut.divide(DIVIDE_TEST1_NUM1, DIVIDE_TEST1_NUM2));
        Assertions.assertEquals(DIVIDE_TEST2_RESULT, calcOut.divide(DIVIDE_TEST2_NUM1, DIVIDE_TEST2_NUM2));
        Assertions.assertEquals(DIVIDE_TEST3_RESULT, calcOut.divide(DIVIDE_TEST3_NUM1, DIVIDE_TEST3_NUM2));
        Assertions.assertEquals(DIVIDE_TEST4_RESULT, calcOut.divide(DIVIDE_TEST4_NUM1, DIVIDE_TEST4_NUM2));

    }

    @Test
    void divideShell() {
        Assertions.assertEquals(DIVIDE_SHELL_TEST1_RESULT, calcOut.divideShell(DIVIDE_SHELL_TEST1_NUM1, DIVIDE_SHELL_TEST1_NUM2));
        Assertions.assertEquals(DIVIDE_SHELL_TEST2_RESULT, calcOut.divideShell(DIVIDE_SHELL_TEST2_NUM1, DIVIDE_SHELL_TEST2_NUM2));
    }

}
