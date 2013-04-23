<%@ page import="testproject.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'books', 'error')} ">
	<label for="books">
		<g:message code="student.books.label" default="Books" />
		
	</label>
	<g:select name="books" from="${testproject.Book.list()}" multiple="multiple" optionKey="id" size="5" value="${studentInstance?.books*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="student.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${studentInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="student.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${studentInstance?.lastName}"/>
</div>

