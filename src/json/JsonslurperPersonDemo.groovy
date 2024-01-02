package json

import groovy.json.JsonSlurper

class JsonslurperPersonDemo {

    static main(args) {

        //def jsonFile = new File("C:/Users/vpatil/IdeaProjects/GroovyDemo/src/Files/person.json").text
        def jsonFile = new File("./src/Files/person.json").text
        def jsonSlurper = new JsonSlurper()
        def personData = jsonSlurper.parseText(jsonFile)

        personData.each {
            println(it.id)
        }

        println("----------------")

        personData.each {
            println(it.name.first_name)
        }

        println("----------------")

        println(personData.name.size())

        println("----------------")

        println(personData.name.first_name[2])

        println("----------------")

        println(personData.name[0].last_name)
    }
}
