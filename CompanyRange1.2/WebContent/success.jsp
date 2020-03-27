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
        <script type="text/javascript">
            function reBack(){
                history.back(-1);
            }            
        </script>
    </head>
    <body>
        <div id="success">
            操作成功！
            <input type="button" class="rebutton" name="emp_award" value="返回" onclick="reBack()">
        </div>
    </body>
</html>