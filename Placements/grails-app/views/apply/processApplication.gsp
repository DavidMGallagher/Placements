<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'status.label', default: 'Status')}" />
		<title> Apply </title>
</head>
<body>
&nbsp;
<left><h1>Added Application for ${params.studentName} ${params.placementOpportunityJobTitle}</h1></left>

<left><a href="http://localhost:8080/placements/application/list">View list of Applications</a></left>
&nbsp;

</body>
</html>