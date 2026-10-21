//en public enum så att andra klasser kan använda sig utav den
public enum LiquidType {

    //tre enumvärden och varje värde har olika namn som skickas till konstruktorn nedan
    TAP_WATER("kranvatten"), MINERAL_WATER("mineralvatten"),
    PROTEIN_DRINK("proteindryck");
    //semikolon för att avsluta listan så att man kan skriva metoder/fält

    //ett fält som lagrar namnen för varje enumvärde
    //final så att värdet inte kan tilldelas på nytt och private så att andra klasser inte kan nå fältet direkt
    private final String liquidNames;


    //konstruktorn som tar emot namnen i enumvärdena
    private LiquidType(String liquidNames) {
        //tar värdet från parametern och sparar det i objektets fält
        this.liquidNames = liquidNames;
    }

    //getter så att andra klasser kan hämta namnen som text
    public String getLiquidNames() {
        return liquidNames;
    }
}
