package librarysystem

class BootStrap {

    def init = { servletContext ->

	def librarian1=new Librarian(
	name:'Stephanie Woods',
	email:'Stephanie@shu.ac.uk',
	office:'Office-218',
	username:'Stephanie.W',
	password:'S.Woods',
	telephone:'0114223399',
	library:'SHUuniversity'
	).save()

	def librarian2=new Librarian(
	name:'Colin Hemsworth',
	email:'Colin@shu.ac.uk',
	office:'Office-217',
	username:'Colin.H',
	password:'C.Hemsworth',
	telephone:'0114223388',
	library:'SHUuniversity'
	).save()

	def library=new library(
	building:'Owen',
	address:'Arudel Gate Avenue, Sheffield, S1 2QU',
	openingHours:'9:00-20:00',
	location:'Adsetts',
	studySpaces:'Level 1, 2, 3, 4, 5, 6 bookable PC's'
	).save()

	def Book1=new Book(
	title:'The Curious Incident Of The Dog In The Night Time',
	subject:'English Language',
	author:'Mark Haddon',
	isbn:'5012',
	dateBorrowed:'30/01/2017',
	returnDate:'30/03/2017',
	student:'Hayley Wakefield',
	overdue:'1 day'
	).save()

	def Book2=new Book(
	title:'Computer Networks',
	subject:'ICT',
	author:' Andrew S Tanenbaum',
	isbn:'17832',
	dateBorrowed:'02/02/2017',
	returnDate:'02/03/2017',
	student:'Matthew Underwood',
	overdue:'1 day'
	).save()

	def Student1=new Student(
	name:'Hayley Wakefield',
	email:'H.Wakefield@my.shu.ac.uk',
	username:'B5019908',
	password:'HWakefield17',
	studentId:'B5019908',
	Course:'A Level English Language'
	).save()

	def Student2=new Student(
	name:'Stephen Carl',
	email:'S.Carl@my.shu.ac.uk',
	username:'B5015129',
	password:'SCarl09',
	studentId:'B5015129',
	Course:'A Level English Language'
	).save()

	def Student3=new Student(
	name:'Matthew Underwood',
	email:'M.Underwood@my.shu.ac.uk',
	username:'B5889031',
	password:'MUnderwood17',
	studentId:'B5889031',
	Course:'ICT'
	).save()

	def Course1.new Course(
	title:'ICT',
	code:'1039',
	leader:'Lewis Kicks',
	department:'Computing',
	descripton:'Information Computer Technology BSc course',
	studyMode:'Full-time'
	).save()

	def Course2.new Course(
	title:'English Language',
	code:'2015',
	leader:'Megan Higgins',
	department:'English',
	descripton:'A Level English Language',
	studyMode:'Full-time'
	).save()

	def review1=new BookReview(
	book:'The Curious Incident Of The Dog In The Night Time',
	dateCreated:'30/03/2017',
	student:'Hayley Wakefield',
	review:'Did not like the story'
	).save()

	def review2=new BookReview(
	book:'Computer Networks',
	dateCreated:'02/03/2017',
	student:'Matthew Underwood',
	review:'Very helpful'
	).save()

    }
    def destroy = {
    }
}
