<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Insert title here</title>
        <style>
            @import url(css/style.css);  
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
            员工信息修改
            <form action="#" method="post">
                <table class="dep_find_ta2" border="1">
                    <tr>
                        <td>员工号</td>
                        <td>姓名</td>
                        <td>生日</td>
                        <td>职务</td>
                        <td>入职时间</td>
                    </tr>
                    <tr>
                        <td>${requestScope.emp.e_id}</td>
                        <td>${requestScope.emp.e_name}</td>
                        <td>${requestScope.emp.birth}</td>
                        <td>${requestScope.emp.duty}</td>
                        <td>${requestScope.emp.entry_time }</td>
                    </tr>                   
                </table>
                
            </form>
            <input type="button" class="buttonadm4" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>