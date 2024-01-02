package Properties

class ReadPropertiesFileDemo {

    static void main(String[] args) {

        def reader = new FileReader("C:/Users/vpatil/IdeaProjects/GroovyDemo/src/Files/data.properties")
        def properties = new Properties()

        properties.load(reader)
        println("The value of email is: " + properties.getProperty("email"))
        println("The value of email is: " + properties.getProperty("password"))
        println("The value of email is: " + properties.getProperty("phone"))
    }
}
