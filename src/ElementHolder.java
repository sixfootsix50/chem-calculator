import java.util.Map;
import java.util.HashMap;

public class ElementHolder {
    final static private Map<String, Element> elements = new HashMap<>();
    static{
        elements.put("H", new Element("Hydrogen", 1.0078, 1, 1));
        elements.put("He", new Element("Helium", 4.0026, 2, 2));
        elements.put("Li", new Element("Lithium", 6.9410, 1, 3));
    }
    
    public static Element[] stringToElement(String[] input){
        Element[] temp = new Element[input.length];
        for (int i = 0; i < input.length; i++){
            temp[i] = elements.get(input[i]);
        }
        return temp;
    }
}
