<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>

    <title>Home</title>
</head>
<body>
<font color="red">${errorMessage}</font>
<form method="POST" action="/index" modelAttribute="message">
    Email
    <input type="email" name="email" id="email" required />
    Password
    <input type="password" name="password" id="password" required required pattern=".{8,}"
           title="åtte eller flere tegn" />
    First name
    <input type="text" name="firstname" id="firstName" title="skriv navnet ditt" />
  Last name
    <input type="text" name="lastname" id="lastName"  title="skriv navnet ditt" />
    <input type="submit" value="submit" name="submitted">
</form>
</body>
</html>