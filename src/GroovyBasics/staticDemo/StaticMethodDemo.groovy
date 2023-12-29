package GroovyBasics.staticDemo

class StaticMethodDemo {

    def num = 10
    static staticNum = 20

    static main(args) {

        StaticMethodDemo staticMethodDemo = new StaticMethodDemo()
        staticMethodDemo.sum() //for non-static method need to create the object

        staticSum() //directly call the static method inside the static main
    }

    def sum() {
        println(num + num)
    }

    def static staticSum() {
        println(staticNum + staticNum + 10)
    }
}
