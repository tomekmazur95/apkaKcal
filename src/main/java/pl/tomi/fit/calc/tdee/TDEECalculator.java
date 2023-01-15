package pl.tomi.fit.calc.tdee;


import org.springframework.stereotype.Component;

@Component
public class TDEECalculator {

    public long calculate(PersonalInformation personalInformation) {
        if (personalInformation.gender() == null || personalInformation.activity() == null) {
            throw new NullPointerException("fields cannot be empty");
        }
        double tdee = calculateBasalMetabolicRate(personalInformation) * personalInformation.activity().getFactor();
        return Math.round(tdee);
    }

    private double calculateBasalMetabolicRate(PersonalInformation personalInformation) {
        if (personalInformation.gender() == Gender.MALE) {
            return 66 + (13.7 * personalInformation.weight()) + (5 * personalInformation.height()) - (6.8 * personalInformation.age());
        }
        return 655 + (9.6 * personalInformation.weight()) + (1.8 * personalInformation.height()) - (4.7 * personalInformation.age());
    }
}
