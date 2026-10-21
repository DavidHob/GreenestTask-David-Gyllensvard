public class Cactus extends Plant {

    private static final double LITER_PER_DAY = 0.02;

    public Cactus (String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double calculateLiquidAmount() {

        return LITER_PER_DAY;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
