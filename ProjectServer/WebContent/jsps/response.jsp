<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<h2 align="center">Reading All Request Parameters</h2>
<body bgcolor="Beige">
	<table border=1 align="center">
		<tr bgcolor=#ff9933>
			<th>Parameter Name</th>
			<th>Parameter Value(s)</th>
		</tr>
		<tr>
			<td>CardNum</td>
			<td>
				<ul>
					<li>${CardNumber}</li>
					<li>${RepeatCardNumber}</li>
				</ul>
			</td>
		</tr>
		<tr>
			<td>CardType</td>
			<td>${CreditCard}</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${PriceEach}</td>
		</tr>
		<tr>
			<td>initial</td>
			<td>${MiddleInitial}</td>
		</tr>
		<tr>
			<td>itemNum</td>
			<td>${ItemNumber}</td>
		</tr>
		<tr>
			<td>address</td>
			<td>${Address}</td>
		</tr>
		<tr>
			<td>firstName</td>
			<td>${FirstName}</td>
		</tr>
		<tr>
			<td>description</td>
			<td>${Description}</td>
		</tr>
		<tr>
			<td>lastName</td>
			<td>${LastName}</td>
		</tr>
	</table>
	<p style="float: center;"> <a href="/ProjectServer/index.jsp"> Home</a> </p>
</body>
</html>