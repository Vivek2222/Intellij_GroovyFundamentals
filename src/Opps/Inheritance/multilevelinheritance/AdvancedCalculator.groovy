package Opps.Inheritance.multilevelinheritance

class AdvancedCalculator extends Calculator {

    static void main(String[] args) {

        AdvancedCalculator ac = new AdvancedCalculator()
        ac.add()
        ac.subtract()
        ac.multiply()
        ac.divide()

        println(ac.brand)
        println(ac.solorPowered)
    }

    def static multiply() {
        println("Multiplying Numbers")
    }

    def static divide() {
        println("Dividing the numbers")
    }
}
