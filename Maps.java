import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // Creates a new instance
        HashMap<String, Integer> empIds = new HashMap<>();

        // Inputs the key values into the map
        empIds.put("John", 123456);
        empIds.put("Carl", 654321);
        empIds.put("Jerry", 85236);

        // Prints list of values in the map
        System.out.println(empIds);

        // Prints out empId of Carl
        System.out.println(empIds.get("Carl"));

        // Checks to see if Jerry has empId
        System.out.println(empIds.containsKey("Jerry"));

        // Checks map for certain values
        System.out.println(empIds.containsValue(123456));

        // Adds/Overrides values to the map
        empIds.put("John", 8675309);
        System.out.println(empIds);
    }

}
