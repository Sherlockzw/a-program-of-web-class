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
            function department(){
                window.location="admin/department.jsp";
            }
            function distribution(){
                window.location="admin/distribution.jsp";
            }
            
        </script>
    </head>
    <body>
        <div id="admin">
            <table class="adm">
                欢迎管理员进入人事管理系统！<!--最好能获取到姓名~-->
                <tr><td><input type="button" class="button" name="department" value="部门信息" onclick="department()"><td></tr>
                <tr><td><input type="button" class="button" name="distribution" value="权限修改" onclick="distribution()"><td></tr>                
            </table>
        </div>
    </body>
</html>