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
            部门查询分配
            <form action="#" method="post">
                <table>
                    <tr>
                        <td>需要修改的员工号</td>
                        <td><input type="text" class="admtxt" name="#"></td>
                    </tr>
                    <tr>
                        <td>修改的权限等级</td>
                        <td><input type="text" class="admtxt" name="#"></td>
                    </tr>
                </table>
                <input type="button" class="dep_update_btn" name="#" value="修改">
            </form>
            <input type="button" class="buttonadm3" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>