<html>
    <body>
        <h1>
            guys, it seems <i>TOMCAT</i> finally worked
            <% int a = 100; int b = 200; %>
            <%= a+b%>
        </h1>

        <p>
            ${text} ${name}
        </p>

        <p >Name: <%= request.getParameter("fio") %></p>
        <p>Profile: <%= request.getParameter("profile") %>
    </body>
</html>