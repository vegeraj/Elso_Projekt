/*
 * For Classes: Begin with Capital letter, continue with small letter, all of the words begin with Capital letter
 * For example: MyClassWithMoreWords
 *
 * For Methods: Begin with small letter,  continue with small letter, all of the other words begin with Capital letter
 * For example: anotherGoodMethodName
 */

//A Scanner osztály elérhetősége:
import java.util.Scanner;

/**
 * Dokumentációs célú megjegyzés:
 * Main osztályról mit tartasz fontosnak
 */
public class Main {
    // Single comments
    public static void main(String[] args) {
        //A változók elnevezése kisbetűs
        //A nyelv case-sensitive!
        //int szam = 123;
        //int szam = 0x123;
        int szam = 0123;
        //Literálok:
        // Számrendszerek: 0x 16-os számrendszer, bevezető 0: 8-as számrendszer
        System.out.println("A szám értéke: " + szam);
        //A szám mögötti f: float típusú, enélkül double típus
        float pi = 3.1415f;
        System.out.println("Pi = " + pi);
        double pi2 = 3.1415;
        System.out.println("Pi2 = " + pi2);
        double tort = 45.7e3;
        System.out.println("Tört = " + tort);
        char karakter = '\u2713';
        System.out.println("Karakter = " + karakter);
        String szoveg = "barackpálinka";
        System.out.println("Szöveg: " + szoveg.substring(0,6));
        boolean flag = true;
        if (flag) {
            System.out.println("Igaz a flag értéke");
        }

        //Beolvasás a billentyűzetről a Scanner osztály felhasználásával
        //Példányosítom a Scanner osztályt: létrehozok egy input objektumot
        Scanner input = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        //szam = input.nextInt();
        //Előbb bekérem szövegként (enterrel együtt), majd parse-olom egésszé:
        szam = Integer.parseInt(input.nextLine());
        System.out.println("A kapott szám: " + szam);
        //Kiürítjük a puffert egy újabb bekéréssel:
        //input.nextLine();
        System.out.print("Adj meg egy szöveget: ");
        szoveg = input.nextLine();
        System.out.println("A kapott szöveg: " + szoveg);
        //Új sor beszúrása

    }
}



