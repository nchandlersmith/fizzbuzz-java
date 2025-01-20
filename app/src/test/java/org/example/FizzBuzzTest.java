package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FizzBuzzTest {
    @ParameterizedTest
    @MethodSource("valuesForIntegerAsString")
    void run_should_return_integer_as_string(int testValue, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.run(testValue);
        assertThat(result).isEqualTo(expected);
    }
    private static Stream<Arguments> valuesForIntegerAsString() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(4, "4"),
                Arguments.of(7, "7"),
                Arguments.of(8, "8")
        );
    }
}