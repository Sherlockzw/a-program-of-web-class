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
            部门信息添加
            <form action="../depServlet?act=add" method="post">
                <table class="dep_update_ta">
                    <tr>
                        <td>名称</td>
                        <td><input type="text" class="admtxt" name="d_name"></td>
                    </tr>
                    <tr>
                        <td>经理</td>
                        <td><input type="text" class="admtxt" name="manager"></td>
                    </tr>
                </table>
                <input type="submit" class="dep_update_btn" name="#" value="添加">
            </form>
            <input type="button" class="buttonadm3" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>