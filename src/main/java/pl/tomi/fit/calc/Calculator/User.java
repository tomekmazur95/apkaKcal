package pl.tomi.fit.calc.Calculator;

public class User {
    private boolean isMale;
    private double weight;
    private double height;
    private int age;
    private Activity activity;

    public User(boolean isMale, double weight, double height, int age, Activity activity) {
        this.isMale = isMale;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.activity = activity;
    }

    public boolean isMale() {
        return isMale;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public Activity getActivity() {
        return activity;
    }


}

