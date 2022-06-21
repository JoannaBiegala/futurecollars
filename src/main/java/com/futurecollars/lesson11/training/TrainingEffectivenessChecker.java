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
        }
        if (trainingLength >= 30 && trainingLength <= 60) {
            return 2;
        }
        if (trainingLength > 60) {
            return 3;
        }
        return 0;
    }

    private int getWeightOfNumberOfCaloriesBurned() {
        if (numberOfCaloriesBurned <= 300) {
            return 1;
        }
        if (numberOfCaloriesBurned > 300 && numberOfCaloriesBurned < 400) {
            return 2;
        }
        if (numberOfCaloriesBurned >= 400) {
            return 3;
        }
        return 0;
    }

    private int getWeightOfAverageHeartRate() {
        if (averageHeartRate < 160) {
            return 1;
        }
        if (averageHeartRate >= 160 && averageHeartRate <= 175) {
            return 2;
        }
        if (averageHeartRate > 175) {
            return 3;
        }
        return 0;
    }


    public String getLevelOfTrainingEffectiveness() {
        int totalWeight = getWeightOfTrainingLength() + 2 * getWeightOfNumberOfCaloriesBurned()
                + 3 * getWeightOfAverageHeartRate();
        double weightedAverage = totalWeight / 6.0;
        if (weightedAverage < 1.2) {
            return "Training - low";
        }
        if (weightedAverage >= 1.2 && weightedAverage < 2.0) {
            return "Training - good";
        }
        if (weightedAverage >= 2.0 && weightedAverage < 3.0) {
            return "Training - very good";
        }
        if (weightedAverage == 3) {
            return "Training - perfect";
        }
        return "Error: Weighted Average is off scale";
    }

}
