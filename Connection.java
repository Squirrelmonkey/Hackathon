// this class will be connector of front and back.

public class Connection {
    public Connection() {
        this.geAreaList = new GEAreaList();
        test();
    }

    public void test() {
        // add
        geAreaList.add(new Class("11111", "San Jose State", "C2", "TA 13", "M W", "10:00 - 12:00"));
        geAreaList.add(new Class("11112", "San Jose City College", "C2", "TA 13", "T Th", "10:00 - 12:00"));
        geAreaList.add(new Class("11113", "De Anza College", "B2", "TA 13", "M W", "8:00 - 10:00"));
        geAreaList.add(new Class("11114","San Jose State",  "C2", "TA 13", "T Th", "8:00 - 10:00"));
        geAreaList.add(new Class("123456", "San Jose State", "A1", "TA 13", "M W", "10:00 - 12:00"));
        geAreaList.add(new Class("11123412", "San Jose City College", "A2", "TA 13", "T Th", "10:00 - 12:00"));
        geAreaList.add(new Class("1671113", "De Anza College", "A2", "TA 13", "M W", "8:00 - 10:00"));
        geAreaList.add(new Class("1111784","San Jose State",  "B2", "TA 13", "T Th", "8:00 - 10:00"));

        // search by area, no sorting
        System.out.println(geAreaList.find("C2"));
        System.out.println(geAreaList.find("A2"));
        System.out.println(geAreaList.find("A1"));

        // search by area, sorting by school
        System.out.println(geAreaList.findByComparator("C2", 0));

        // search by area, sorting by teacher
        System.out.println(geAreaList.findByComparator("C2", 1));
    }

    private final GEAreaList geAreaList;
}
