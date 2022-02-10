<%-- 
    Document   : helloform2
    Created on : Feb 6, 2022, 4:07:38 AM
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
                    
                    <form action="sayhello.jsp" method="post"><br>
                        <div><b>Escolha o idioma desejado:</b><br><br>
                        <input type="radio" name="lang" value="pt" checked> Português
                        <input type="radio" name="lang" value="en"> Inglês
                        <input type="radio" name="lang" value="fr"> Francês
                        <input type="radio" name="lang" value="de"> Alemão
						<input type="radio" name="lang" value="it"> Italiano
                        <input type="radio" name="lang" value="es"> Espanhol<br><br>
                        <b>Escolha a forma de tratamento desejada:</b><br><br>
                        <input type="radio" name="tratamento" value="none" checked> Nenhuma
                        <input type="radio" name="tratamento" value="sr"> Sr.
                        <input type="radio" name="tratamento" value="sra"> Sra. <br><br>
                        <b>Informe seu nome:</b> <input type="text" name="nome"/> <br><br><br><br>
                        <div class="center">
                            <input type="submit" class="button" value="Cumprimentar"/>
                        </div> 
                        </div>
                    </form>
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
