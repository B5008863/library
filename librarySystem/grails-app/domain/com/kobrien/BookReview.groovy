package com.kobrien

class BookReview {

	Book book

	Date dateMade

	Student student

	String review

	String toString()

	{book}



    static constraints = {

	book blank:false, nullable:false

	dateMade blank:false, nullable:false
	
	student blank:false, nullable:false

	review blank:false, nullable:false
    }
}
