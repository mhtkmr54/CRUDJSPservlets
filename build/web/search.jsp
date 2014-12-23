<%-- 
    Document   : DYNAMIC TABLE WEB-APPLICATION
    Created on : Dec 20, 2014, 2:52:59 PM
    Author     : MOHIT KUMAR & HITESH KHANDELWAL ,iit madras
                 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.sql.*" %>

<form>
<table>
<%
String value=request.getParameter("id");
int v=Integer.parseInt(value);
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1257/studentDB","joseph", "123");
Statement st=conn.createStatement();
ResultSet rs = st.executeQuery("select * from test where id="+v+"");
if(rs.next()){ 
    %>
<tr><td>Name: </td><td<input type="text" value="<%=rs.getString("name")%>" > </td></tr>
<tr><td>Address: </td><td<input type="text" value="<%=rs.getString("address")%>" > </td></tr>
<tr><td>Contact No: </td><td<input type="text" value="<%=rs.getInt("contactNo")%>" > </td></tr>
<tr><td>Email: </td><td<input type="text" value="<%=rs.getString("email")%>" > </td></tr>
      <%
}
%>
</table>
</form>
