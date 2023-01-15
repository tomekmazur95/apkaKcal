package pl.tomi.fit.calc.tdee;

public enum Activity {

    SEDENTARY(1.2),
    LIGHTLY_ACTIVE(1.375),
    MODERATELY_ACTIVE(1.55),
    VERY_ACTIVE(1.725),
    EXTRA_ACTIVE(1.9);

    private final double factor;

    Activity(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }

}
