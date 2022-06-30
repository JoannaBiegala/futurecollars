package com.futurecollars.lesson11.training;

public class TrainingEffectivenessChecker {
    private final int trainingLength;
    private final int numberOfCaloriesBurned;
    private final int averageHeartRate;

    public TrainingEffectivenessChecker(int trainingLength, int numberOfCaloriesBurned, int averageHeartRate) {
        this.trainingLength = trainingLength;
        this.numberOfCaloriesBurned = numberOfCaloriesBurned;
        this.averageHeartRate = averageHeartRate;
    }

    private int getWeightOfTrainingLength() {
        if (trainingLength < 30) {
            return 1;
        } else if (trainingLength <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    private int getWeightOfNumberOfCaloriesBurned() {
        if (numberOfCaloriesBurned <= 300) {
            return 1;
        } else if (numberOfCaloriesBurned < 400) {
            return 2;
        } else {
            return 3;
        }
    }

    private int getWeightOfAverageHeartRate() {
        if (averageHeartRate < 160) {
            return 1;
        } else if (averageHeartRate <= 175) {
            return 2;
        } else {
            return 3;
        }
    }

    public String getLevelOfTrainingEffectiveness() {
        int totalWeight = getWeightOfTrainingLength() + 2 * getWeightOfNumberOfCaloriesBurned()
                + 3 * getWeightOfAverageHeartRate();
        double weightedAverage = totalWeight / 6.0;
        if (weightedAverage < 1.2) {
            return "Training - low";
        } else if (weightedAverage < 2.0) {
            return "Training - good";
        } else if (weightedAverage < 3.0) {
            return "Training - very good";
        } else {
            return "Training - perfect";
        }
    }

}
