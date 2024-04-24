package pro.sky.homework213.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.homework213.constant.CalcServiceImplTestConstants.*;
import static pro.sky.homework213.constant.CalcServiceImplTestConstants.DIVIDE_TEST4_NUM2;

public class CalcServiceImplParameterizedTest {

    private final CalcServiceImpl calcOut = new CalcServiceImpl();

    @ParameterizedTest
    @MethodSource("provideAddCorrectSource")
    void couldAddCorrect(String num1, String num2, String result) {
        Assertions.assertEquals(result, calcOut.add(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideMinusCorrectSource")
    void couldMinusCorrect(String num1, String num2, String result) {
        Assertions.assertEquals(result, calcOut.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideMultiplyCorrectSource")
    void couldMultiplyCorrect(String num1, String num2, String result) {
        Assertions.assertEquals(result, calcOut.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideDivideCorrectSource")
    void couldDivideCorrect(String num1, String num2, String result) {
        Assertions.assertEquals(result, calcOut.divide(num1, num2));
    }

    public static Stream<Arguments> provideAddCorrectSource() {
        return Stream.of(Arguments.of(PLUS_TEST1_NUM1, PLUS_TEST1_NUM2, PLUS_TEST1_RESULT),
                Arguments.of(PLUS_TEST2_NUM1, PLUS_TEST2_NUM2, PLUS_TEST2_RESULT),
                Arguments.of(PLUS_TEST3_NUM1, PLUS_TEST3_NUM2, PLUS_TEST3_RESULT),
                Arguments.of(PLUS_TEST4_NUM1, PLUS_TEST4_NUM2, PLUS_TEST4_RESULT));
    }

    public static Stream<Arguments> provideMinusCorrectSource() {
        return Stream.of(Arguments.of(MINUS_TEST1_NUM1, MINUS_TEST1_NUM2, MINUS_TEST1_RESULT),
                Arguments.of(MINUS_TEST2_NUM1, MINUS_TEST2_NUM2, MINUS_TEST2_RESULT),
                Arguments.of(MINUS_TEST3_NUM1, MINUS_TEST3_NUM2, MINUS_TEST3_RESULT),
                Arguments.of(MINUS_TEST4_NUM1, MINUS_TEST4_NUM2, MINUS_TEST4_RESULT));
    }

    public static Stream<Arguments> provideMultiplyCorrectSource() {
        return Stream.of(Arguments.of(MULTIPLY_TEST1_NUM1, MULTIPLY_TEST1_NUM2, MULTIPLY_TEST1_RESULT),
                Arguments.of(MULTIPLY_TEST2_NUM1, MULTIPLY_TEST2_NUM2, MULTIPLY_TEST2_RESULT),
                Arguments.of(MULTIPLY_TEST3_NUM1, MULTIPLY_TEST3_NUM2, MULTIPLY_TEST3_RESULT),
                Arguments.of(MULTIPLY_TEST4_NUM1, MULTIPLY_TEST4_NUM2, MULTIPLY_TEST4_RESULT));
    }

    public static Stream<Arguments> provideDivideCorrectSource() {
        return Stream.of(Arguments.of(DIVIDE_TEST1_NUM1, DIVIDE_TEST1_NUM2, DIVIDE_TEST1_RESULT),
                Arguments.of(DIVIDE_TEST2_NUM1, DIVIDE_TEST2_NUM2, DIVIDE_TEST2_RESULT),
                Arguments.of(DIVIDE_TEST3_NUM1, DIVIDE_TEST3_NUM2, DIVIDE_TEST3_RESULT),
                Arguments.of(DIVIDE_TEST4_NUM1, DIVIDE_TEST4_NUM2, DIVIDE_TEST4_RESULT));
    }

}
