public class inputHandler {
    
    public static String[] splitInput(String input){ //takes input and splits the string at each capital letter
        return input.split("(?=\\p{Upper})");
    }
    
    public static double atomicMass(Element[] input){
        if (input[0] == null){
            return 0.0;
        }
        double total = 0;
        for (Element i: input){
            total += (double)i.getMass();
        }
        return total;
    }
}
