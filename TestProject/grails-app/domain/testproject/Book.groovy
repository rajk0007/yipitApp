package testproject

class Book {
	
	String title
	String author

    static constraints = {
		author nullable:true
		title nullable:false, blank:false
    }
}
