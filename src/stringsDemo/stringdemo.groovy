package stringsDemo

class stringdemo {

    static main(args){
        //java strings

        String strLiteral = "This is using new keyword"
        println strLiteral

        String strNew = new String("This is using new keyword")
        println strNew

        //Groovy Strings

        //***************** Single Quote ***************

        def singleQuoteString = 'This is single Quote String'
        println("Single Quote String: "+singleQuoteString)

        //**************** Triple Single Quote ***************

        def tripleSingleQuoteString = '''\
        This is Triple Single Quote String
        This is new line'''
        println("Triple Single Quote String: "+tripleSingleQuoteString)

        //**************** Double Quote ***************

        def sampleData = "Groovy"
        def doubleQuote = "This is double Quote String ${sampleData}" //Interpolation
        println(doubleQuote)
        //**************** Triple Double Quote ***************

        def tripleDoubleQuote = """This is double Quote String 
        This is a new line ${sampleData}""" //Interpolation
        println(tripleDoubleQuote)

        //**************** Slashy Quote ***************

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
