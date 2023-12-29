package GroovyBasics.Method

class MethodwithOptionalParameter {

    static main(args) {
        MethodwithOptionalParameter option = new MethodwithOptionalParameter()
        option.addThreeNumbers(10, 20, 50)//First preference will give to this value
        option.addThreeNumbers(10, 10)
    }

    def addThreeNumbers(def firstvalue, def secondvalue, def thirdvalue = 30) {
        def total = firstvalue + secondvalue + thirdvalue
        println("The total value is : " + total)
    }
}
