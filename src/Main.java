import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


// ==============1 uzduotis =========================

        System.out.println("==================== 1 užduotis ====================");
        // sukurti cikla, kuris spausdins 10 kartu zodi "labas"

        for (int i = 0; i < 10; i++) {
            System.out.println("Labas");
        }

        // ==============2 uzduotis =========================

        System.out.println("==================== 2 užduotis ====================");

        // Ciklas, kuris spausdina skaicius nuo 0 iki 9

        int numb = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(numb + " arba jei imtume... " + i);
            numb++;
        }


        // ==============3 uzduotis =========================

        System.out.println("==================== 3 užduotis ====================");

        // Sukurkite masyvą su dešimt augalų pavadinimų


        String[] plants = {"liepa", "tuja", "ažuolas", "gluosnis", "vyšnia", "slyva", "kaštonas", "klevas", "obelis", "šermukšnis"};
        System.out.println("Atsakymas: nieko spausdinti nereikia");

        // ==============4 uzduotis =========================

        System.out.println("==================== 4 užduotis ====================");
        // Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje

        for (int i = 0; i < 10; i++) {
            System.out.println(plants[i]);
        }

        // ==============5 uzduotis =========================

        System.out.println("==================== 5 užduotis ====================");
        // Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju.
        // (atvirkščias ciklas).


        for (int i = 10 - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }


        // ==============6 uzduotis =========================

        System.out.println("==================== 6 užduotis ====================");

        // Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);


        for (int i = 10; i < 50; i++) {
            if (i % 2 == 0) { // jei skaicius porinis, tada spausdinti skaiciu
                System.out.println(i);
            }
        }


        // ==============7 uzduotis =========================

        System.out.println("==================== 7 užduotis ====================");
        //Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius)
        // Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite.( naudokite continue.)
        // (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)


        for (int num = 10; num < 50; num++) {
            // jei dalinasi is 10 be liekanos, tada continue
            if (num % 10 == 0) {
                continue;
            }
            if (num % 2 == 0) { // jei skaicius porinis, tada spausdinam
                System.out.println(num);
            }
        }


        // ==============8 uzduotis =========================

        System.out.println("==================== 8 užduotis ====================");


        // Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę;

        int count = 0;
        for (int i = 0; i < 20; i++) { // ar "iki 20" reiskia, kad 20 irgi turi patekti i cikla?
            if (i % 2 == 0) { // jei skaicius porinis, tada ji suskaiciuoti
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Porine reiksme pasitaike tiek kartu: " + count);


        // ==============9 uzduotis =========================

        System.out.println("==================== 9 užduotis ====================");

        // Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai, ir kiek
        // ilgesnių nei 7 simboliai. (du skaičiavimai)


        int count91 = 0;
        for (int i = 0; i < plants.length - 1; i++) {
            if (plants[i].length() < 5) {
                System.out.println(plants[i]);
                count91++;
            }
        }

        System.out.println("Zodziai trumpesni nei 5 raides: " + count91);

        int count92 = 0;
        for (int i = 0; i < plants.length - 1; i++) {
            if (plants[i].length() > 7) {
                System.out.println(plants[i]);
                count92++;
            }
        }
        System.out.println("Zodziai ilgesni nei 7 raides: " + count92);


        // ==============10 uzduotis =========================

        System.out.println("==================== 10 užduotis ====================");

        // Suskaičiuoti kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių  nei 10 simboliai.
        // (tarp 5 ir 10 simbolių ilgio)


        int count10 = 0;
        for (int i = 0; i < plants.length - 1; i++) {
            if (plants[i].length() > 5 && plants[i].length() < 10) {
                System.out.println(plants[i]);
                count10++;
            }
        }

        System.out.println("Zodziai ilgesni nei 5, bet trumpesni nei 10 raidziu: " + count10);


        // SUNKESNES UZDUOTYS
// ==============S-1 uzduotis =========================

        System.out.println("==================== S-1 užduotis ====================");

        //	Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus tarpais ir
        //	suskaičiuokite kiek tarp jų yra didesnių už 150.
        //	Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.

        int[] numbs = new int[300];
        Random randomNumb = new Random(); // naudosiu nextInt() metoda
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = randomNumb.nextInt(0, 300); // uzpildo masyva atsitiktiniais skaiciais nuo 0 (isk) iki 300 (neisk)
        }
        System.out.println("Randomly filled arrays elements are:");
        for (int i = 0; i < numbs.length; i++) { // atspausdinu masyvo turini vienoje eiluteje su tarpais
            System.out.print(numbs[i] + " ");
        }

        System.out.println(" "); // jeigu nepridedu sito, tolimesni teksta spausdina toje pacioje eiluteje

        // toliau skaiciuojam kiek yra didesniu uz 150

        int countS1 = 0;
        for (int i = 0; i < plants.length - 1; i++) {// "-1" nes skaiciuojam nuo 0, neatemus ciklas kartotusi 301
            if (numbs[i] > 150) {
                countS1++;
            }
        }
        System.out.println("Didesniu uz 150 yra: " + countS1);

        // didesnius nei 275 spausdinti skliausteliuose []


        for (int i = 0; i < plants.length - 1; i++) {
            if (numbs[i] > 275) {
                System.out.println("[ " + numbs[i] + " ]" + " ");
            }
        }

        // ==============S-2 uzduotis =========================

        System.out.println("==================== S-2 užduotis ====================");
        // Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos.
        // Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.

        System.out.println("Dalinasi be liekanos: ");
        int[] numbsS2 = new int[3001];
        for (int i = 1; i < 3001; i++) {
            numbsS2[i] = i; // uzpildo masyva skaiciais nuo 1 (isk) iki 3000

            if (numbsS2[i] % 77 == 0) {
                System.out.print(numbsS2[i]);
                System.out.print(", ");// kaip nespausdinti paskutinio kablelio?
            }
        }

        System.out.println(" "); // jeigu nepridedu sito, tolimesni teksta spausdina toje pacioje eiluteje

        // ==============S-3 uzduotis =========================

        System.out.println("==================== S-3 užduotis ====================");
        // Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”.

            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 25; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


//=====================================
    //failo pabaiga


}
}