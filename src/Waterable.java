//Skapade ett interface som anger vilka metoder som ska finnas och det är växtklasserna som
// bestämmer hur metoderna ska implementeras.
public interface Waterable {
    //metod för att beräkna hur mycket vätska som behövs för varje växt
    public double calculateLiquidAmount();

    //metod för att få vätsketypen
    public LiquidType getLiquidType();
}
