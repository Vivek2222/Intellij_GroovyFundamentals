package Opps.abstractdemo

abstract class Vehicle {

    def static seats() {
        println("5 seats vehicle")
    }

    def static wheels() {
        println("4 wheels vehicle")
    }

    abstract def gears()

    abstract def acOption()

}
