package pl.tomi.fit.calc.Calculator;


public class Calculator {
    private final User user;

    public Calculator(User user) {
        this.user = user;
    }

    public double calculate() {

        if (user.isMale()) {
            double v = 66 + (13.7 * user.getWeight()) + (5 * user.getHeight()) - (6.8 * user.getAge());
            double v1 = activityIncluding();
            double result = v * v1;
            return result;
        } else {
            double v = 655 + (9.6 * user.getWeight()) + (1.8 * user.getHeight()) - (4.7 * user.getAge());
            double v1 = activityIncluding();
            double result = v * v1;
            return result;
        }
    }

    private double activityIncluding() {
        return user.getActivity().getCalories();
    }


}
