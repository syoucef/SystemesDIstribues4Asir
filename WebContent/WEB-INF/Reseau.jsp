<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
Cours de Réseau ....

<%
String nom = "Samir";
double a = 1; 
double b = 1; 
double c = a+b; 
out.println("<br/>");
out.println("La somme est " + c);

for(int i=0; i<10; i++){
    out.println("<br/>"); 	
	out.println(i); 
}
%>

</body>
</html>