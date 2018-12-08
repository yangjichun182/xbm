<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%=path%>
<%=basePath%>

<%--这是jsp的注释方式 --%>


<%--生成99表 --%>
<%
	StringBuffer sb = new StringBuffer();
	for (int i = 1; i < 10; i++) {
		for (int j = 1; j <= i; j++) {
			sb.append(j + "*" + i);
			sb.append("=");
			sb.append(i * j);
			sb.append("&nbsp;&nbsp;&nbsp;");
		}
		sb.append("<br/>");
	}
%>

<%=sb.toString()%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test java server page</title>
</head>
<body>

</body>
</html>