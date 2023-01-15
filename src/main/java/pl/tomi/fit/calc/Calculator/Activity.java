package pl.tomi.fit.calc.Calculator;

public enum Activity {

    SEDENTARY(1.2),
    LIGHTLY_ACTIVE(1.375),
    MODERATELY_ACTIVE(1.55),
    VERY_ACTIVE(1.725),
    EXTRA_ACTIVE(1.9);

    private double calories;

    Activity(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

}
