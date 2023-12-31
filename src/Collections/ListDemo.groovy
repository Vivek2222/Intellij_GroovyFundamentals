package Collections

class ListDemo {
    static void main(String[] args) {

        //Declaration
        def languages = ["Groovy", "Java", "Python"] as List

        //Peint the list
        println(languages)

        //Size of my List
        def languageSize = languages.size()

        println("The Size of the language list is : " + languageSize)
        println("The Size of the language list is : $languageSize")
        //println("The Size of the language list is : $languages.size()")
        println("The Size of the language list is : ${languages.size()}")

        //Retrieve the value from list
        println("The first index value is : ${languages[1]}")

        //Add values to list
        languages.add("C#")
        println(languages)

        languages << "Ruby"
        println(languages)

        languages = languages.plus("Perl")
        println(languages)

        languages = languages + ["R"]
        println(languages)

        //Remove values from list
        languages.remove("C#")
        println(languages)

        languages.remove(3)
        println(languages)

        languages = languages.minus("Perl")
        println(languages)

        languages = languages - ["R"]
        println(languages)

        //Adding Duplicate values
        languages << "Groovy"
        languages << "Groovy"
        languages << "R"

        println(languages)

        //Counting the items
        println("The Count of R is : ${languages.count("Groovy")}")

        //Counting the items using closure
        println("""The count of R is : ${languages.count {
            it == "R"
        }}""")

        //Add the element using push method
        languages.push("C#")
        println(languages)

        //remove the element using pop method
        languages.pop()
        println(languages)

        //Compare two lists
        def languages1 = ["Goovy", "Java", "Python"]
        def languages2 = ["Goovy", "Java", "Python"]

        if (languages1 == languages2) {
            println("Both the lists are equal1")
        }
        def languages3 = ["Goovy", "Java", "Python", "C#"]
        if (languages2 == languages3) {
            println("Both the lists are equal")
        } else {
            println("Both the lists are not equal")
        }

        //Manipulate the lists
        def newlanguages = languages.collect {
            it + " Program"
        }
        println(newlanguages)

        //findAll Method
        println(languages.findAll {
            it.contains("G")
        })

        //print all the elements
        languages.each {
            println(it)
        }
    }
}
