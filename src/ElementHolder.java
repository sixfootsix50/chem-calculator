import java.util.Map;
import java.util.HashMap;

public class ElementHolder {
    final static private Map<String, Element> elements = new HashMap<>();
    static{
        elements.put("H", new Element("Hydrogen", 1.0078, 1, 1)); //atomic mass, valence electrons, atomic number
        elements.put("He", new Element("Helium", 4.0026, 2, 2));
        elements.put("Li", new Element("Lithium", 6.9410, 1, 3));
        elements.put("Be", new Element("Beryllium", 9.0122, 2, 4));
        elements.put("B", new Element("Boron", 10.811, 3, 5));
        elements.put("C", new Element("Carbon", 12.011, 4, 6));
        elements.put("C", new Element("Nitrogen", 14.007, 5, 7));
        elements.put("O", new Element("Oxygen", 15.999, 6, 8));
        elements.put("F", new Element("Fluorine", 18.998, 7, 9));
        elements.put("Ne", new Element("Neon", 20.180, 8, 10));
        elements.put("Na", new Element("Sodium", 22.990, 1, 11));
        elements.put("Mg", new Element("Magnesium", 24.305, 2, 12));
        elements.put("Al", new Element("Aluminum", 26.982, 3, 13));
        elements.put("Si", new Element("Silicon", 28.086, 4, 14));
        elements.put("P", new Element("Phosphorus", 30.974, 5, 15));
        elements.put("S", new Element("Sulfur", 32.065, 6, 16));
        elements.put("Cl", new Element("Chlorine", 35.453, 7, 17));
        elements.put("Ar", new Element("Argon", 39.948, 8, 18));
        elements.put("K", new Element("Potassium", 39.098, 1, 19));
        elements.put("Ca", new Element("Calcium", 40.078, 2, 20));
        elements.put("Sc", new Element("Scandium", 44.956, 3, 21));
        elements.put("Ti", new Element("Titanium", 47.867, 4, 22));
        elements.put("V", new Element("Vanadium", 50.942, 5, 23));
    }
    
    public static Element[] stringArrayToElements(String[] input){
        Element[] temp = new Element[input.length];
        for (int i = 0; i < input.length; i++){
            temp[i] = elements.get(input[i]);
        }
        return temp;
    }
    public static Element stringToElement(String input){
        return elements.get(input);
    }
}
