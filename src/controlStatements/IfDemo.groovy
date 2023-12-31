package controlStatements

class IfDemo {

    static void main(String[] args) {

        if (1 < 0) {
            println("I am in if block.")
        }

        println("I am out of if block.")

        println("*******************************************************")

        if (-1 < 0) {
            println("I am in if block.")
        }

        println("I am out of if block.")
    }
}
