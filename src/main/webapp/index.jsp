<%-- 
    Document   : index
    Created on : Feb 6, 2022, 4:22:17 AM
    Author     : Yan
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
                    <div>
                        <h1 class="center">SayHello(JSP)</h1>
                        <h2 class="center"><i>Cumprimentos em diferentes idiomas</i></h2>
                    </div><br><br>
                    <div class="center">
                        <a href=".\helloform2.jsp"><button class="button">Começar</button></a>
                    </div>
                </div>
            </div>
        </div> 
        <div class="footer"><b>  
            <jsp:useBean id="myClockBean" class="hello.ClockBean"/> 
            <jsp:getProperty name="myClockBean" property="readableDate"/>
            </b>
        </div>
    </body>
</html>
