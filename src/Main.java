//imports som gör så att man kan använda sig utav ArrayLists och JOptionpane
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Main {

    //konstanter som alla börjar med "private static final" de används inom klassen Main och kan inte tilldelas nya värden - static betyder att de tillhör klassen de skapats i
    private static final String PLANT_QUESTION = "Vilken växt ska få vätska?";
    private static final String EMPTY_NAME_MESSAGE = "Du måste ange ett växtnamn.";
    private static final String PLANT_NOT_FOUND = "Växten finns inte på hotellet.";

    private static final String MEATLOAF_NAME = "Meatloaf";
    private static final double MEATLOAF_HEIGHT = 0.7;
    private static final String IGGE_NAME = "Igge";
    private static final double IGGE_HEIGHT = 0.2;
    private static final String LAURA_NAME = "Laura";
    private static final double LAURA_HEIGHT = 5;
    private static final String OLOF_NAME = "Olof";
    private static final double OLOF_HEIGHT = 1;

    private static final String NEEDS_TEXT = " behöver ";
    private static final String LITERS_TEXT = " liter ";
    private static final String PER_DAY_TEXT = " per dag.";

    public static void main(String[] args) {

        //fyra olika objekt av tre olika växttyper, variablerna har gemensam typ "Plant" men olika växtobjekt på grund av polymorfism
        Plant köttväxt1 = new Köttväxt(MEATLOAF_NAME, MEATLOAF_HEIGHT);
        Plant cactus1 = new Cactus(IGGE_NAME, IGGE_HEIGHT);
        Plant palm1 = new Palm(LAURA_NAME, LAURA_HEIGHT);
        Plant palm2 = new Palm(OLOF_NAME, OLOF_HEIGHT);

        //En tom arraylist för referenser till växtobjekt då plants är variabelns namn och Plant gör så att alla växttyper passar då dem ärver från Plant
        ArrayList<Plant> plants = new ArrayList<>();
        //la in referenser till de olika växtobjekten
        plants.add(köttväxt1);
        plants.add(cactus1);
        plants.add(palm1);
        plants.add(palm2);

        //skapar en string "plantName" och visar frågan med plant question och ett inmatningsfält med JOPtionpane
        String plantName = JOptionPane.showInputDialog(PLANT_QUESTION);

        //kontroll om användaren tryckte avbryt eller stängde rutan och avslutar main så den inte fortsätter.
        if (plantName == null) {
            return;
        }

        //returnerar texten utan mellanslag i början och slutet ifall man råka skriva mellanslag i början eller slutet av ett namn och som sparar resultatet tillbaka i plantName
        plantName = plantName.trim();

        //kontrollerar ifall plantname är empty och avslutar main om det är, samt visar ett felmeddelande om användaren skriver in ett tomt meddelande -
        if (plantName.isEmpty()) {
            JOptionPane.showMessageDialog(null, EMPTY_NAME_MESSAGE);
            return;
        }

        //anropar metoden (findPlant) med listan och namnet användaren skrev in
        //resultatet sparas då i foundPlant som har typen Plant
        //den har typen plant som gör att variabeln kan referera till alla växttyper då dem ärver från Plant
        Plant foundPlant = findPlant(plants, plantName);

        //kontrollerar om ingen växt hittades - skriver ut ett felmeddelande om ingen växt hittades och sedan stänger main
        if (foundPlant == null) {
            JOptionPane.showMessageDialog(null, PLANT_NOT_FOUND);
            return;
        }

        //hämtar växtens namn, beräknar hur mycket vätska växten behöver, hämtar vätsketypens namn, innehåller olika String konstanter, sedan visar showmessagedialog hela meddelandet.
        //polymorfism används också här då foundPlant har typen Plant men t.ex ett palm-objekt kör sin egen uträkning och cactus sin
        JOptionPane.showMessageDialog(null, foundPlant.getNamn() + NEEDS_TEXT + foundPlant.calculateLiquidAmount() + LITERS_TEXT  + foundPlant.getLiquidType().getLiquidNames() + PER_DAY_TEXT);



    }

    //en sökmetod för att hitta rätt växtobjekt
    private static Plant findPlant(ArrayList<Plant> plants, String plantName) {

        //en for loop där plants är listan som metoden fått som parameter, "plant" refererar till en växt i taget
        for (Plant plant : plants) {

            //kontrollerar namnet på växten med plant.getNamn och jämför den med texten användaren skrev in genom plantName
            //om namnen matchar så avslutar return plant; sökmetoden och lämnar tillbaka växtreferensen
            //om ingen matchar så fortsätter for-loopen med nästa växt etc.. tills hela listan är kontrollerad. om fortfarande ingen matchar så körs return null;
            if (plantName.equalsIgnoreCase(plant.getNamn())) {
                return plant;
            }
        }
        return null;

    }
}