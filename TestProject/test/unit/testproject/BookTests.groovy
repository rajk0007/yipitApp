package testproject



import grails.test.mixin.*
import org.junit.*
import spock.lang.Specification
import groovy.xml.MarkupBuilder
import org.custommonkey.xmlunit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
@Mock([Book])
class BookTests extends spock.lang.Specification {
	
	def xmlString="""<book id='1'>
					<author>manish rajkarnikar</author>
					<title>Groovy in Action</title>
					</book>"""

					def xmlDiff
					
	def "Index action should redirect to list page"() {
		when: "count, rows and page number"
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)
		XMLUnit.setIgnoreWhitespace(true)
		
		 xml.book(id:'1') {
			author('manish rajkarnikar')
			title('Groovy in Action')
		  }
		 xmlDiff = new Diff(writer.toString(), xmlString)
		 
		
		
		

		then: "should return correct total pages, the current page, and the offset"
		  xmlDiff.identical()
	}
}
