<%@ page contentType="text/html; charset=windows-1251" %>
<% java.util.Calendar rightNow = java.util.Calendar.getInstance();
    int hour = rightNow.get(java.util.Calendar.HOUR_OF_DAY);
    StringBuilder greeting = new StringBuilder(request.getParameter("welcome"));
    if (hour < 12)
        greeting.append(", ������ ����!");
    else if (hour < 17)
        greeting.append(", ������ ����!");
    else if (hour < 22)
        greeting.append(", ������ �����!");
    else
        greeting.append(", ������ ����!");
%>
<html><body>
<%=greeting.toString()%>
</body></html>