package com.futurecollars.lesson11.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TrainingEfficiencyTest {

    @ParameterizedTest
    @CsvSource(value = {"30:400:165"}, delimiter = ':')
    void getTrainingEfficiency(int trainingLength, int numberOfCaloriesBurned, int averageHeartRate) {
        //when
        String trainingEfficiency = new TrainingEfficiency(trainingLength, numberOfCaloriesBurned, averageHeartRate).getTrainingEfficiency();
        //then
        Assertions.assertEquals("Weighted Average - very good", trainingEfficiency);
    }
}