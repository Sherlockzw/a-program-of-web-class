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
            function man_count(){
                window.location="rp_pun_show.jsp";
            }
            function man_change(){
                window.location="rp_pun_add.jsp";
            }
            function man_emp(){
                window.location="rp_pun_delete.jsp";
            }
            function man_rp(){
                window.location="rp_pun_update.jsp";
            }
            
        </script>
    </head>
    <body>
        <div id="manage">
            <table class="man">
                欢迎经理进入人事管理系统！<!--最好能获取到姓名~-->
                <tr><td><input type="button" class="button" name="man_count" value="查询惩罚" onclick="man_count()"></td></tr>
                <tr><td><input type="button" class="button" name="man_change" value="添加惩罚" onclick="man_change()"></td></tr>
                <tr><td><input type="button" class="button" name="man_emp" value="删除惩罚" onclick="man_emp()"></td></tr>
                <tr><td><input type="button" class="button" name="man_rp" value="修改惩罚" onclick="man_rp()"></td></tr>
            </table>
        </div>
    </body>
</html>