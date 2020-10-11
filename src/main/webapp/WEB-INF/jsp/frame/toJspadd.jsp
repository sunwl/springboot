<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
            z-index: 9999;
            text-align: center;
        }

        .headbar {
            position: fixed;
            left: 0px;
            top: 0px;
            width: 100%;
            height: 30px;
            background-color: #00FF00;
            z-index: 9999;
            text-align: center;
        }
        .form{
          margin-top: 50px;

        }
    </style>

</head>
<body>


<form action="<%=basePath%>spt/toAJSP"  method="post" class="form">
    描述：<input type="text" value="zhangsandeeeee"name="v_desc"></input><br/>
    日期：<input type="text"  value="2020-06-07" name="v_date"></input>
    <br/>
    简介：<input type="text"  value="学而不思则罔"name="info"></input><br/>
    <input type="submit" value="提交">
</form>

<a href="<%=basePath%>spt/toCon">跳转HTML</a>
<a href="<%=basePath%>spt/toCon1">跳转INFO列表</a>


</body>
</html>