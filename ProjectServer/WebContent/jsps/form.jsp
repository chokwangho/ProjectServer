<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<h2 align="center">A Sample Form</h2>
<body bgcolor="Beige">
<form action="Dosubmit" method="post">
Item Number : <input type="text" name= "ItemNumber" /> <br>
Desription : <input type="text" name= "Description" /> <br>
Price Each : <input type="text" name= "PriceEach" /> <br>
<hr />
<br>
First Name : <input type="text" name= "FirstName" /> <br>
Last Name : <input type="text" name= "LastName" /> <br>
Middle Initial : <input type="text" name= "MiddleInitial" /> <br>
Shipping Address : <textarea rows="5" cols="30" name= "Address"></textarea>
<br>
Credit Card : <br> 
<input type="radio" name= "CreditCard" value="Visa" />Visa <br>
<input type="radio" name= "CreditCard" value="MasterCard" />MasterCard	 <br>
<input type="radio" name= "CreditCard" value="American Express" />American Express <br>
<input type="radio" name= "CreditCard" value="Discover" />Discover <br>
<input type="radio" name= "CreditCard" value="Java SmartCard" />Java SmartCard <br>

Credit Card Number : <input type="password" name= "CardNumber" /> <br>
Repeat Credit Card Number : <input type="password" name= "RepeatCardNumber" /> <br>



<input type="submit" value="SubmitOrder" style="float: right;"> </form>
</body>
</html>