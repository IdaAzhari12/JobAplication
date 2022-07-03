<%-- 
    Document   : company
    Created on : Jul 2, 2022, 8:57:39 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Company List</h1>
        
        <table>
            <tr>
                <td>
                    ID
                </td>
                <td>
                    Name
                </td>
                <td>
                    Address
                </td>
            </tr>
            
            <c:forEach var="com" items="${company}">
                <tr>
                    <td>
                        <c:out value="${com.getId()}"></c:out>
                    </td>
                    <td>
                        <c:out value="${com.getName()}"></c:out>
                    </td>
                    <td>
                        <c:out value="${com.getAdress()}"></c:out>
                    </td>
                </tr>
            </c:forEach>
            
        </table>
    </body>
</html>
