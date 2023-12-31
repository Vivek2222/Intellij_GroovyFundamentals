package Opps.Inheritance.multilevelinheritance

class ScientificCalculator extends AdvancedCalculator {

    static void main(String[] args) {

        ScientificCalculator sc = new ScientificCalculator()
        sc.add()
        sc.subtract()
        sc.multiply()
        sc.divide()
        sc.statistics()
        sc.calculus()

    }

    def static calculus() {
        println("Calculus Functions")
    }

    def static statistics() {
        println("Statistics Functions")
    }
}
