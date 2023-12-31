package Opps.interfacedemo

class Car implements Vehicle {

    static void main(String[] args) {
        Car c = new Car()
        c.acOption()
        c.gears()
        c.wheels()
        c.wheels()
    }

    @Override
    def seats() {
        println("This is 5 seats vehicles")
    }

    @Override
    def wheels() {
        println("This is 4 wheels vehicles")
    }

    @Override
    def gears() {
        println("This is manual gear vehicles")
    }

    @Override
    def acOption() {
        println("This is AC vehicles")
    }
}
