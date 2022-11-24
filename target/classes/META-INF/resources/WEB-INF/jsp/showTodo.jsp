<head>
<title>HTML page</title>
</head>
Welcome to AddTod page ${name}
<h1>Your todo are </h1>   
<hr>
<form:form method="post" modelAttribute="todo">
    Description: <form:input type ="text" path="description" name="description" required="required"/>
    <form:input type="text" path="id">
        <form:input type="text" path="done">   
    </form:input>
    <input type="submit"> 
    </form:form>
</body>
</html>