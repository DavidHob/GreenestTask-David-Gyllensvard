//Skapade ett interface som anger vilka metoder som ska finnas och det är växtklasserna som bestämmer hur metoderna ska implementeras.
public interface Waterable {
    public double calculateLiquidAmount();
    public LiquidType getLiquidType();
}
