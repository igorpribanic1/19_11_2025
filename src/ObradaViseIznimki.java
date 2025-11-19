public class ObradaViseIznimki {
    public static void main(String[] args) {
        int broj = 0;
        String unos = "1234";
        int[] polje = {1, 2, 3};

        try{
            //1. greška - Pogrešan unos broja
            broj = Integer.parseInt(unos);
            //2. greška - Pristup nepostojećem elementu polja
            broj = polje[2];
            //3. greška - Dijeljenje s nulom
            broj = broj / 0;
        } catch (NumberFormatException e){
            System.err.println("Pogrešan unos broja - unesen znak");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Dohvat nepostojećeg elementa polja");
        } catch (Exception e){
            System.err.println("Sve ostale iznimke: " + e.getMessage());
        }


        System.out.println("Kraj programa: " + broj);
    }
}
