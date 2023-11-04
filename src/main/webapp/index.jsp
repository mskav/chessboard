<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <title>Chess board</title>
    <style>
   
        .chessboard {
            display: grid;
            grid-template-columns: repeat(8, 50px);
            grid-template-rows: repeat(8, 50px);
        }

        .white {
            background-color: #f0d9b5;
        }

        .black {
            background-color: #b58863;
        }
    </style>
<body>
<form action="your_action.jsp" method="post">
<div class="chessboard">
       
        <% 
        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                String colorClass = ((row + col) % 2 == 0) ? "white" : "black";
        %>
        <div class="<%= colorClass %>"></div>
        <%
            }
        }
        %>
        
    </div>
   <br>
   <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>