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
            员工信息修改
            <form action="../manServlet?act=update" method="post" name="form">
                <table class="dep_update_ta">
                	<tr>
                        <td>员工号</td>
                        <td><input type="text" class="admtxt" name="e_id"></td>
                    </tr>
                    <tr>
                        <td>姓名</td>
                        <td><input type="text" class="admtxt" name="e_name"></td>
                    </tr>
                    <tr>
                        <td>生日</td>
                        <td><input type="text" class="admtxt" name="birth"></td>
                    </tr>
                    <tr>
                        <td>职务</td>
                        <td><input type="text" class="admtxt" name="duty"></td>
                    </tr>
                    <tr>
                        <td>入职时间</td>
                        <td><input type="text" class="admtxt" name="entry_time"></td>
                    </tr>
                    <tr>
                        <td>身份证号</td>
                        <td><input type="text" class="admtxt" name="id"></td>
                    </tr>
                    <tr>
                        <td>密码</td>
                        <td><input type="text" class="admtxt" name="password"></td>
                    </tr>
                </table>
                <input type="submit" class="emp_update_btn" name="#" value="修改">
            </form>
            <input type="button" class="buttonadm5" name="return" value="返回" onclick="reBack()">
        </div>
    </body>
</html>