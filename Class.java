import java.util.Comparator;

/**
 * Class object.
 */
public class Class {

    /**
     * Full argument Constructor.
     * @param classNum class number
     * @param collegeName college name
     * @param geArea GE Area
     * @param className class name
     * @param date date
     * @param time time
     * @param teacher teacher
     */
    public Class(String classNum, String collegeName, String geArea, String className, String date, String time, String teacher) {
        this.classNum = classNum;
        this.collegeName = collegeName;
        this.geArea = geArea;
        this.className = className;
        this.date = date;
        this.time = time;
        this.teacher = teacher;
    }

    /**
     * argument Constructor.
     * @param classNum class number
     * @param collegeName college name
     * @param geArea GE Area
     * @param className class name
     * @param date date
     * @param time time
     */
    public Class(String classNum, String collegeName, String geArea, String className, String date, String time) {
        this.classNum = classNum;
        this.collegeName = collegeName;
        this.geArea = geArea;
        this.className = className;
        this.date = date;
        this.time = time;
        this.teacher = "Staff";
    }

    /**
     * Change of Date.
     * @param date date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Change time
     * @param time time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Set teacher
     * @param teacher teacher
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * Set description for this class.
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Set PreRequisite for this class.
     * @param preReq pre requisite.
     */
    public void setPreReq(String preReq) {
        this.preReq = preReq;
    }

    /**
     * Get class number.
     * @return class number.
     */
    public String getClassNum() {
        return classNum;
    }

    /**
     * Get college name
     * @return college name
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get preRequisite
     * @return prerequisite
     */
    public String getPreReq() {
        return preReq;
    }

    /**
     * Get GEArea.
     * @return GE Area
     */
    public String getGeArea() {
        return geArea;
    }

    /**
     * Get GE Area in number.
     * @return GE Area in number.
     */
    public int getGeAreaIndex() {
        if (geArea == "A1")
            return 0;
        else if (geArea == "A2")
            return 1;
        else if (geArea == "A3")
            return 2;
        else if (geArea == "B1")
            return 3;
        else if (geArea == "B2")
            return 4;
        else if (geArea == "B3")
            return 5;
        else if (geArea == "B4")
            return 6;
        else if (geArea == "C1")
            return 7;
        else if (geArea == "C2")
            return 8;

        // continue
        return -1;
    }

    /**
     * Get class name.
     * @return class name.
     */
    public String getClassName() {
        return className;
    }

    /**
     * Get date.
     * @return Get name of this class.
     */
    public String getDate() {
        return date;
    }

    /**
     * Get time.
     * @return time of this class.
     */
    public String getTime() {
        return time;
    }

    /**
     * Get teacher
     * @return teacher.
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * Add description.
     * @param description description
     */
    public void addDescription(String description) {
        this.description = description;
    }

    /**
     * Add Prerequisite.
     * @param preReq prerequisite
     */
    public void addPreReq(String preReq) {
        this.preReq = preReq;
    }

    /**
     * Output this class as string.
     * @return string's this class.
     */
    public String toString() {
        return collegeName + "\t  " + classNum + "  " + geArea + " :  " + className + "  " + date + "  " + time + "  " + teacher + "\n"
                + "\tDescription: " + description + " \n\tPreRequisite: " + preReq;
    }

    /**
     * Comparator by school.
     * @return Comparator
     */
    public static Comparator<Class> comparatorBySchool() {
        return new Comparator<Class>() {
            /**
             * Compare two messages by school.
             * @param class1 first school
             * @param class2 second school
             * @return 1 if
             */
            public int compare(Class class1, Class class2) {
                return class1.getCollegeName().compareTo(class2.getCollegeName());
            }
        };
    }

    /**
     * Comparator by teacher.
     * @return Comparator
     */
    public static Comparator<Class> comparatorByTeacher() {
        return new Comparator<Class>() {
            /**
             * Compare two messages by school.
             * @param class1 first school
             * @param class2 second school
             * @return 1 if
             */
            public int compare(Class class1, Class class2) {
                return class1.getTeacher().compareTo(class2.getTeacher());
            }
        };
    }

    private final String classNum; // key
    private final String collegeName;
    private final String geArea; // GE Area
    private final String className;
    private String date;
    private String time;
    private String teacher;
    private String description = "";
    private String preReq = "";
}
