// this class will be connector of front and back.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Connection extends HttpServlet {
    public Connection() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String classNum = request.getParameter("classNum");
        String school = request.getParameter("school");
        String geArea = request.getParameter("geArea");
        String className = request.getParameter("className");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String sort = request.getParameter("sort");

        connect(classNum, school, geArea, className, date, time, Integer.parseInt(sort));


        out.println("<html>");
        out.println("<body>");

        if (sort == null)
            out.println(geAreaList.find(geArea));
        else
            out.println(geAreaList.findByComparator(geArea, 0));
        out.println("</body></html>");
    }

    private void connect(String classNum, String collegeName, String geArea, String className, String date, String time, int sort) {
        // add
        geAreaList.add(new Class(classNum, collegeName, geArea, className, date, time));
        // search by area, no sorting
        System.out.println(geAreaList.find(geArea));

        // search by area, sorting by school (0) or teacher (1)
        System.out.println(geAreaList.findByComparator(geArea, sort));
    }

    private final GEAreaList geAreaList = new GEAreaList();
}
