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

    def calculus() {
        println("Calculus Functions")
    }

    def statistics() {
        println("Statistics Functions")
    }
}
