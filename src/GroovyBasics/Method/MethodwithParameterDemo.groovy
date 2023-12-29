package GroovyBasics.Method

class MethodwithParameterDemo {

    static main(args) {
/*      def a = 10
        def b = 20
        def c = 30
        def d = a+b+c
        println("The value of a, b and c is: "+d)
        def(e,f,g) = [40,50,60]
        def h = e+f+g
        println("The value of h is : "+h)*/

        MethodwithParameterDemo totalthree = new MethodwithParameterDemo()
        totalthree.methodwithparameters(10, 20, 30)
        totalthree.methodwithparameters(40, 50, 60)
        totalthree.methodwithparameters(40, 50, 'a')
        totalthree.methodwithparameters(40, 10)
    }

    def methodwithparameters(def firstvalue, def secondvalue, def thirdvalue) {
        def total = firstvalue + secondvalue + thirdvalue
        println("The total value is : " + total)
    }
}