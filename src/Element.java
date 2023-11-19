public class Element {
    private final String elementName;
    private final double atomicMass;
    private final int valenceElectrons;
    private final int atomicNum;
    
    public Element(String elementName, double atomicMass, int valenceElectrons, int atomicNum){
        this.elementName = elementName;
        this.atomicMass = atomicMass;
        this.valenceElectrons = valenceElectrons;
        this.atomicNum = atomicNum;
    }
    
    public String getName(){
        return elementName;
    }
    
    public double getMass(){
        return atomicMass;
    }
    
    public int getValence(){
        return valenceElectrons;
    }
    
    public int getAtomicNum(){
        return atomicNum;
    }
    
}
