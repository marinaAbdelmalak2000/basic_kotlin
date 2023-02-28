package com.example.librarian

open class LibraryItem(
    var Title: String,
    var ISBN: String,
    var Publication: String,
    var NumberOfPages: Int

) {
   open var isAvail:Boolean = true
    fun isAvaliable(): Boolean{
         return isAvail
     }
}

class Book() : LibraryItem("title", "isbn", "publication", 10) {

    override var isAvail: Boolean=true

}

class Magazine() : LibraryItem("title", "isbn", "publication", 10) {
    override var isAvail: Boolean=true

}

class Journal() : LibraryItem("title", "isbn", "publication", 10) {
    override var isAvail: Boolean=true
}

open class Person(var Name: String, var ID: Int) {
}

class Librarian() : Person("marina", 0) {
    var Password: String = "pass"
}

class User(var Nameuser: String, var IDuser: Int) : Person(Nameuser, IDuser) {
    var Job: String = "job"
}

class LibraryDataBase() {
    var currentLibrarian: String = "owner liberary"
    var AvailableBook = mutableListOf<LibraryItem>()
    var borrowedBook = mutableMapOf<LibraryItem, User>()


    fun addBook(book: LibraryItem) {
        AvailableBook.add(book)
    }

    fun lendBook(book: LibraryItem, user: User) {
        if (book.isAvaliable()) {
            book.isAvail=false
            AvailableBook.remove(book)
            borrowedBook[book] = user
            println("done")
        } else {
            println("not found")
        }
    }

    fun viewAvailableBooks() {

        val listIterator = AvailableBook.listIterator()
        while (listIterator.hasNext()) {
            println(listIterator.next().Title)


        }
    }

    fun searchForABook(idBook: String) {
        var titleBook: LibraryItem? = null
        var check=true

        for (i in AvailableBook){
            if (i.ISBN == idBook) {
                titleBook = i
                check=false
                break
            }
        }
        if(check){
            println("not found")
        }
        else{
            println("${titleBook!!.Title } is found")
        }
    }

    fun recieveBookFromBorrower(book: LibraryItem) {
        if(!AvailableBook.contains(book)) {
            book.isAvail=true
            AvailableBook.add(book)
            borrowedBook.remove(book)
            println("Done ${book.Title}")
        }
        else{
            println("not borrow")
        }
    }
}

fun main() {

    var obj1=LibraryItem("Title","123","2000",50)
    var obj2=LibraryItem("Title1","522","2010",100)
    var obj3=LibraryItem("Title2","1223","2020",500)
    var obj4=LibraryItem("Title3","1293","2000",110)
    var obj5=LibraryItem("Title4","1237","2000",150)

    var user1=User("Marina",1)
    var user2=User("sherry",2)
    var user3=User("simon",3)
    var user4=User("toto",4)
    var user5=User("ooo",5)

    var objLiberary=LibraryDataBase()
    objLiberary.addBook(obj1)
    objLiberary.addBook(obj2)
    objLiberary.addBook(obj3)
    objLiberary.addBook(obj4)
    objLiberary.addBook(obj5)

    objLiberary.searchForABook("123")
    objLiberary.viewAvailableBooks()
    objLiberary.lendBook(obj1,user1)

    objLiberary.recieveBookFromBorrower(obj1)

}
