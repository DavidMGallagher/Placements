<%@ page import="placements.PlacementOpportunity" %>



<div class="fieldcontain ${hasErrors(bean: placementOpportunityInstance, field: 'companyName', 'error')} ">
	<label for="companyName">
		<g:message code="placementOpportunity.companyName.label" default="Company Name" />
		
	</label>
	<g:textField name="companyName" value="${placementOpportunityInstance?.companyName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: placementOpportunityInstance, field: 'jobTitle', 'error')} ">
	<label for="jobTitle">
		<g:message code="placementOpportunity.jobTitle.label" default="Job Title" />
		
	</label>
	<g:textField name="jobTitle" value="${placementOpportunityInstance?.jobTitle}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: placementOpportunityInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="placementOpportunity.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="status" name="status.id" from="${placements.Status.list()}" optionKey="id" required="" value="${placementOpportunityInstance?.status?.id}" class="many-to-one" optionValue="code"/>
</div>

