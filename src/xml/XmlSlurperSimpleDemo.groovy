package xml

import groovy.xml.XmlSlurper

class XmlSlurperSimpleDemo {

    static void main(String[] args) {

        def stringXML = '''
               <person>
                    <firstName>Sample</firstName>
                    <lastName>Name</lastName>
                    <id>111</id>
               </person>
         '''

        def person = new XmlSlurper().parseText(stringXML)

        println(person.firstName)
        println(person.lastName)
        println(person.id)

    }
}
