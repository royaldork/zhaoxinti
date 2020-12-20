
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/11/25
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
<head>
    <title>Title</title>
</head>
<body>`
<h1>展示</h1>
${resultList.status}
<table>
    <tr>
        <th>用户id</th>
        <th>用户姓名</th>
        <th>用户年龄</th>
        <th>用户爱好</th>
    </tr>
    <c:forEach items="${resultList.userList}" var="result">
        <tr>
            <td>${result.id}</td>
            <td>${result.name}</td>
            <td>${result.age}</td>
            <td>${result.hobby}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
