package Opps.abstractdemo

class Car extends Vehicle {

    static void main(String[] args) {
        Car c = new Car()
        c.seats()
        c.wheels()
        c.gears()
        c.powerWindows()
        c.acOption()
    }

    @Override
    def gears() {
        println("This is manual gear vehicle")
    }

    @Override
    def acOption() {
        println("No AC option")
    }

    def powerWindows() {
        println("No Power Windows")
    }
}
