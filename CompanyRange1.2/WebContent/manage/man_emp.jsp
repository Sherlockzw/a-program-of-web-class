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
            function emp_find(){
                window.location="emp_find.jsp";
            }
            function emp_update(){
                window.location="emp_update.jsp";
            }
            function emp_add(){
                window.location="emp_add.jsp";
            }
            function emp_delete(){
                window.location="emp_delete.jsp";
            }
            function reBack(){
                history.back(-1);
            } 
        </script>
    </head>
    <body>
        <div id="manage">
            <table class="man">
                员工信息管理
                <tr><td><input type="button" class="button" name="emp_find" value="查询员工信息" onclick="emp_find()"><td></tr>
                <tr><td><input type="button" class="button" name="emp_update" value="修改员工信息" onclick="emp_update()"><td></tr>
                <tr><td><input type="button" class="button" name="emp_add" value="增加员工信息" onclick="emp_add()"><td></tr>
                <tr><td><input type="button" class="button" name="emp_delete" value="删除员工信息" onclick="emp_delete()"><td></tr>
            </table>
            <input type="button" class="buttonman3" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>