package Opps.interfacedemo

class LuxuryCar implements Vehicle {

    static void main(String[] args) {

        LuxuryCar lc = new LuxuryCar()
        lc.seats()
        lc.wheels()
        lc.gears()
        lc.acOption()
    }

    @Override
    def seats() {
        println("This is 7 seats vehicles")
    }

    @Override
    def wheels() {
        println("This is 5 wheels vehicles")
    }

    @Override
    def gears() {
        println("This is auto gear vehicles")
    }

    @Override
    def acOption() {
        println("This is ac option vehicles")
    }
}
