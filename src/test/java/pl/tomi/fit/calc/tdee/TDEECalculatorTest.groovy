package pl.tomi.fit.calc.tdee


import spock.lang.Specification

class TDEECalculatorTest extends Specification {

    TDEECalculator calculator = new TDEECalculator();

    def "test for happy path "() {
        given:
        def personalInformation = new PersonalInformation(gender, weight, height, age, activity)

        when:
        def actualResult = calculator.calculate(personalInformation)

        then:
        expectedResult == actualResult

        where:
        gender        | weight | height | age | activity              | expectedResult
        Gender.FEMALE | 60     | 170    | 20  | Activity.EXTRA_ACTIVE | 2742l
        Gender.MALE   | 120    | 180    | 29  | Activity.VERY_ACTIVE  | 4162l
        Gender.FEMALE | 85     | 190    | 38  | Activity.VERY_ACTIVE  | 2819l
        Gender.MALE   | 90     | 180    | 18  | Activity.SEDENTARY    | 2492l
    }

    def "test for null fields, should throw exception"() {
        given:
        def personalInformation = new PersonalInformation(gender, 100, 135, 20, activity)

        when:
        def actualResult = calculator.calculate(personalInformation)

        then:
        def expectedResult = thrown(NullPointerException)
        expectedResult.message == "fields cannot be empty"

        where:
        gender        | activity
        null          | null
        null          | Activity.SEDENTARY
        Gender.MALE   | null
    }

}
