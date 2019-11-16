
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

    public void add(Class aClass) {
        classes.add(aClass);
    }

    public String findAll() {
        iterator = classes.iterator();
        String result = "";
        System.out.println("Output : \n");

        while (iterator.hasNext())
            result += iterator.next() + "\n";

        return result;
    }

    public String byComparator(int comparator) {
        if (comparator == 0)
            Collections.sort(classes, Class.comparatorBySchool());
        else if (comparator == 1)
            Collections.sort(classes, Class.comparatorByTeacher());


        System.out.println("With sorting...");
        return findAll();
    }

    Iterator iterator;
    List<Class> classes;
}
