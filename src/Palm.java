//Palm ärver från Plant med "extends Plant" och ärver metoderna getHöjd/Namn som har skapats i Plant. Så Palm blir till en sorts "Plant" genom arvet.
public class Palm extends Plant{
    private static final double LITER_PER_METER = 0.5;

    public Palm (String namn, double höjd) {
        super(namn, höjd);
    }
    @Override
    public double calculateLiquidAmount() {
        return LITER_PER_METER * getHöjd();
    }
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }
}
