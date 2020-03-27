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
            function rp_award(){
                window.location="rp_award.jsp";
            }
            function rp_punish(){
                window.location="rp_punish.jsp";
            }
            function reBack(){
                history.back(-1);
            } 
        </script>
    </head>
    <body>
        <div id="manage">
            <table class="man">
                奖惩管理<!--最好能获取到姓名~-->
                <tr><td><input type="button" class="button" name="rp_award" value="奖励" onclick="rp_award()"></td></tr>
                <tr><td><input type="button" class="button" name="rp_punish" value="惩罚" onclick="rp_punish()"></td></tr>
            </table>
            <input type="button" class="buttonman3" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>