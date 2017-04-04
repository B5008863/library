package com.kobrien

class Student {

	String name

	String email

	String username

	String password

	String studentId

	Course course

	Library library

	String toString()

	{name}


	static hasMany=[books:Book, bookreviews:BookReview]


    static constraints = {

	name blank:false, nullable:false

	email blank:false, nullable:false, email:true

	username blank:false, nullable:false

	password blank:false, nullable:false

	studentId blank:false, nullable:false

	course blank:false, nullable:false

    }
}
