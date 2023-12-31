package controlStatements

class BreakDemo {

    static void main(String[] args) {

        for (def i in 1..10) {

            if (i == 5)
                break
            println(i)
        }
    }
}
