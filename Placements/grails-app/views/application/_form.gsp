<%@ page import="placements.Application" %>



<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'code', 'error')} required">
	<label for="code">
		<g:message code="application.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="code" name="code.id" from="${placements.Status.list()}" optionKey="id" required="" value="${applicationInstance?.code?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'jobTitle', 'error')} required">
	<label for="jobTitle">
		<g:message code="application.jobTitle.label" default="Job Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="jobTitle" name="jobTitle.id" from="${placements.PlacementOpportunity.list()}" optionKey="id" required="" value="${applicationInstance?.jobTitle?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="application.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${placements.Student.list()}" optionKey="id" required="" value="${applicationInstance?.student?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'timestamp', 'error')} ">
	<label for="timestamp">
		<g:message code="application.timestamp.label" default="Timestamp" />
		
	</label>
	<g:textField name="timestamp" value="${applicationInstance?.timestamp}"/>
</div>

