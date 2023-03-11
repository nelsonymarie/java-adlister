<%@ page import="jspAndJstlSolution.Quote" %>
<%@ page import="jspAndJstlSolution.BeanTest" %>
<%@ page import="java.util.ArrayList" %>
<html>
<body>
<h1>Quotes</h1>
<ul>
    <%
        ArrayList<Quote> quotes = BeanTest.getQuotes();
        for (Quote quote : quotes) {
    %>
    <li><%= quote.getContent() %> - <%= quote.getAuthor().getName() %></li>
    <% } %>
</ul>
</body>
</html>
