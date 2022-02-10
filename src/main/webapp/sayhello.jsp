<%-- 
    Document   : sayhello
    Created on : 08/02/2021, 23:08:15
    Author     : viter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css" type="text/css"/>
        <title>SayHello(JSP)</title>    
    </head>
    <body class="body">
        <div class="outer">
            <div class="middle">
                <div class="inner">            
                    <div class="center">            
                        <jsp:useBean id="myHelloBean" class="hello.MessageBean"/>
                        <h1>
                            
                            <% String lang = request.getParameter("lang"); %>
                            <% String tratamento = request.getParameter("tratamento"); %>
                            <jsp:setProperty name="myHelloBean" property="lang" value="<%=lang%>"/>
                            <jsp:setProperty name="myHelloBean" property="tratamento" value="<%=tratamento%>"/>
                            <jsp:getProperty name="myHelloBean" property="msg"/> <%=request.getParameter("nome")%>!
                        </h1>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer">
            <b>
                <jsp:useBean id="myClockBean" class="hello.ClockBean"/> 
                <jsp:getProperty name="myClockBean" property="readableDate"/>
            </b>
        </div>
    </body>
</html>
