
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Stores classes having same GE area.
 */
public class ClassList {
    public ClassList() {
        classes = new LinkedList<>();
        iterator = classes.iterator();
    }

    /**
     * Add class to class list.
     * @param aClass
     */
    public void add(Class aClass) {
        classes.add(aClass);
    }

    /**
     * Find all classes.
     * @return all classes.
     */
    public String findAll() {
        iterator = classes.iterator();
        String result = "";
        System.out.println("Output : \n");

        while (iterator.hasNext())
            result += iterator.next() + "\n";

        return result;
    }

    /**
     * Find with comparator.
     * @param comparator
     * @return Find all classes in a order.
     */
    public String byComparator(int comparator) {
        if (comparator == 0)
            Collections.sort(classes, Class.comparatorBySchool());
        else if (comparator == 1)
            Collections.sort(classes, Class.comparatorByTeacher());


        System.out.println("With sorting...");
        return findAll();
    }

    private Iterator iterator;
    private final List<Class> classes;
}
