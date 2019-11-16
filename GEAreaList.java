
import java.util.LinkedList;
import java.util.List;

/**
 * GEAreaList has 13 ClassLists for each area.
 */
public class GEAreaList {

    /**
     * Constructor
     */
    public GEAreaList() {
        geAreaList = new LinkedList<>();
        makeList();
    }

    /**
     * Add class to ge list
     * @param aClass
     */
    public void add(Class aClass) {
        geAreaList.get(aClass.getGeAreaIndex()).add(aClass);
    }

    /**
     * Find class with GE Area
     * @param geArea GE
     * @return all classes for a GE
     */
    public String find(String geArea) {
        return geAreaList.get(getGeAreaIndex(geArea)).findAll();
    }

    /**
     * Find class with GE Area in a order.
     * @param geArea
     * @param comp way to compare.
     * @return all classes for a GE in a order.
     */
    public String findByComparator(String geArea, int comp){
        return geAreaList.get(getGeAreaIndex(geArea)).byComparator(comp);
    }

    private void makeList() {
        // A1 ~ E 13 area
        for (int i = 0; i < 13; i++)
            geAreaList.add(new ClassList());
    }

    private int getGeAreaIndex(String geArea) {
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

    private final List<ClassList> geAreaList;

}
