/**
 * Driver class.
 * Only for test.
 */
public class Driver {
    public static void main(String[] args) {
        Connection connection = new Connection();

        connection.add("019283", "San Jose State", "C2", "TA 13", "Fr", "10:00 - 12:00");
        connection.add("124315", "San Jose City College", "C2", "TA 05", "M W", "11:00 - 12:00");
        connection.add("019283", "De Anza College", "A2", "TA 13", "M W", "13:00 - 15:00");
        connection.add("124315", "San Jose City College", "A2", "TA 05", "T Th", "8:00 - 10:00");
        connection.add("019283", "San Jose State", "C2", "TA 13", "T Th", "10:00 - 12:00");
        connection.add("124315", "San Jose City College", "B2", "TA 05", "M W", "11:00 - 12:00");
        connection.add("019283", "De Anza College", "A2", "TA 13", "M W", "13:00 - 15:00");
        connection.add("124315", "San Jose City College", "B2", "TA 05", "T Th", "8:00 - 10:00");

        connection.connectTester("C2");
        connection.connectTester("C2", 0);
        connection.connectTester("B2", 1);
    }
}
