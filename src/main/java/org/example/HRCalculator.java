package org.example;

public class HRCalculator {

    public static int calculateMaxHR(int age) {
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age");
        }
        return 220 - age;
    }

    public static String getWorkoutZone(int age, int bpm) {
        int maxHR = calculateMaxHR(age);
        double pct = (double) bpm / maxHR;

        if (pct < 0.5) return "Warm-up";
        else if (pct < 0.6) return "Fat Burn";
        else if (pct < 0.7) return "Cardio";
        else if (pct < 0.8) return "Endurance";
        else if (pct < 0.9) return "Anaerobic";
        else return "Maximum";
    }
}
