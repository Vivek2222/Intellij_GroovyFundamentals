package controlStatements

class ForDemo {

    static void main(String[] args) {

        for (def i = 0; i <= 10; i++) {
            println("The Value of i is: " + i)
        }
        println("-------------------------------------------------------")

        def languages = ["Groovy", "Java", "Python"]

        for (def i = 0; i < languages.size(); i++) {
            println("The languages is: " + languages[i])
        }

        for (def language : languages) {
            println(language)
        }

        println("--------------using Upto---------------------")

        0.upto(10) {
            println(it)
        }

        println("--------------Using Times---------------------")

        10.times {
            println(it)
        }

        println("--------------Using For---------------------")

        for (i in 1..10) {
            println(i)
        }

        println("--------------Groovy Foreach---------------------")

        languages = ["Groovy", "Java", "Python"]

        languages.each {
            println(it)
        }

        println("--------------Foreach---------------------")

        (0..10).each {
            println(it)
        }

        println("--------------Even numbers---------------------")

        for (def i = 0; i <= 10; i = i + 2) {
            println("The Value of i is: " + i)
        }

        println("--------------Step---------------------")

        0.step(10, 2) {// incrementing value by 2 started from 0
            println(it)
        }
    }
}
