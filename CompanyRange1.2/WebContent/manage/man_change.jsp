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
            function cha_up(){
                window.location="cha_up.jsp";
            }
            function cha_move(){
                window.location="cha_move.jsp";
            }
            function reBack(){
                history.back(-1);
            } 
        </script>
    </head>
    <body>
        <div id="manage">
            <table class="man">
                人员异动管理！<!--最好能获取到姓名~-->
                <tr><td><input type="button" class="button" name="cha_up" value="人员升迁" onclick="cha_up()"></td></tr>
                <tr><td><input type="button" class="button" name="cha_move" value="人员调职" onclick="cha_move()"></td></tr>
            </table>
            <input type="button" class="buttonman3" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>