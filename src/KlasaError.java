import java.util.ArrayList;

public class KlasaError {
    public static void main(String[] args) {
        try{
            ArrayList<String> znakovniNiz = new ArrayList<>();
            while (true){
                znakovniNiz.add("Znakovni dodatak");
            }
        } catch (OutOfMemoryError e){
            System.err.println("Greška: " + e.getMessage());
        } finally {
            System.out.println("Kraj programa");
        }
    }
}
