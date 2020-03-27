<%@ page import="com.bucea.dao.impl.*, com.bucea.bean.*, java.util.*"%>
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
            function find(){
                window.location="emp_update.jsp";
            }
        </script>
</head>
<body>
	<div id="dep_find">
		员工信息查询
		<form action="#" method="post">
			<table class="dep_find_ta2" border="1">
				<tr>
					<td>员工号</td>
					<td>员工姓名</td>
					<td>惩罚号</td>
					<td>惩罚名称</td>
				</tr>
				<%
						RPDaoImpl rd = new RPDaoImpl();
                    ArrayList<Employee> emps = new ArrayList<Employee>();
            		ArrayList<Punish> awas = new ArrayList<Punish>();
            		rd.punishShow(emps,awas);
						for (int i = 0; i < emps.size(); i++) {
							Employee emp = emps.get(i);
							Punish awa = awas.get(i);
					%>
				<tr class="row<%=i % 2 + 1%>">
					<td><%=emp.getE_id()%></td>
					<td><%=emp.getE_name()%></td>
					<td><%=awa.getPunish_id()%></td>
					<td><%=awa.getPunish_name()%></td>
				</tr>
				<%
						}
					%>

			</table>

		</form>
		<input type="button" class="buttonadm4" name="return" value="返回"
			onclick="reBack()">
	</div>
</body>
</html>