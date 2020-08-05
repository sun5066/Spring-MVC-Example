<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/WEB-INF/views/include/include-head.jspf" %>
</head>
<style>
    #text1, table {
        border: 1px ;
        margin: auto;
        text-align: center;
    }
</style>
<body>
<%@ include file="/WEB-INF/views/include/include-header.jspf" %>
<%@ include file="/WEB-INF/views/include/include-nav.jspf" %>
<section id="text1">
    <h3>나이키 사카이 페가수스 사진</h3>
</section>
<section>
    <%@include file="/WEB-INF/views/include/include-images.jspf" %>
</section>
<%@include file="/WEB-INF/views/include/include-footer.jspf"%>
</body>
</html>
