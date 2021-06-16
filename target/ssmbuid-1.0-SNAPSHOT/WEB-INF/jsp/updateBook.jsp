<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%-- 隐藏域--%>
        <input type="hidden" name="bookId" value="${Abook.bookId}"/>
        <div class="form-group">
        <label>书籍名称：</label>
            <label>
                <input type="text" name="bookName" value="${Abook.bookName}" required>
            </label><br><br>
        </div>
        <div class="form-group">
            <label>书籍数量：</label>
            <label>
            <input type="text" name="bookCounts"value="${Abook.bookCounts}" required>
        </label><br><br>
        </div>
        <label>书籍详情：</label>
        <label>
            <input type="text" name="detail" value="${Abook.detail}" required>
        </label><br><br>&nbsp;&nbsp;&nbsp;
        <div class="form-group">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交">
        </div>
    </form>
</div>
</body>
</html>
