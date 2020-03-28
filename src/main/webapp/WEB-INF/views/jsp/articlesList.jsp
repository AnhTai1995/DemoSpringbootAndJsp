<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Person List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Articles List</h1>

<br/><br/>
<div>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Category</th>
        </tr>
        <c:forEach  items="${article}" var ="article">
            <tr>
                <td>${article.articleId}</td>
                <td>${article.title}</td>
                <td>${article.category}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>

</html>