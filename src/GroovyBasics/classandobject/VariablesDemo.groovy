package GroovyBasics.classandobject

class VariablesDemo {

    def instanceInt = 15

    def staticInt = 25

    static main(args) {


        //println("Local variable value is: " "+localInt)
        VariablesDemo localvar = new VariablesDemo()
        localvar.method()

        //Multiple Assignment
        def (a, b, c) = [10, 20, "groovy"]
        println("ä value is:" + a)
        println("b value is:" + b)
        println("c value is:" + c)
    }

    def method() {

        def localInt = 10
        println("Local variable balue is: " + localInt)
        println("Ïnstance variable value is: " + instanceInt)

    }
}
