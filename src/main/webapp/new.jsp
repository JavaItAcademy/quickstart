<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>IT Academy</title>
	<meta charset="UTF-8">
</head>
<body style="background-color: grey;">
    <form action = "${pageContext.request.contextPath}/boo" method="POST">
        Name: <input type="text" name="fio"/>
        <br/>
        Profile: <input type="text" name="profile"/>

        <input type="submit" value="Отправить"/>
    </form>
</body>
</html>









