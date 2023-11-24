public class CalcLogic {
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
