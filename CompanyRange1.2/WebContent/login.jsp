<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Insert title here</title>
        <style>
            @import url(./css/style.css);
        </style>
    </head>
    <body>
        <div id="login">
            <form method="post" action="logServlet">
                <table border="2" width="400" height="200" color="#fff">
                    <tr>
                        <td>用户名</td><td>&nbsp<input type="text" name="usName" class="logintxt"></td>
                    </tr>
                    <tr>
                        <td>密码</td><td>&nbsp<input type="password" name="usPwd" class="logintxt"></td>
                    </tr>
                    <tr>
                        <td colspan="2">&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="登录" class="loginbtn" > 
                        <input type="reset" value="重置" class="loginbtn"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>