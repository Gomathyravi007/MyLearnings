<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>HTML page</title>
</head>
<body>
    Welcome to Welcome page ${name}
    <h1>Your todo are </h1>   
    <hr>
    <table>
        <thead>
        <tr>
        <th>id</th>
        <th>description</th>
        <th>Target Date</th>
        <th>is Done?</th>
       </tr>
       </thead>
       <tbody>
           <c:forEach items="${todos}" var="todos">
           <tr>
           <td>${todos.id}</td>
           <td>${todos.description}</td>
           <td>${todos.targetDate}</td>
           <td>${todos.done}</td>
        </tr>
    </c:forEach>
        </tbody>
    </table>  
    <a href ="showTodo" class="btn btn-success">Add Todo</a>
</body>
</html>