package librarysystem

class BootStrap {

    def init = { servletContext ->

	def Librarian1=new Librarian(
	name:'Stephanie',
	email:'Stephanie@hotmail.co.uk',
	office:'cantor1109',
	username:'Stephanie0190',
	password:'Stephanie219',
	telephone:'0114292929',
	library:'SHUuniversity'
	).save()
	
	def Library=new Library(
	building:'Adsetts',
	address:'Arundel Gate Avenue, Sheffield, S1 2QU',
	openingHours:'9:00 - 20:00',
	location:'sheffild town centre',
	studySpaces:'Level 1, 2, 3, 4, 5, 6 bookable rooms and PC's'
	).save()

	def Book1=new Book(
	title:'The Curious Incident Of The Dog In The Night Time',
	subject:'English Language',
	author:'Mark Haddon',
	isbn:'20201987',
	dateBorrowed:'30/01/2017',
	returnDate:'30/03/2017',
	student:'Hayley Barker',
	overdue:'one day'
	).save()

	def student1=new Student(
	name:'Hayley Barker',
	email:'H.Barker@my.shu.ac.uk',
	username:'Hayleyshu',
	password:'H.Barker17',
	studentId:'B5092187',
	course:'English Language'
	).save()

	def student2=new Student(
	name:'Stewart Hallwood',
	email:'S.Hallwood@my.shu.ac.uk',
	username:'Stewartshu',
	password:'S.Hallwood21',
	studentId:'B5564832',
	course:'BSc Computing'
	).save()

	def student3=new Student(
	name:'Matthew Hanson',
	email:'M.Hanson@my.shu.ac.uk',
	username:'Matthewshu',
	password:'M.Hanson08',
	studentId:'B5018812',
	course:'BSc Computing'
	).save()

	def course1=new Course(
	title:'English Language',
	code:'512',
	leader:'Stephen Johnson',
	department:'English Studies',
	description:'English Language Studies for A Level students',
	studyMode:'Full-time'
	).save()

	def course2=new Course(
	title:'BSc Computing',
	code:'714',
	leader:'Lynne Dawson',
	department:'Computing',
	description:'Web development, Project management and Service Support, Systems Architectures',
	studyMode:'Full-time'
	).save()

	def Bookreview=new BookReview(
	book:'The Curious Incident Of The Dog In The Night Time',
	dateCreated:'02/02/2017',
	student:'Hayley Barker',
	review:'Boring Book, will not read it again'
	).save()

    }
    def destroy = {
    }
}
