import java.util.Map;
import java.util.HashMap;

public class inputHandler {
    final static private Map<String, Double> elements = new HashMap<>();
    static{
        elements.put("H", 1.008);
        elements.put("He", 4.0026);
    }
    
    public static String[] splitInput(String input){ //takes input and splits the string at each capital letter
        //System.out.println(Arrays.toString(input.split("(?=\\p{Upper})"))); //test
        return input.split("(?=\\p{Upper})");
    }
    
    public static double atomicMass(String[] input){
        double total = 0;
        for (String i: input){
            total += (double)elements.get(i);
        }
        return total;
    }
}
