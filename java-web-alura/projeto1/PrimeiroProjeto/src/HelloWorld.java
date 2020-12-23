import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/default")
public class HelloWorld extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("primeiro servlet. parabens!");
        out.println("</body>");
        out.println("</html>");

        System.out.println("o servlet foi chamado");
        //requisição chega, tomcat conhece servlet e cria um objeto da classe HelloWorld e chamou o método service
    }
    //o conteúdo ainda nao é dinâmico
}
