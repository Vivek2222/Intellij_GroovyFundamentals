package datatypes

class ArraysDemo {

    static main(args){

        def languages = new String[3]

        //add the variables to this Array

        languages[0] = "Groovy"
        languages[1] = "Java"

        languages.putAt(2, "Python")

        //languages[3] = "c#"
        // Print the Array

        println languages

        //Size of the Array

        println("The Size of the array using size method: "+languages.size())
        println("The Size of the array using size method: "+languages.length)

        def arrayAfterRemovePython = languages - "Python"
        println((arrayAfterRemovePython))
    }
}
