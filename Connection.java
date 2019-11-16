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

    /**
     * Get parameter from HTML
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String geArea = request.getParameter("geArea");
        String sort = request.getParameter("sort");

        connect(geArea, Integer.parseInt(sort));

        out.println("<html>");
        out.println("<body>");

        if (sort == null)
            out.println(geAreaList.find(geArea));
        else
            out.println(geAreaList.findByComparator(geArea, 0));
        out.println("</body></html>");
    }

    /**
     * add class to data base.
     * @param classNum class number
     * @param collegeName college name
     * @param geArea GE Area
     * @param className class name
     * @param date date
     * @param time time
     */
    public void add(String classNum, String collegeName, String geArea, String className, String date, String time) {
        // add
        geAreaList.add(new Class(classNum, collegeName, geArea, className, date, time));
    }

    /**
     * add class to data base.
     * @param classNum class number
     * @param collegeName college name
     * @param geArea GE Area
     * @param className class name
     * @param date date
     * @param time time
     * @param teacher teacher
     */
    public void add(String classNum, String collegeName, String geArea, String className, String date, String time, String teacher) {
        // add
        geAreaList.add(new Class(classNum, collegeName, geArea, className, date, time, teacher));
    }

    public void connectTester(String geArea, int sort) {
        connect(geArea, sort);
    }

    public void connectTester(String geArea) {
        connect(geArea, 0);
    }

    /**
     * Called form HTML.
     * @param geArea from HTML
     * @param sort sorting option from HTML
     */
    private void connect(String geArea, int sort) {
        // search by area, no sorting
        System.out.println(geAreaList.find(geArea));

        // search by area, sorting by school (0) or teacher (1)
        System.out.println(geAreaList.findByComparator(geArea, sort));
    }

    private final GEAreaList geAreaList = new GEAreaList();
}
