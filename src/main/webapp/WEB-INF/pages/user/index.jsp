<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search User</title>
</head>
<body>

	<div align="center">
		<h3>Enter User</h3>
		${msg}
		<form id="find" action="${pageContext.request.contextPath }/user/login"
			method="post">
			<table cellpadding="2" cellspacing="2">
				<tr>
					<td>User-ID</td>
					<td><input type="text" name="userid"></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type="text" name="pwd" /></td>
				</tr>


				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="login"></td>
				</tr>

			</table>
		</form>

	</div>
</body>
</html>