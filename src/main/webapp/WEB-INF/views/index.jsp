<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/18/2020
  Time: 1:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Map</title>
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form action="/ok" method="post">


    <label>USD: </label><br/>
    <input type="text" name="usd"/><br/>

    <label>VND: </label><br/>
    <input type="text" name="result" placeholder="USD" value="${result}"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
  </form>


  </body>
</html>
