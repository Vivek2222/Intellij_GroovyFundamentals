package controlStatements

class WhileDemo {

    static void main(String[] args) {

        def i = 1

        while (i < 10) {
            println("The value of i is: " + i)
            i++
        }

        println("***********************************************")
        while (i > 10) {        //loop will not go inside the condition
            println("The value of i is: " + i)
            i++
        }
    }
}
