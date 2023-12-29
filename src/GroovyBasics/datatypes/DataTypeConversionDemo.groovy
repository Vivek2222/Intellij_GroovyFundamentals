package GroovyBasics.datatypes

class DataTypeConversionDemo {

    static main(args) {

        def charvalue = 65 as char
        println(charvalue)

        def strNumber = "100" as int
        int a = strNumber + 10
        println(a)
        println(strNumber)

        def doubleValue = 10.125411256425 as float
        println(doubleValue)

    }

}

