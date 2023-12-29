package GroovyBasics.Arrays

class ArraysDemo {
    static void main(String[] args) {
        def languages = new String[3]

        //Add the values to this Array
        languages[0] = "Groovy"
        languages[1] = "Java"

        languages.putAt(2, "Python")

        //languages[3] = "C#" //Index out of bound issue

        //Print the Array
        println(languages)

        //Size of the Array
        println("The size of the array using size method: " + languages.size())
        println("The size of the array using length method: " + languages.length)

        //Remove value from the array
        def arrayAfterRemovePython = languages - "Python"
        println(arrayAfterRemovePython)
    }
}
