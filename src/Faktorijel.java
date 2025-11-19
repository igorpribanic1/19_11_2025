import java.io.InputStream;
import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {
        String korisnickiUnos = "";
        int broj = 0;
        int rezultat = 0;
        Scanner sc = new Scanner(System.in);
        boolean whileFlag = true;

        while(whileFlag) {
            System.out.println("Upišite cijeli broj za kojeg želite izračunati faktorijel: ");
            korisnickiUnos = sc.nextLine();

            try{
                broj = Integer.parseInt(korisnickiUnos);
                whileFlag = false;
            } catch(Exception e){
                System.err.println("Niste upisali cijeli broj!. Potrebno je ponoviti upis broja.");
                whileFlag = true;
            }
        }


        try{
            rezultat = racunajFaktorijel(broj);
            System.out.println("Faktorijel broja " + broj + " je " + rezultat);
        } catch(Exception e){
            System.err.println(e.getMessage());
        }

    }

    public static int racunajFaktorijel(int broj) throws Exception{
        int faktorijel = 1;

        if(broj < 0){
            throw new Exception("Faktorijel nije moguće izračunati za negativan broj.");
        }

        if(broj > 31){
            throw new Exception("Faktorijel nije moguće izračunati jer je broj prevelik.");
        }

        for (int i = 1; i <= broj; i++) {
            faktorijel = faktorijel * i;
        }


        return faktorijel;
    }
}
