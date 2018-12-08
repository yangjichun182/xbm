<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.net.URLDecoder"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>

<title>My JSP 'Parameter.jsp' starting page</title>

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
	<h2 style="background-color:red">table list</h2>
	<form action="../servlet/Servlet1" method="POST">
		First name: <input type="text" name="firstname" /> <br /> 
		password :  <input type="text" name="lastname" /> 
		            <input type="submit" value="登陆" />
	</form>
</body>
</html>
