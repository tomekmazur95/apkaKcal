package pl.tomi.fit.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.tomi.fit.calc.Calculator.Activity;
import pl.tomi.fit.calc.Calculator.Calculator;
import pl.tomi.fit.calc.Calculator.User;

@SpringBootApplication
public class ApkadoKcalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApkadoKcalApplication.class, args);
        User user1 = new User(true, 100, 183, 27, Activity.MODERATELY_ACTIVE);
        Calculator calculator = new Calculator(user1);
        System.out.println(calculator.calculate());


    }

}
