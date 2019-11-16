import java.util.Comparator;

public class Class {

    public Class(String classNum, String collegeName, String geArea, String className, String date, String time, String teacher) {
        this.classNum = classNum;
        this.collegeName = collegeName;
        this.geArea = geArea;
        this.className = className;
        this.date = date;
        this.time = time;
        this.teacher = teacher;
    }

    public Class(String classNum, String collegeName, String geArea, String className, String date, String time) {
        this.classNum = classNum;
        this.collegeName = collegeName;
        this.geArea = geArea;
        this.className = className;
        this.date = date;
        this.time = time;
        this.teacher = "Staff";
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreReq(String preReq) {
        this.preReq = preReq;
    }

    public String getClassNum() {
        return classNum;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getDescription() {
        return description;
    }

    public String getPreReq() {
        return preReq;
    }

    public String getGeArea() {
        return geArea;
    }

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

    public String getClassName() {
        return className;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getTeacher() {
        return teacher;
    }

    public void addDescription(String description) {
        this.description = description;
    }

    public void addPreReq(String preReq) {
        this.preReq = preReq;
    }

    public String toString() {
        return collegeName + "  " + classNum + "  " + geArea + " :  " + className + "  " + date + "  " + time + "  " + teacher + "\n"
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
