package GroovyBasics.stringsDemo

class stringdemo {

    static main(args) {

        //java strings

        String strLiteral = "This is String Literals"
        println strLiteral

        String strNew = new String("This is using new keyword")
        println strNew

        //Groovy Strings

        //***************** Single Quote ***************

        def singleQuoteString = 'This is single Quote String'
        println("Single Quote String: " + singleQuoteString)

        //**************** Triple Single Quote ***************

        //Single slash using to remove the empty space
        def tripleSingleQuoteString = '''\
        This is Triple Single Quote String
        This is new line'''
        println("Triple Single Quote String: " + tripleSingleQuoteString)

        //**************** Double Quote ***************

        def sampleData = "Groovy"
        def doubleQuote = "This is double Quote String ${sampleData}" //Interpolation
        println(doubleQuote)

        //**************** Triple Double Quote ***************

        def tripleDoubleQuote = """This is double Quote String 
        This is a new line ${sampleData}""" //Interpolation
        println(tripleDoubleQuote)

        //**************** Slashy Quote ***************
        //You cannot use slash in the slashy quotes
        def slashyString = /This is slashy String
        This is new line
        ${sampleData}/
        println(slashyString)

        //**************** Dollar Slashy Quote ***************

        def dollarSlashyString = $/This is dollar slashy String/
        This is new line
        ${sampleData}/$
        println(dollarSlashyString)
    }
}