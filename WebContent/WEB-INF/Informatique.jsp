<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp"%>

Bonjour 
<%
String nom = (String)request.getAttribute("nom");
String prenom = (String)request.getAttribute("prenom"); 
out.println(nom + " " + prenom) ;%> et bienvenue dans le 
<h1> Cours d'Informatique </h1> 
Contenu du cours : 
<ul>
<li> Java EE (J2E) </li>
<li> Formats d'échanges de messages : XML, JSON </li>
</ul>

<br/><br/>
<p>
<!-- Utilisation de Expression Language (EL) -->
Bonjour ${nom} ${prenom} 

${t[0]}
${t[1]}
${t[2]}
${t[3]}
</p>

<p>
${!empty nom ? nom : "La valeur du paramètre est vide"}
</p>

</body>
</html>