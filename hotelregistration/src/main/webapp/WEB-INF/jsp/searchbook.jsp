
<%@page import="java.util.*;"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Search Book</title>

</head>

<body>

<table align="center">

<%

List booklist=new ArrayList();

booklist=(ArrayList)request.getAttribute("booklist");

if(booklist!=null && booklist.size()>0 ){

%>

<h2 align="center">Book List</h2>

<tr>

<th>Book Id</th>

<th>Book Name</th>

<th>Category</th>

</tr>

<%

for(int i=0;i<booklist.size();i++){

List book=(List)booklist.get(i);

%>

<tr>

<td><%=book.get(1) %></td>

<td><%=book.get(2) %></td>

<td><%=book.get(3) %></td>

</tr>

<%

}

}else{

%>

Not  Available  Any Book Details

<%}%>

</table>

</body>

</html>