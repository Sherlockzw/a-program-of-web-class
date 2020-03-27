<%@page import="com.bucea.dao.impl.*, com.bucea.bean.*, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
@import url(../css/style.css);
</style>
<script type="text/javascript">
            function dis_update(){
                window.location="dis_update.jsp";
            }            
            function reBack(){
                history.back(-1);
            } 
        </script>
</head>
<body>
	<div id="distribution">
		权限信息
		<form action="#" methond="post">
			<table class="adm" border="1">
				<tr>
					<td>员工号</td>
					<td>姓名</td>
					<td>权限</td>
					<td>职务</td>
				</tr>
				<%
						LimDaoImpl ld = new LimDaoImpl();
						List<Employee> lims = ld.show();
						for (int i = 0; i < lims.size(); i++) {
							Employee lim = lims.get(i);
					%>
				<tr class="row<%=i % 2 + 1%>">
					<td><%=lim.getE_id()%></td>
					<td><%=lim.getE_name()%></td>
					<td><%=lim.getLi_id()%></td>
					<td><%=lim.getDuty()%></td>
				</tr>
				<%
						} 
						%>
			</table>
			<table class="adm2">
				<tr>
					<td><input type="button" class="button" name="distribution"	value="修改权限" onclick="dis_update()"></td>
				</tr>				
				<tr>
					<td><input type="button" class="button" name="return" value="返回" onclick="reBack()">
				</tr>
				</td>
			</table>
		</form>
	</div>
</body>
</html>