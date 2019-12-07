<%--
  Created by IntelliJ IDEA.
  User: eternal
  Date: 2019/12/2
  Time: 下午1:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
  </head>
  <body>
  <form >
    名称：<input type="text" id="name"/><br/>
    血量：<input type="text" id="pw"/><br/>
    <input type="button" value="提交" id="sender">
  </form>
  <div id="messageDiv"></div>

  <script>
    $('#sender').click(function () {
      var name = document.getElementById('name').value;
      var pw = document.getElementById('pw').value;
      var hero = {"username": name, "password": pw};
      var url = "RegisterServlet";


      $.post(
              url,
              {"data": JSON.stringify(hero)},
              function (data) {
                  $("#messageDiv").html("收到服务器响应的" + data);
              });

    });
  </script>
  </body>
</html>
