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
	<div id="dep_find">
		部门查询分配
		<form action="../depServlet?act=find" method="post">
			<table class="dep_find_ta1">
				<tr>
					<td>部门号</td>
					<td><input type="text" class="dep_find_txt" name="d_id"></td>
					<td><input type="submit" class="dep_find_btn" name="#"	value="查找"></td>
				</tr>
			</table>
			<table class="dep_find_ta2" border="1">
				<tr>
					<td>部门号</td>
					<td>部门经理</td>
					<td>部门名称</td>
				</tr>
				<%
						DepDaoImpl dd = new DepDaoImpl();
						List<Department> deps = dd.departmentShow();
						for (int i = 0; i < deps.size(); i++) {
							Department dep = deps.get(i);
					%>
				<tr class="row<%=i % 2 + 1%>">
					<td><%=dep.getD_id()%></td>
					<td><%=dep.getD_name()%></td>
					<td><%=dep.getManager()%></td>
				</tr>
				<%
						} 
						%>
			</table>

		</form>
		<input type="button" class="buttonadm5" name="return" value="返回"
			onclick="reBack()">
	</div>
</body>
</html>