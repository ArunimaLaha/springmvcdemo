<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.cts.beans.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<%
if(request.getAttribute("users")!=null)
{
	List<User> usersList=(List<User>)request.getAttribute("users");
	out.print("<table border='1'>");
	for(User u:usersList)
	{
		out.print("<tr>");
		out.print("<td>"+u.getFullName()+"</td>");
		out.print("<td>"+u.getUsername()+"</td>");
		out.print("<td>"+u.getPassword()+"</td>");
		out.print("<td>"+u.getGender()+"</td>");
		out.print("<td>"+u.getEmail()+"</td>");
		out.print("<td>"+new SimpleDateFormat("dd/MM/yyyy").format(u.getDob())+"</td>");
		out.print("</tr>");
	}
	out.print("</table>");
}
%>

</body>
</html>