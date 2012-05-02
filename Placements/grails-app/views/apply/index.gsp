<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'status.label', default: 'Status')}" />
		<title> Apply </title>
		<style>
		input{ margin-left:20px;}
		</style>
	</head>
	<body>
	<br/>
	<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="/Placements/">Home</a></li>
				<li><a href="/Placements/application/list" class="list">List Applications</a></li>
			</ul>
	</div>
			<g:if test="${flash.message}">
			<div class="message" role="status"><g:message code="${flash.message}"  /></div>
			</g:if>

	<h1>Create a New Application</h1>	<br/>	<br/>

	<g:form action="processApplication">

	Student's Name:<input name="studentName" class="nameinput" /><br/><br/>

	Job Title of the Placement Opportunity:<input name="placementOpportunityJobTitle" /><br/><br/>

	<input class="button" type="submit" />

</g:form>

</body>
</html>