<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
%>

<%=username%><br>
<%=password%>
<body>

	<form action="login.jsp" method="post">
		<div class="div_1">
			<input type="text" name="username" placeholder="用户名"><br>
			<input type="password" name="password" placeholder="密码"><br>
			<input type="submit" value="提交"><input type="reset"
				value="重置">
		</div>

	</form>

</body>
</html>