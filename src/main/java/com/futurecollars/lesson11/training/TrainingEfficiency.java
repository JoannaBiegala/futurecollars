package com.futurecollars.lesson11.training;

public class TrainingEfficiency {
    int trainingLength;
    int numberOfCaloriesBurned;
    int averageHeartRate;
    int weightOfTrainingLength;
    int weightOfNumberOfCaloriesBurned;
    int weightOfAverageHeartRate;

    public TrainingEfficiency(int trainingLength, int numberOfCaloriesBurned, int averageHeartRate) {
        this.trainingLength = trainingLength;
        this.numberOfCaloriesBurned = numberOfCaloriesBurned;
        this.averageHeartRate = averageHeartRate;
        this.weightOfTrainingLength = getWeightOfTrainingLength();
        this.weightOfNumberOfCaloriesBurned = getWeightOfNumberOfCaloriesBurned();
        this.weightOfAverageHeartRate = getWeightOfAverageHeartRate();
    }

    public int getWeightOfTrainingLength() {
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

    public int getWeightOfNumberOfCaloriesBurned() {
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

    public int getWeightOfAverageHeartRate() {
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


    public String getTrainingEfficiency() {
        int totalWeight = weightOfTrainingLength + 2 * weightOfNumberOfCaloriesBurned + 3 * weightOfAverageHeartRate;
        double weightedAverage = totalWeight / 6;
        if (weightedAverage < 1.2) {
            return "Weighted Average - low";
        }
        if (weightedAverage >= 1.2 && weightedAverage < 2.0) {
            return "Weighted Average - good";
        }
        if (weightedAverage <= 2.0 && weightedAverage < 3.0) {
            return "Weighted Average - very good";
        }
        if (weightedAverage == 3) {
            return "Weighted Average - perfect";
        }
        return "Error";
    }

}
