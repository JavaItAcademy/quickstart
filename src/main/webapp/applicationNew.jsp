<%@page pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>
${pageContext.request.contextPath}
<form action="${pageContext.request.contextPath}/application" method="post">
    <p>ФИО
    <input type="text" name="fullName" /></p>

    <p>Наименование курса
    <select name="course">
        <option value="JAVA">JAVA</option>
        <option value="C#">C#</option>
        <option value="Python">Python</option>
        <option value="Android">Android</option>
    </select></p>

    <p>Почта
    <input type="text" name="email" /></p>

    <p>Онлайн?
    <input type="checkbox" value="true" name="isOnline" /> Agree?</p>

    <p>Submit button.
    <input type="submit" name="submit" value="submit" /></p>

</form>

</body>
</html>
