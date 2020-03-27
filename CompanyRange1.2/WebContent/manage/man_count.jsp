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
            function cou_day(){
                window.location="cou_day.jsp";
            }
            function cou_week(){
                window.location="cou_week.jsp";
            }
            function cou_month(){
                window.location="cou_month.jsp";
            }
            function reBack(){
                history.back(-1);
            } 
        </script>
    </head>
    <body>
        <div id="manage">
            <table class="man">
                欢迎员工进入人事管理系统！<!--最好能获取到姓名~-->
                <tr><td><input type="button" class="button" name="cou_day" value="日考勤" onclick="cou_day()"><td></tr>
                <tr><td><input type="button" class="button" name="cou_week" value="周考勤" onclick="cou_week()"><td></tr>
                <tr><td><input type="button" class="button" name="cou_month" value="月考勤" onclick="cou_month()"><td></tr>
            </table>
            <input type="button" class="buttonman" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>