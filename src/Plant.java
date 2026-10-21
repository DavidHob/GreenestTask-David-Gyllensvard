//Implements waterable kopplar klassen till interfacets kontrakt och med abstract så kan Plant inte skapas som ett eget objekt
// och kan låta underklasserna implementera interfacets metoder
public abstract class Plant implements Waterable {

    //Inkapsling för privata fält så att andra klasser inte kan komma åt fälten direkt,
    //gettersna ger andra klasser möjlighet att läsa värdena.
    //fälten lagrar namn och höjd som sedan tilldelas i konstruktorn och kan inte tilldelas på nytt pga final
    private final String namn;
    private final double höjd;


    //konstruktorn är public så att underklasser kan använda den genom "super"
    // tar emot namn och höjd i parametrarna
    public Plant (String namn, double höjd) {

        //tar värdet från parametern och sparar det i objektets fält
        this.höjd = höjd;
        this.namn = namn;
    }

    //public getters så andra klasser kan anropa metoden/metoderna
    public String getNamn() {
        return namn;
    }

    public double getHöjd() {
        return höjd;
    }
}
