<%@ page language="java"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        section {
            margin: 10px;
        }

        #buttons {
            padding: 10px;
            text-align: right;
        }

        #shoe_input {
            background-color: blue;
            color: white;
            padding: 5px;
            border: 0;
            border-bottom: 2px solid blue;
        }

        #shoe_input:hover {
            background-color: gray;
            color: black;
            border-bottom: 2px solid yellow;
        }

        td a {
            color: black;
            cursor: pointer;
        }
    </style>
    <%@ include file="/WEB-INF/views/include/include-head.jspf" %>
</head>
<body>
<%@ include file="/WEB-INF/views/include/include-header.jspf" %>
<%@ include file="/WEB-INF/views/include/include-nav.jspf" %>
<section>
    <h3>발매정보 상세보기</h3>
    <p>SEQ : ${NIKE.s_seq}</p>
    <p>상품명 : ${NIKE.s_name}</p>
    <p>발매일자 : ${NIKE.s_date}</p>
    <p>발매금액 : ${NIKE.s_amount}</p>
    <p>발매수량 : ${NIKE.s_qty}</p>
</section>
<section id="buttons">
    <button id="shoe_input">
        <a href="delete?seq=${NIKE.s_seq}">발매정보 삭제</a>
    </button>
</section>
<%@include file="/WEB-INF/views/include/include-footer.jspf" %>
</body>
</html>
