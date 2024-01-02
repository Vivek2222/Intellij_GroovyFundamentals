package Collections

class SetDemo {

    static void main(String[] args) {

        def languages = ["Groovy", "Java", "Python"] as Set

        //Print Set
        println(languages)

        languages.each {
            println it
        }

        //Set Size
        println("The Size of the set is : ${languages.size()}")

        //retrives values from set
        println("The second values is : ${languages[2]}")

        //add values to set
        languages.add("C#")
        println(languages)

        languages << "Ruby"
        println(languages)

        languages = languages.plus("Perl")
        println(languages)

        languages = languages + ["PHP"]
        println(languages)

        //Remove values from Set
        languages.remove("PHP")
        println(languages)

        //Set will accept duplicate values
        languages << "Groovy"
        languages << "Groovy"
        println(languages)

        //Sorting Set
        languages = languages.sort()
        println(languages)

        //Compare Sets
        def languages1 = ["Groovy", "Java"] as Set
        def languages2 = ["Groovy", "Java", "C#"] as Set
        def languages3 = ["Groovy", "Java"] as Set

        if (languages1 == languages3) {
            println("Both the Sets are equal.")
        }

        if (languages1 == languages2) {
            println("Both the Sets are equal.")
        } else {
            println("Both the Sets are NOT equal.")
        }

        //Manipulate a set
        def newlanguages = languages.collect {
            it + " Program"
        }
        println(newlanguages)


        // finaAll Method

        println(languages.findAll {
            it.contains("o")
        })

        // Iterator in Set

        def iterator = newlanguages.iterator()

        while (iterator.hasNext()) {
            println(iterator.next())
        }

    }
}
