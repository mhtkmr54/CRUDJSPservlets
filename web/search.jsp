<%-- 
    Document   : search
    Created on : Dec 8, 2014, 1:19:03 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter your your search term</h1>
        <form action="http://localhost:8080/CRUDWebApplication/Searchf" method="POST">
           <input type="text" name="studentId" value="${student.studentId}" />
           <input type="submit" name="action" value="Search" />
            
        </form>
           
         
<form>


       
    </body>
</html>
