
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Main {
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

        ArrayList<Plant> plants = new ArrayList<>();
      
        plants.add(köttväxt1);
        plants.add(cactus1);
        plants.add(palm1);
        plants.add(palm2);

    
        String plantName = JOptionPane.showInputDialog(PLANT_QUESTION);

        if (plantName == null) {
            return;
        }

        plantName = plantName.trim();

        if (plantName.isEmpty()) {
            JOptionPane.showMessageDialog(null, EMPTY_NAME_MESSAGE);
            return;
        }

        Plant foundPlant = findPlant(plants, plantName);

        if (foundPlant == null) {
            JOptionPane.showMessageDialog(null, PLANT_NOT_FOUND);
            return;
        }

        //Polymorfism används också här då foundPlant har typen Plant men t.ex ett palm-objekt kör sin egen uträkning och cactus sin samma sak med vätsketyp
        JOptionPane.showMessageDialog(null, foundPlant.getNamn() + NEEDS_TEXT + foundPlant.calculateLiquidAmount() + LITERS_TEXT  + foundPlant.getLiquidType().getLiquidNames() + PER_DAY_TEXT);



    }

    //en sökmetod för att hitta rätt växtobjekt
    private static Plant findPlant(ArrayList<Plant> plants, String plantName) {

        for (Plant plant : plants) {
            if (plantName.equalsIgnoreCase(plant.getNamn())) {
                return plant;
            }
        }
        return null;

    }
}
