//Köttväxt ärver från Plant med "extends Plant" och ärver metoderna getHöjd/Namn som har skapats i Plant. Så Köttväxt blir till en sorts "Plant" genom arvet.
public class Köttväxt extends Plant {
    private static final double BASE_AMOUNT = 0.1;
    private static final double LITER_PER_METER = 0.2;
    public Köttväxt(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double calculateLiquidAmount() {

        return BASE_AMOUNT + (LITER_PER_METER * getHöjd());
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
