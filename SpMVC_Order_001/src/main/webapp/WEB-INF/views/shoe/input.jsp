<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

    <style>
        section {
            margin: 10px;
        }
    </style>

    <%@ include file="/WEB-INF/views/include/include-head.jspf"%>

</head>
<body>
<%@ include file="/WEB-INF/views/include/include-header.jspf"%>
<%@ include file="/WEB-INF/views/include/include-nav.jspf"%>

<section>
    <h3>주문서 입력 화면</h3>
    <form method="POST">
        <input name="s_name" placeholder="상품명 입력"><br/>
        <input name="s_date" placeholder="날짜 입력"><br/>
        <input name="s_amount" placeholder="금액 입력"><br/>
        <input name="s_qty" placeholder="발매수량 입력"><br/>
        <button>보내기</button>
    </form>
</section>

<%@ include file="/WEB-INF/views/include/include-footer.jspf"%>
</body>
</html>