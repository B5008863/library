package com.kobrien

class BookReview {

	String book

	int dateCreated

	String student

	String review

    static constraints = {

	book blank:false, nullable:false

	dateCreated blank:false, nullable:false, min=6, max=10
	
	student blank:false, nullable:false

	review blank:false, nullable:false
    }
}
