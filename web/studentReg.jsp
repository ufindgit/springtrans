<%-- 
    Document   : studentReg
    Created on : Jan 1, 2014, 1:07:25 PM
    Author     : Rishitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="studentReg.spring" method="post">
           <table>
               <tr>
                   <td>StudentName:</td>
                   <td><input type="text" name="sname"/></td>
               </tr>
               <tr>
                   <td>City</td>
                   <td><input type="text" name="scity"/></td>
               </tr>
               <tr>
                   <td colspan="2"><input type="submit"/></td>
               </tr>
           </table>
        </form>
    </body>
</html>
