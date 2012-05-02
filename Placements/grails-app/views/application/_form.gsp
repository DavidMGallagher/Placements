<%@ page import="placements.Application" %>



<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="application.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${placements.Student.list()}" optionKey="id" required="" value="${applicationInstance?.student?.id}" class="many-to-one" optionValue="name"/>
</div>

<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'jobTitle', 'error')} required">
	<label for="jobTitle">
		<g:message code="application.jobTitle.label" default="Job Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="jobTitle" name="jobTitle.id" from="${placements.PlacementOpportunity.list()}" optionKey="id" required="" value="${applicationInstance?.jobTitle?.id}" class="many-to-one" optionValue="jobTitle"/>
</div>

<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="application.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="status" name="status.id" from="${placements.Status.list()}" optionKey="id" required="" value="${applicationInstance?.status?.id}" class="many-to-one" optionValue="code"/>
</div>

