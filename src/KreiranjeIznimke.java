public class KreiranjeIznimke {
    public static void main(String[] args){
        try {
            izracunajKorijen(-1);
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public static double izracunajKorijen(double broj) throws Exception{
        if(broj < 0.0){
            throw new Exception("Broj ne smije biti negativan");
        }
        return Math.sqrt(broj);
    }
}
