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
            员工信息删除
            <form action="../manServlet?act=delete" method="post">
                <table class="dep_find_ta1">
                    <tr>
                        <td>员工号</td>
                        <td><input type="text" class="dep_find_txt" name="id"></td>
                        <td><input type="submit" class="dep_find_btn" name="dmp_delete" value="删除"></td>
                    </tr>
                </table>
                 <table class="dep_find_ta2" border="1">
                    <tr>
                        <td>员工号</td>
                        <td>姓名</td>
                        <td>生日</td>
                        <td>职务</td>
                        <td>入职时间</td>
                    </tr>
                    <%
						ManDaoImpl md = new ManDaoImpl();
						List<Employee> emps = md.employeeShow();
						for (int i = 0; i < emps.size(); i++) {
							Employee emp = emps.get(i);
					%>
                    <tr class="row<%=i % 2 + 1%>">
						<td><%=emp.getE_id()%></td>
						<td><%=emp.getE_name()%></td>
						<td><%=emp.getBirth()%></td>
						<td><%=emp.getDuty()%></td>
						<td><%=emp.getEntry_time()%></td>
					</tr>  
					<%
						}
					%>         
                    
                </table>
                
            </form>
            <input type="button" class="buttonadm4" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>
</html>