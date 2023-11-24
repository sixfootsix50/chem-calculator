public class inputHandler {
    
    public static String[] splitInput(String input){ //takes input and splits the string at each capital letter
        return input.split("(?=\\p{Upper})");
    }
    
}
