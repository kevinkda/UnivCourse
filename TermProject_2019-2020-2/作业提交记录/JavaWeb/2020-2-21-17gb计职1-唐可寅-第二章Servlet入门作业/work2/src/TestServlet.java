import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kevin KDA on 2020/2/21 12:20
 * @version 1.0
 * @project work2
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "TestServlet", urlPatterns = "/TestServlet")
public class TestServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("This is Servlet init method.");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}