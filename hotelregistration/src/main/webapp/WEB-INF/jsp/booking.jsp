<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
<head>
<title>Booking</title>
</head>
<body background="https://i.pinimg.com/originals/a0/73/a0/a073a07c1d47a9715012c141c857ef63.jpg ">
	<h1>Room Booking</h1>
	<p>${msg}</p>
	<form:form action="/bookroomsuccess" method="post"
		modelAttribute="bookingDetails">
		<label>Booking Id</label>
		<form:input type="number" path="bookingId" value="${bid}"
			readonly="true" />
		<br>
		
		<label id="label-1">Room Type</label>
		<form:select name="type" id="type" path="roomType" required="required">
			<option value="">Please Select an option</option>
			<option value="AC">AC</option>
			<option value="Non AC">Non AC</option>

		</form:select>
		<br>
		<label id="label-2">Number of persons</label>
		<form:input type="number" path="noOfPersons" />
		<br>
		<label id="label-3">From date</label>
		<form:input placeholder="dd/mm/yyyy" type="date" path="fromDate" />
		<br>
		<label id="label-4">To date</label>
		<form:input placeholder="dd/mm/yyyy" type="date" path="toDate" />
		<br>

		<input type="submit" value="Book room">
		<a href="/home">Go Back</a>
	</form:form>
</body>
</html>