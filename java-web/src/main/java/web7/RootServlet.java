package web7;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RootServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse rs) throws ServletException, IOException {
    rs.getWriter().println("root");
  }
}
