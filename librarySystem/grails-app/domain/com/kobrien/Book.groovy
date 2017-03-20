package com.kobrien

class Book {

	String title
	
	String subject

	String author

	String isbn

	int dateBorrowed

	int returnDate

	String student

	String overdue
	
    static constraints = {

	title blank:false, nullable:false

	subject blank:false, nullable:false

	author blank:false, nullable:false

	isbn blank:false, nullable:false

	dateBorrowed blank:false, nullable:false, min=6, max=10

	returnDate blank:false, nullable:false, min=6, max=10

	student blank:false, nullable:false

	overdue blank:false, nullable:false
    }
}
