package com.futurecollars.lesson11.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TrainingEffectivenessCheckerTest {

    @ParameterizedTest
    @CsvSource(value = {"0:0:0", "10:100:100"}, delimiter = ':')
    void shouldBeLowTrainingEffectiveness(int trainingLength, int numberOfCaloriesBurned, int averageHeartRate) {
        //when
        String trainingEfficiency =
                new TrainingEffectivenessChecker(trainingLength, numberOfCaloriesBurned, averageHeartRate).getLevelOfTrainingEffectiveness();
        //then
        Assertions.assertEquals("Training - low", trainingEfficiency);
    }

    @ParameterizedTest
    @CsvSource(value = {"65:310:150", "75:310:150"}, delimiter = ':')
    void shouldBeGoodTrainingEffectiveness(int trainingLength, int numberOfCaloriesBurned, int averageHeartRate) {
        //when
        String trainingEfficiency =
                new TrainingEffectivenessChecker(trainingLength, numberOfCaloriesBurned, averageHeartRate).getLevelOfTrainingEffectiveness();
        //then
        Assertions.assertEquals("Training - good", trainingEfficiency);
    }

    @ParameterizedTest
    @CsvSource(value = {"30:400:165", "34:420:162"}, delimiter = ':')
    void shouldBeVeryGoodTrainingEffectiveness(int trainingLength, int numberOfCaloriesBurned, int averageHeartRate) {
        //when
        String trainingEfficiency =
                new TrainingEffectivenessChecker(trainingLength, numberOfCaloriesBurned, averageHeartRate).getLevelOfTrainingEffectiveness();
        //then
        Assertions.assertEquals("Training - very good", trainingEfficiency);
    }

    @ParameterizedTest
    @CsvSource(value = {"300000:4000000:165000", "340000:42000:162000"}, delimiter = ':')
    void shouldBePerfectTrainingEffectiveness(int trainingLength, int numberOfCaloriesBurned, int averageHeartRate) {
        //when
        String trainingEfficiency =
                new TrainingEffectivenessChecker(trainingLength, numberOfCaloriesBurned, averageHeartRate).getLevelOfTrainingEffectiveness();
        //then
        Assertions.assertEquals("Training - perfect", trainingEfficiency);
    }

}