package Collections

import javax.swing.Spring

class MapDemo {

    static void main(String[] args) {

        //Declare a Map
        def emptyMap = [:]
        println("The Map Values are : $emptyMap")

        def sampleMap = [language: "Groovy", category: "Programming"]
        println(sampleMap)

        //Adding value to Map

        sampleMap.put("Popularity", "Super")
        println(sampleMap)

        sampleMap << [License: "Apache"]
        println(sampleMap)

        //Retrieve the values from Map

        println(sampleMap.get("Popularity"))
        println(sampleMap["languages"])
        println(sampleMap.category)
        println(sampleMap."License")

        //Replace values
        sampleMap["language"] = "JAVA"
        println(sampleMap)

        sampleMap.language = "Python"
        println(sampleMap)

        sampleMap.put("language", "R")
        println(sampleMap)

        sampleMap << [language: "Groovy"]
        println(sampleMap)

        //Remove values
//        sampleMap.remove("language")
//        println(sampleMap)
//
//        sampleMap = sampleMap - [category: "Programming"]
//        println(sampleMap)
//
//        sampleMap -= [Popularity: "Super"]
//        println(sampleMap)

        //Size of the map
        println("The size of the map: ${sampleMap.size()}")

        //get All key from map as list
        def allkeys = sampleMap.keySet()
        println(allkeys)

        // Get all Values from map as list
        def allValues = sampleMap.values()
        println(allValues)

        // Adding duplicate values - can not add duplicate values
        sampleMap << [category: "Programming"]
        println(sampleMap)

        //Print map using for loop
//        for (int i = 0; i <= sampleMap.size(); i++) {
//            println(sampleMap[i])
//        }

        for (def map : sampleMap.keySet()) {
            println(map)
        }
    }
}
