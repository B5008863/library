package com.kobrien

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

	def "find author using first and last name"(){

	setup:
	mockDomain(author)

	when:
	new author(firstname: firstname,lastname:lastname)
	.save()

	then:
	author.findByFirstnameAndLastname(firstname,lastname) !=null

	where:
	firstname = "Mark"
	lastname = "Haddon"

    
    }
}
