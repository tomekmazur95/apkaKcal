package pl.tomi.fit.calc.Calculator

import spock.lang.Specification

class CalculatorTest extends Specification {

    User userMock = Mock()

    Calculator calculator = new Calculator(userMock)

    def "test "() {
        given:
        userMock.isMale() >> true
        userMock.getWeight() >> 100
        userMock.getHeight() >> 183
        userMock.getAge() >> 27
        userMock.getActivity() >> Activity.MODERATELY_ACTIVE

        when:
        def result = calculator.calculate()
        then:
        result == 3359.4700000000003

    }


}
