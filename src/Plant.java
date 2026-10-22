//Implements waterable kopplar klassen till interfacets kontrakt och med abstract så kan Plant inte skapas som ett eget objekt
// och kan låta underklasserna implementera interfacets metoder
public abstract class Plant implements Waterable {

    //Inkapsling för privata fält så att andra klasser inte kan komma åt fälten direkt,
    private final String namn;
    private final double höjd;

    public Plant (String namn, double höjd) {
        this.höjd = höjd;
        this.namn = namn;
    }
    public String getNamn() {
        return namn;
    }

    public double getHöjd() {
        return höjd;
    }
}
