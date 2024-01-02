package xml

import groovy.xml.XmlSlurper

class XmlSlurperPersonDemo {

    static main(args) {

        def books = new XmlSlurper().parse("./src/Files/books.xml")

        def authorlist = []

        books.book.each {
            println(it.author)
            authorlist << it.author
        }

        println(authorlist)

        println(authorlist[0])

        println(books.book.author.size())

        println(books.book[10].author)

        println("-----------------")

        def priceType = books.book.price.@type as List
        println(priceType)

        println("First book price type : ${books.book[0].price.@type}")

        println("-----------------")

        def rupeeInfo = books.book.'*'.findAll { node ->
            node.name() == 'price' && node.@type == 'rupee'
        } as List

        println(rupeeInfo)

        println("-----------------")

    }
}
