<%@page import="com.bucea.dao.impl.*, com.bucea.bean.*, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
@import url(../css/style.css);
</style>
<script type="text/javascript">            
            function reBack(){
                history.back(-1);
            } 
        </script>
</head>
<body>
	<div id="dis_find">
		权限分配
		<form action="../limServlet?act=update" method="post">
			
			<table class="dis_update_ta">
				<tr>
					<td>需要修改的员工号</td>
					<td><input type="text" class="admtxt" name="e_id"></td>
				</tr>
				<tr>
					<td>修改的权限等级</td>
					<td><input type="text" class="admtxt" name="li_id"></td>
				</tr>
				<tr>
					<td>修改后的职务</td>
					<td><input type="text" class="admtxt" name="duty"></td>
				</tr>
			</table>
			<input type="submit" class="dis_update_btn" name="#" value="修改">
		</form>
		<input type="button" class="buttonadm3" name="return" value="返回"
			onclick="reBack()">
	</div>
</body>
</html>