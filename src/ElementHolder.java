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
        elements.put("Cr", new Element("Chromium", 51.996, 6, 24));
        elements.put("Mn", new Element("Manganese", 54.938, 7, 25));
        elements.put("Fe", new Element("Iron", 55.845, 8, 26));
        elements.put("Co", new Element("Cobalt", 58.933, 9, 27));
        elements.put("Ni", new Element("Nickel", 58.693, 2, 28));
        elements.put("Cu", new Element("Copper", 63.546, 1, 29));
        elements.put("Zn", new Element("Zinc", 65.380, 2, 30));
        elements.put("Ga", new Element("Gallium", 69.723, 3, 31));
        elements.put("Ge", new Element("Germanium", 72.640, 4, 32));
        elements.put("As", new Element("Arsenic", 74.922, 5, 33));
        elements.put("Se", new Element("Selenium", 78.960, 6, 34));
        elements.put("Br", new Element("Bromine", 79.904, 7, 35));
        elements.put("Kr", new Element("Krypton", 83.798, 8, 36));
        elements.put("Rb", new Element("Rubidium", 85.468, 1, 37));
        elements.put("Sr", new Element("Stronium", 87.620, 2, 38));
        elements.put("Y", new Element("Yttrium", 88.906, 3, 39));
        elements.put("Zr", new Element("Zirconium", 91.224, 4, 40));
        elements.put("Nb", new Element("Niobium", 92.906, 5, 41));
        elements.put("Mo", new Element("Molybdenum", 95.950, 1, 42));
        elements.put("Tc", new Element("Technetium", 98, 7, 43));
        elements.put("Ru", new Element("Ruthenium", 101.07, 8, 44));
        elements.put("Rh", new Element("Rhodium", 102.91, 9, 45));
        elements.put("Pd", new Element("Palladium", 106.42, 10, 46));
        elements.put("Ag", new Element("Silver", 107.87, 1, 47));
        elements.put("Cd", new Element("Cadmium", 112.41, 2, 48));
        elements.put("In", new Element("Indium", 114.82, 3, 49));
        elements.put("Sn", new Element("Tin", 118.71, 4, 50));
        elements.put("Sb", new Element("Antimony", 121.76, 5, 51));
        elements.put("Te", new Element("Tellurium", 127.60, 6, 52));
        elements.put("I", new Element("Iodine", 126.90, 7, 53));
        elements.put("Xe", new Element("Xenon", 131.29, 8, 54));
        elements.put("Cs", new Element("Caesium", 132.91, 1, 55));
        elements.put("Ba", new Element("Barium", 137.33, 2, 56));
        elements.put("La", new Element("Lanthanum", 138.91, 3, 57));
        elements.put("Ce", new Element("Cerium", 140.12, 2, 58));
        elements.put("Pr", new Element("Praseodymium", 140.91, 3, 59));
        elements.put("Nd", new Element("Neodymium", 144.24, 3, 60));
        elements.put("Pm", new Element("Promethium", 145, 7, 61));
        elements.put("Sm", new Element("Samarium", 150.36, 2, 62));
        elements.put("Eu", new Element("Europium", 151.96, 6, 63));
        elements.put("Gd", new Element("Gadolinium", 157.25, 3, 64));
        elements.put("Tb", new Element("Terbium", 158.93, 2, 65));
        elements.put("Dy", new Element("Dysprosium", 162.5, 2, 66));
        elements.put("Ho", new Element("Holmium", 164.93, 2, 67));
        elements.put("Er", new Element("Erbium", 167.26, 2, 68));
        elements.put("Tm", new Element("Thulium", 168.93, 3, 69));
        elements.put("Yb", new Element("Ytterbium", 173.04, 2, 70));
        elements.put("Lu", new Element("Lutetium", 174.97, 2, 71));
        elements.put("Hf", new Element("Hafnium", 178.49, 2, 72));
        elements.put("Ta", new Element("Tantalum", 180.95, 2, 73));
        elements.put("W", new Element("Tungsten", 183.84, 2, 74));
        elements.put("Re", new Element("Rhenium", 186.21, 2, 75));
        elements.put("Os", new Element("Osmium", 190.23, 8, 76));
        elements.put("Ir", new Element("Iridium", 192.22, 9, 77));
        elements.put("Pt", new Element("Platinum", 195.08, 10, 78));
        elements.put("Au", new Element("Gold", 196.97, 1, 79));
        elements.put("Hg", new Element("Mercury", 200.59, 2, 80));
        elements.put("Ti", new Element("Thallium", 204.38, 3, 81));
        elements.put("Pb", new Element("Lead", 207.20, 4, 82));
        elements.put("Bi", new Element("Bismuth", 208.98, 5, 83));
        elements.put("Po", new Element("Polonium", 209, 6, 84));
        elements.put("At", new Element("Astatine", 210, 7, 85));
        elements.put("Rn", new Element("Radon", 222, 8, 86));
        elements.put("Fr", new Element("Francium", 223, 1, 87));
        elements.put("Ra", new Element("Radium", 226, 2, 88));
        elements.put("Ac", new Element("Actinium", 227, 3, 89));
        elements.put("Th", new Element("Thorium", 232.04, 4, 90));
        elements.put("Pa", new Element("Protactinium", 231.04, 2, 91));
        elements.put("U", new Element("Uranium", 238.03, 6, 92));
        elements.put("Np", new Element("Neptunium", 237.05, 7, 93));
        elements.put("Pu", new Element("Plutonium", 244, 2, 94));
        elements.put("Am", new Element("Americium", 243, 2, 95));
        elements.put("Cm", new Element("Curium", 247, 2, 96));
        elements.put("Bk", new Element("Berkelium", 247, 2, 97));
        elements.put("Cf", new Element("Californium", 251, 2, 98));
        elements.put("Es", new Element("Einsteinium", 252, 2, 99));
        elements.put("Fm", new Element("Fermium", 257, 2, 100));
        elements.put("Md", new Element("Mendelevium", 258, 2, 101));
        elements.put("No", new Element("Nobelium", 259, 2, 102));
        elements.put("Lr", new Element("Lawrencium", 262, 3, 103));
        elements.put("Rf", new Element("Rutherfordium", 267, 2, 104));
        elements.put("Db", new Element("Dubnium", 262, 5, 105));
        elements.put("Sg", new Element("Seaborgium", 269, 2, 106));
        elements.put("Bh", new Element("Bohrium", 264, 2, 107));
        elements.put("Hs", new Element("Hassium", 269, 2, 108));
        elements.put("Mt", new Element("Meitnerium", 278, 9, 109));
        elements.put("Ds", new Element("Darmstadtium", 281, 10, 110));
        elements.put("Rg", new Element("Roentgenium", 282, 2, 111));
        elements.put("Cn", new Element("Copernicium", 285, 2, 112));
        elements.put("Nh", new Element("Nihonium", 286, 3, 113));
        elements.put("Fl", new Element("Flerovium", 289, 4, 114));
        elements.put("Mc", new Element("Moscovium", 289, 5, 115));
        elements.put("Lv", new Element("Livermorium", 293, 6, 116));
        elements.put("Ts", new Element("Tennessine", 294, 7, 117));
        elements.put("Og", new Element("Oganesson", 294, 8, 118));
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
