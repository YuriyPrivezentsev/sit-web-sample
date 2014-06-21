<%@ page contentType="text/html; charset=windows-1251" %>
<% java.util.Calendar rightNow = java.util.Calendar.getInstance();
    int hour = rightNow.get(java.util.Calendar.HOUR_OF_DAY);
    StringBuilder greeting = new StringBuilder(request.getParameter("welcome"));
    if (hour < 12)
        greeting.append(", доброе утро!");
    else if (hour < 17)
        greeting.append(", добрый день!");
    else if (hour < 22)
        greeting.append(", добрый вечер!");
    else
        greeting.append(", доброй ночи!");
%>
<html><body>
<%=greeting.toString()%>
</body></html>