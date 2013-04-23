package testproject

class Student {

	String firstName
	
	String lastName
	
	
	static hasMany=[books:Book]
	
    static constraints = {
		
		lastName nullable:true
    }
}
