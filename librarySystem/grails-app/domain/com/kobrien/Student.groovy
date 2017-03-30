package com.kobrien

class Student {

	String name

	String email

	String username

	String password

	String studentId

	String course

	static hasMany[]

    static constraints = {

	name blank:false, nullable:false

	email blank:false, nullable:false, email:true

	username blank:false, nullable:false

	password blank:false, nullable:false, min=6, max=1

	studentId blank:false, nullable:false

	course blank:false, nullable:false

    }
}
