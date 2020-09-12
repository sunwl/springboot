<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <style type="text/css">
        .bar {
            position: fixed;
            left: 0px;
            bottom: 0px;
            width: 100%;
            height: 30px;
            background-color: #FF0000;
            z-index: 9999;}
        .hediv {
            position: fixed;
            left: 0px;
            top: 0px;
            width: 100%;
            height: 30px;
            background-color: #00FF00;
            z-index: 9999;
            text-align: center;
        }
        #submitbtn{
            color: aqua;
            background-color: blue;
            margin: auto;
            align: center;
        }
    </style>
</head>
<body class="text-align:center ">

<div class="hediv">
   Info jsp
</div>


<div >
<table width="100%" border="1px" cellpadding="0" cellspacing="0">
    <thead>
    <tr>
        <c:forEach items="${requestScope.myseehead}" var="item">
            <th>${item}</th>
        </c:forEach>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.mysees}" var="item">
        <tr>
           <td align="center">${item.id}</td>
            <td align="center">${item.v_desc}</td>
            <td align="center">${item.v_date}</td>
            <td align="center">${item.info}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
<div class="bar">
<form action="<%=basePath%>/spt/toJspadd"
      method="post" class="background-color:black">
    <div align="center">
    <input type="submit" id="submitbtn" value="跳转ADD">
    </div>
</form>
</div>
</body>
</html>