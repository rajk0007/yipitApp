class BootStrap {

	def fixtureLoader
	
    def init = { servletContext ->
		
		
		fixtureLoader.load("BookFixtures","StudentFixtures")
		
    }
    def destroy = {
    }
}
