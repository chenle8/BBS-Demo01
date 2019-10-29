<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   来天涯，与XXXX位天涯人共同演绎你的网络人生<br>
   <form action="login.do" method="post"><br>
  用户名： <input type="text" name="u"><br>
  密码： <input type="password" name="p"><br>
   <input type="submit" value="登录"><br>
   <a href="reg.jsp">立即注册</a><br>
   <a href="#">找回密码</a><br>
   当前在线人数：XXX<br>
   </form>
  </body>
</html>
