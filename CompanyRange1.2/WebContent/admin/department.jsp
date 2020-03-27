<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Insert title here</title>
        <style>
            @import url(../css/style.css); 
            @import url(../css/test.css);
        </style>
        <script type="text/javascript">
            function dep_find(){
                window.location="dep_find.jsp";
            }
            function dep_update(){
                window.location="dep_update.jsp";
            }
            function dep_add(){
                window.location="dep_add.jsp";
            }
            function dep_delete(){
                window.location="dep_delete.jsp";
            }
            function reBack(){
                history.back(-1);
            } 
        </script>
    </head>
    <body>
        <div id="department">
            <table class="adm">
                部门信息管理
                <tr><td><input type="button" class="button" name="dep_find" value="查询部门信息" onclick="dep_find()"><td></tr>
                <tr><td><input type="button" class="button" name="dep_update" value="修改部门信息" onclick="dep_update()"><td></tr>
                <tr><td><input type="button" class="button" name="dep_add" value="增加部门信息" onclick="dep_add()"><td></tr>
                <tr><td><input type="button" class="button" name="dep_delete" value="删除部门信息" onclick="dep_delete()"><td></tr>
            </table>
            <input type="button" class="buttonadm4" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>