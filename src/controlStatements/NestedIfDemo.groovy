package controlStatements

class NestedIfDemo {

    static void main(String[] args) {

        if (1 > 0) {
            println("Outer if block")
            if (1 > 2) {
                println("1 is greater than 0 and 1. 1 is less than 2")
            }
        }
        println("Out of if")
    }
}
