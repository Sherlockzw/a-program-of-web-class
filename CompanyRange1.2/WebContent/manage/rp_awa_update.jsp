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
        <div id="dis_find">
            添加奖励
            <form action="../rPServlet?act=update" method="post">
                <table class="dep_update_ta">
                    <tr>
                        <td>奖励号</td>
                        <td><input type="text" class="admtxt" name="awa_id"></td>
                    </tr>
                    <tr>
                        <td>奖励名称</td>
                        <td><input type="text" class="admtxt" name="awa_name"></td>
                    </tr>
                </table>
                <input type="submit" class="dep_update_btn" name="#" value="修改">
            </form>
            <input type="button" class="buttonadm5" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>