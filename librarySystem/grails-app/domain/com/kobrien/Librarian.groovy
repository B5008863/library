package com.kobrien

class Librarian {

	
	String name
	
	String email

	String office

	String username

	String password

	int telephone

	String library

    static constraints = {
	
	name blank:false, nullable:false

	email blank:false, nullable:false, email:true

	office blank:false, nullable:false

	username blank:false, nullable:false, unique:true

	password blank:false, nullable:false

	telephone blank:false, nullable:false, min=7, max=12

	library blank:false, nullable:false

    }
}
