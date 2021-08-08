package com.dhivakar.learningproject.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Sum_OR_DifferenceTest {


    @ParameterizedTest
    @CsvSource({"1,2,3","2,1,1"})
    void getRequiredSum(int value1, int value2,int expected) {

        Sum_OR_Difference sum_or_difference=new Sum_OR_Difference();

        Assertions.assertEquals(expected,sum_or_difference.getRequiredSum(value1,value2));
    }
}