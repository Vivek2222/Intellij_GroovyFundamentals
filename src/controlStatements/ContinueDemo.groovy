package controlStatements

class ContinueDemo {

    static void main(String[] args) {

        for (def i in 1..10) {
            if (i == 5)
                continue
            println(i)
        }
    }
}
