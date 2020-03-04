<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="/style.css" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab 28 | Weather Forecast</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>

	<section class="container">

		<c:forEach var="temperature" items="${response.data.temperature}">
			<p>${temperature}</p>
		</c:forEach>


		<c:forEach var="text" items="${response.data.text}">
			<p>${text}</p>
		</c:forEach>
		
		
  		<c:forEach var="startPeriodName" items="${response.time.startPeriodName}">
			<p>${startPeriodName}</p>
		</c:forEach>

	</section>

</body>
</html>