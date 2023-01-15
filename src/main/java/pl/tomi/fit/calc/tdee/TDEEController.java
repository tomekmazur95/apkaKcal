package pl.tomi.fit.calc.tdee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TDEEController {
    private final TDEECalculator TDEECalculator;

    @Autowired
    public TDEEController(TDEECalculator TDEECalculator) {
        this.TDEECalculator = TDEECalculator;
    }

    @PostMapping("/calories")
    public double countTDEE(@RequestBody PersonalInformation personalInformation){
       return  TDEECalculator.calculate(personalInformation);
    }

}
