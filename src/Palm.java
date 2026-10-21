//Palm ärver från Plant med "extends Plant" och ärver metoderna getHöjd/Namn som har skapats i Plant. Så Palm blir till en sorts "Plant" genom arvet.
public class Palm extends Plant{

    //en privat konstant för just palm som är för att varje palm behöver 0.5 liter per dag per meter
    private static final double LITER_PER_METER = 0.5;


    //konstruktorn som tar emot namn och höjd när ett nytt palm objekt skapas
    public Palm (String namn, double höjd) {
        //med hjälp av super så kan palm anropa konstruktorn i plant och som sedan sparar
        // värdena i privata fält i plant
        super(namn, höjd);
    }


    //override ber java kontrollera att metoden stämmer med en metod som ärvs eller krävs av interfacet
    @Override
    //metod för att beräkna palmens vätskebehov
    //den multiplicerar liter per meter med palmens höjd.
    public double calculateLiquidAmount() {
        return LITER_PER_METER * getHöjd();
    }


    //samma uppgift som ovan "java kontrollerar att metoden stämmer med kontraktet"
    @Override
    //metod som ska returnera palmens vätsketyp
    public LiquidType getLiquidType() {
        //returnerar enumvärdet TAP_WATER som i detta fall respresenterar kranvatten.
        return LiquidType.TAP_WATER;
    }
}
