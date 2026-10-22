public enum LiquidType {

    //tre enumvärden och varje värde har olika namn som skickas till konstruktorn nedan
    TAP_WATER("kranvatten"), MINERAL_WATER("mineralvatten"),
    PROTEIN_DRINK("proteindryck");
    
    private final String liquidNames;
    
    private LiquidType(String liquidNames) {
        this.liquidNames = liquidNames;
    }
    
    public String getLiquidNames() {
        return liquidNames;
    }
}
