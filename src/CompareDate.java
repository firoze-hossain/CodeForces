import java.util.*;

public class CompareDate {

    public static void main(String args[]) {
        Map<Integer, String> inputMap = new HashMap();
        inputMap.put(1, "21-03-2022");//format (dd-MM-yyyy) - fixed
        inputMap.put(2, "21-03-2022");
        inputMap.put(3, "21-03-2022");
        inputMap.put(4, "21-05-2022");
        inputMap.put(5, "21-05-2022");
        inputMap.put(6, "21-02-2022");
        inputMap.put(7, "21-02-2022");
        inputMap.put(8, "21-08-2022");
        inputMap.put(9, "21-09-2022");
        inputMap.put(10, "21-02-2022");
        inputMap.put(11, "21-02-2022");
        inputMap.put(12, "21-02-2022");

        Map<Integer, String> matchedMap = new HashMap();
        Map<Integer, String> unmatchedMap = new HashMap();

        System.out.println("----------------------------------------------------");
        for (Map.Entry<Integer, String> entry : inputMap.entrySet()) {
            String date = entry.getValue();
            String month = date.substring(3, 5);
            if (entry.getKey() == Integer.parseInt(month)) {
                System.out.println("--Matched Key: " + entry.getKey());
                matchedMap.put(entry.getKey(), entry.getValue());
            } else {
                unmatchedMap.put(entry.getKey(), entry.getValue());
            }
        }
        //matchedMap
        System.out.println("--------------------Matched Date------------------------");
        for (Map.Entry<Integer, String> entry : matchedMap.entrySet()) {
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
        System.out.println("----------------------UnMatched Date---------------------");
        //unmatchedMap
        for (Map.Entry<Integer, String> entry : unmatchedMap.entrySet()) {
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
        System.out.println("-----------------------------------------------------");
    }
}