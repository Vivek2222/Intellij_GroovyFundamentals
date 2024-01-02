package json

import groovy.json.JsonSlurper

class JsonSlurperColorsDemo {

    static void main(String[] args) {

        def jsonFile = new File("C:/Users/vpatil/IdeaProjects/GroovyDemo/src/Files/colors.json").text
        def jsonSlurper = new JsonSlurper()
        def content = jsonSlurper.parseText(jsonFile)

        def hexCodeList = []
        def typeContent = []

        content.colors.each {
            println(it.code.hex)
            hexCodeList << it.code.hex
        }
        println(hexCodeList)

        content.colors.each {
            println(it.code.hex)
            hexCodeList << it.code.hex
        }
        println(hexCodeList)
        println(hexCodeList[0])

        content.colors.each {
            typeContent << it.type
        }
        println(typeContent)
    }
}
