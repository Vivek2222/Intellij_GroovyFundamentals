package Opps.abstractdemo

abstract class Vehicle {

    def seats() {
        println("5 seats vehicle")
    }

    def wheels() {
        println("4 wheels vehicle")
    }

    abstract def gears()

    abstract def acOption()

}
