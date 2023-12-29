package GroovyBasics.Method

class SimpleMethodDemo {

    static main(args) {
        SimpleMethodDemo sumnum = new SimpleMethodDemo()
        sumnum.simpleMethod()

    }

    def simpleMethod() {
        int a = 10
        int b = 20
        int c = a + b
        println("The sum of a and b is: " + c)
    }
}
