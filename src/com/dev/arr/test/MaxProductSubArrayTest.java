package com.dev.arr.test;

import com.dev.arr.MaxProductSubArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.sql.Array;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProductSubArrayTest {

   // @MethodSource("provideMaxProductSubArrayTestCases");
    @DisplayName("Max Product Subarray Test Cases")
    void testMaxProductSubArray(int[] arr, int expected){
        int actual = MaxProductSubArray.maxProductSubArray(arr);
        if(actual != expected){
            throw new RuntimeException("Test case failed");
        }
        assertEquals(expected, actual,"Expected and Acutal products shoule be equals");

    }

    private static Stream<Arguments> provideMaxProductSubArrayTestCases(){
        return Stream.of(
                Arguments.of(new int[]{2,3,-2,4}, 6),
                Arguments.of(new int[]{-2,0,-1}, 0),
                Arguments.of(new int[]{-2,3,-4}, 24)
        );
    }
}
