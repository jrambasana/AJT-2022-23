<%-- 
Program 3:  Write down a JSP program which will display the error 
by a common file for all the general pages.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="errorJSP.jsp" %>  
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Program 3: ERROR CALCULATION</title>
</head>
<body>
<h1>JSP Program 3: ERROR CALCULATION</h1>
<%
    String op = request.getParameter("op");
    String num1 = request.getParameter("n1");
    String num2 = request.getParameter("n2");
    int a, b, c = 0;
    a = Integer.parseInt(num1);
    b = Integer.parseInt(num2);

    if (op.equals("Divide"))
    {
        c = a/b;
    }
    else if (op.equals("Multiply"))
    {    
        c = a*b;
    }
    else if (op.equals("Add"))
    {    
        c = a+b;
    }
    else if (op.equals("Subtract"))
    {    
        c = a-b;
    }
    out.print("Result of opration " + op + " is: "+c);
%>
</body>
</html>
