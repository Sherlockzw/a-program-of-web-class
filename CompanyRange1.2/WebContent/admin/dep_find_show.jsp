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
            
        </script>
    </head>
    <body>
        <div id="dep_find">
            部门信息查询结果
            <form action="#" method="post">
                <table class="dep_find_ta2" border="1">
                    <tr>
                        <td>部门号</td>
                        <td>部门名称</td>
                        <td>经理</td>
                    </tr>
                    <tr>
                        <td>${requestScope.dep.d_id}</td>
                        <td>${requestScope.dep.d_name}</td>
                        <td>${requestScope.dep.manager}</td>
                    </tr>                   
                </table>
                
            </form>
            <input type="button" class="buttonadm4" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>