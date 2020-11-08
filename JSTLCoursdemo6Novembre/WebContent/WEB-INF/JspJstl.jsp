<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Je suis dans la vue ....

Expression Language ....
<!--  Ici j'utilise la EL pour récupérer un paramètre passé dans la requêt
Get de la façon suivante http://localhost:8080/JSTLCoursdemo6Novembre/jstl?nom=Youcef -->

<br/>
Je suis entrain de récupérer le contenu d'un paramètre dans la requête get <br/>

Bonjour ${nom}
<br/>

<c:out value="<h5> Bonjour </h5> ${nom}"  escapeXml="false">
valeur par défaut 
</c:out>

<p>
<c:set var="prenom" value="Samir" scope="page">  </c:set>
</p>


<p>
<c:out value=" Ton prénom est ${prenom}"></c:out>
</p>

<!-- Déclarer une variable x = 14 -->
<p>
<c:set var="x"> 14 </c:set>
<c:out value="x = ${x}"></c:out>
</p>

<!--  Modifier la varaible x  -->
<p>
<c:set var="x">21</c:set>
</p>

<c:out value="La valeur de x après modification ${x}"></c:out>

<p>
<c:remove var="x" scope="page"/>
</p>

<p>
<c:out value="La valeur de x apès suppression ${x}"></c:out>
</p>

<!--  
<script type="text/javascript">
alert("Coucou !");
</script>
-->

<!--  Traitement d'un objet ..... -->
<p>
<c:out value="Nom : ${etudiant.nom} Prénom : ${etudiant.prenom }"></c:out>
</p>

<p>
<c:set target="${etudiant}" property="nom">Youcef</c:set>
<c:out value="Après modification du nom : ${etudiant.nom}"></c:out>
</p>

<!--  Faire la somme de deux paramètres récupérés dans une requête Get -->

<!-- 
<c:set var="resultat" value="${a+b}"></c:set>
 -->
 
<c:out value="La somme est : ${resultat}"></c:out>


<!-- Les test avec JSTL  -->
<p>
<c:if test="${1==1}" var="tester">
<h5>Les test est vérifié </h5>
</c:if>
</p>

<p>
<c:if test="${! tester}">
Je passe le test en l'affectant dans une nouvelle variable ....
</c:if>
</p>


<!--  choix multiple -->
<!-- Les conditions sont exclusive  -->
<c:choose>
<c:when test="${!(1==1)}">Test 1=1</c:when>
<c:when test="${!(2==2)}">Test 2=2 </c:when>
<c:when test="${!(4==4)}">Test 4=4</c:when>
<c:otherwise>Aucun test n'est vérifié </c:otherwise>
</c:choose>

<p>
<c:out value="******************** Formulaire *********************** "></c:out>
</p>

<c:if test="${authentification.isConnexion()==true}">
<c:out value="Vous êtes authentifié !"></c:out>
</c:if>



<form  method="post" action="jstl">
<label for="login"> Loging : </label>
<input type="text" id="log" name="log"/>
<label for="pass"> Mot de passe : </label>
<input type="password" id="pass" name="pass"/>


<input type="submit"/>  
</form>






</body>
</html>