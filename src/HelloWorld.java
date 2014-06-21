import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yuriy on 19.06.14.
 */
public class HelloWorld extends HttpServlet
{

    public static final String USER = "user";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        // Генерируем форму
        out.println("<FORM method=\"POST\" action=\"showdate\">");
//        out.println("<FORM method=\"POST\" >");
        out.println("<INPUT type=\"text\" name=\"welcome\">");
        out.println("<input type=\"submit\"></FORM>");

        Cookie cookie = new Cookie("sample", "test");
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        // Получаем параметр запроса
        String welcome = req.getParameter("welcome");
        out.println("Hello, "+ welcome);
        out.println("<a href='testsession'>Test session</a>");

        Cookie[] cookies = req.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            System.out.println(cookie.getName() + " = " + cookie.getValue());
        }

        HttpSession session = req.getSession();
        session.setAttribute(USER,welcome);
    }
}
