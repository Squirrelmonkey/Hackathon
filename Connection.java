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
     * When add class to data base.
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
     * Called form HTML
     * @param geArea
     * @param sort
     */
    private void connect(String geArea, int sort) {
        // search by area, no sorting
        System.out.println(geAreaList.find(geArea));

        // search by area, sorting by school (0) or teacher (1)
        System.out.println(geAreaList.findByComparator(geArea, sort));
    }

    private final GEAreaList geAreaList = new GEAreaList();
}
