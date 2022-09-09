public class java0909 {

    public static void main(String[] args){

        /*
        * Órán a Dávid mondta, hogy dolgozatot fogunk írni, ahol
        * a négyzet, téglalap, és kör kerület, és területszámolást
        * lesz a téma. Annyi benne a csavar, hogy majd a felhasználónak
        * kell megadni az adatokat, és el kell dönteni, hogy téglalap,
        * vagy négyzet. Jövőhéten fogjuk elvileg venni a scannerezést,
        * azaz az inputokat
        */



        //Kör kerület, terület

        //kell deklarálnunk 2 számot. Célszerű ezeket double-lé tenni, hogyha nem egész szám lenne a sugár

        double d = 10;
        double r = 2/d;

        //ha itt mondjuk d-t intként, és értékének a 15-ötként adnánk
        //meg, akkor az 7.5. azt nem tudjuk int-ben használni,
        // emiatt célszerűbb double-t használni

        //kerület = d*pi

        double k = d*Math.PI; //Van a Math csomagban a Math.Pi, ami igaz, hogy ugyanaz, mint a 3.14, ezt adták meg, hogy használjuk
        System.out.println("Kerület = "+k);

        //terület = pi*r^2

        double t = Math.pow(r, 2)*Math.PI;
        System.out.println("Terület = "+t);

        /*Emellett vettük az if statementeket. Ezek Ugye a ha, különben dolgok.
        * használhatók értékek összehasonlítására, dolgok létezésének vizsgálásához
        * Mi ezt úgy használtuk, hogy egy háromszög kalkulátort raktunk össze
        */

        /*if alap használata

        if (ez == az){
            Parancstömb
        }

        a két egyenlőségjel arra utal, hogy az adott dolgoknak azonosnak kell lenniük.
         */


        boolean Igaz = true;    //a boolean az igaz vagy hamis, avagy 1 vagy 0 értéket jelöli.

        if (Igaz/*Lehezne ez Igaz == true- is, de ez redundáns lenne*/){
            System.out.println(Igaz);
        }

        double a = 60;
        double b = 30;
        double c = 50;

        if (a == 0 || b == 0 || c == 0){ //A || az ALTgr + W gombbal érhető el. Ez az if statement azt jelenti,
                                         // hogy Ha az A, vagy a B, vagy a c egyenlő nullával
            System.out.println("HIBA : az egyik vagy több oldala nulla");
        } else if (a + b >= c && a + c >= b && c + b >= a) { //A && olyan, az ALTgr + C gombbal érhető el.
                                                             // Ez az if statement azt jelenti, hogy
                                                             // ha két oldal nagyobb a harmadiknál
            //Kerület
            double K = a + b + c;

            System.out.println("A háromszüg kerülete = " + K);

            //Terület. Ez valamivel komplexebb, Nehezebben átlátható, ezért jó ötlet több komponensre szedni

            double s = K/2;
            double sMinusa = s-a;
            double sMinusb = s-b;
            double sMinusc = s-c;

            Double T = Math.sqrt(s*sMinusa*sMinusb*sMinusc);
            System.out.println("A háromszög területe"+T);

        }else{
            System.out.println("HIBA : Háromszög nem szerkeszthető");
        }

        double szam = 4;

        if (1 < szam && szam < 10) {        //az és operátorral lehet összetett ifeket is írni

            System.out.println("1 és 10 között van");
        }

    }
}
