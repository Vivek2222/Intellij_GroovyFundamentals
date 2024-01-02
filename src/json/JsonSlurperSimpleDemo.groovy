package json

import groovy.json.JsonSlurper

class JsonSlurperSimpleDemo {

    static void main(String[] args) {

        def jasonSlurper = new JsonSlurper()

        def datatypes = jasonSlurper.parseText('''
           {
                "numeric":{
                "int": "10"
                },
                "float":"0.0f",
                "double": "0.0d",
                "boolean": true
           }''')
        println("The integer value is: ${datatypes.numeric.int}")
        println("The integer value is: ${datatypes.boolean}")
        println("The integer value is: ${datatypes.float}")
    }
}
