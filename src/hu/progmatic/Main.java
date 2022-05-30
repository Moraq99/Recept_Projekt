package hu.progmatic;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        String[] ingredients1 = {"\n25 dkg túró","\n2 db tojás (sárgája)","\n2 dl tej","\n5-8 dkg cukor","\n1 ek vaníliás pudingpor","\n1/2 rúd vanília magjai","\n1 csipet só"};
        String[] ingredients2 = {"\n3db tojás","\n1.5 bögre tej","\n2ek cukor","\n0.75 bögre liszt","\n0.25 bögre olaj","\n1 csom vaníliás cukor","\n1 csom sütőpor","\n1 csipet só"};
        String[] ingredients3 = {"\n50 dkg háztartási keksz","\n2n pohár tejföl","\n3csom vaníliás cukor","\n9ek kristálycukor","\n1ek keserű kakaópor"};
        String[] ingredients4 = {"\n3bögre liszt","\n1csom sütőpor","\n5bögre cukor","\n1csom vaníliás cukor","\n1bögre kefir","\n1bögre olaj","\n4db tojás","\n40dkg meggy","\n1ek fahéj","\nvaj","\nporcukor\n","\nfahéj"};
        String[] ingredients5 = {"\n25dkg túró","\n20dkg porcukor","\n15dkg kókuszreszelék","\n1csom vaníliás cukor","\n1db citrom"};
        String[] ingredients6 = {"\n50dkg darált keksz","\n50dkg porcukor","\n6ek kakaópor","\n6ek rum","\n1db tojássárgája","\n5ek tej","\n20dkg vaj","\n1tasak vaníliás cukor","\n20dkg kókuszreszelék"};
        String[] ingredients7 = {"\n25dkg margarin","\n10dkg porcukor","\n1ek vaníliás cukor","\n25dkg finomliszt","\n2csom pudingpor","\ncsokicsepp"};
        String[] ingredients8 = {"\n2db banán","\n15dkg liszt","\n1csom sütőpor","\n10dkg cukor","\n1csom vaníliás cukor","\n1db tojás","\n0.8dl olaj","\nvaj","\nbanánkarikák"};
        String[] ingredients9 = {"\n3db tojás","\n15dkg cukor\n","\n50dkg liszt","\nszénsavas ásványvíz","\nmeggylekvár"};
        String[] ingredients10 = {"\n25dkg liszt","\n1csip só","\n0.5csom sütőpor","\n1db tojás","\n3ek porcukor","\n1csom vaníliás cukor","\n2dl tejföl","\n6dl olaj"};
        String[] ingredients11 = {"\n10-15 db gombóchoz:","\n50dkg túró","\n2db tojás","\n10dkg búzadara","\n1csom vaníliáscukor","\n2ek kristálycukor","\n1db citrom reszelt héja","\n1csip só","\n10dkg zsemlemorzsa","\n2ek porcukor","\n2ek étolaj"};
        String[] ingredients12 = {"\n4db tojás","\n15dkg cukor","\ncsip só","\n1csom vaníliás cukor\n","\n30dkg liszt","\n1l tej","\nvaj (a tepsi kikenéséhez)","\nsárgabaracklekvár"};
        String[] ingredients13 = {"\n10db zsemle","\n6dl tej","\n5dkg vaj","\n3ek cukor","\n2.5dl tejföl","\n0.5kg túró","\n1db tojás","\n1zacskó vaníliás cukor","\n1db citrom","\n4ek porcukor","\n2ek tejföl","\n2marék mazsola","\n1csip só"};
        String[] ingredients14 = {"\nkiscica","\nsó","\nbors"};


        String[] ingredients ={Arrays.toString(ingredients1),Arrays.toString(ingredients2),Arrays.toString(ingredients3),Arrays.toString(ingredients4),
                Arrays.toString(ingredients5),Arrays.toString(ingredients6),Arrays.toString(ingredients7),Arrays.toString(ingredients8),Arrays.toString(ingredients9),
                Arrays.toString(ingredients10),Arrays.toString(ingredients11),Arrays.toString(ingredients12),Arrays.toString(ingredients13),Arrays.toString(ingredients14)};



        String instruction1 =("\nA tojások sárgáját a cukorral, pudingporral és egy kevés tejjel alaposan elkeverjük\n" +
                "      (előzőleg a sárgájákat a cukorral kissé habosítjuk).\n" +
                "      A maradék tejet a vanília magjaival felforraljuk, beleöntjük a masszát, majd addig keverjük,\n" +
                "      amíg sűrű pudingot nem kapunk. Ezután hagyjuk kihűlni.\n" +
                "      A túrót áttörjük, majd hozzáöntjük a kihűlt vaníliás alapot,\n" +
                "      és botmixerrel addig keverjük, amíg krémes nem lesz.\n" +
                "      Poharakba, tálakba adagolva lehűtjük.\n" +
                "      Tálaláskor megszórhatjuk áfonyával,\n" +
                "      vagy készíthetünk hozzá karamell vagy gyümölcs öntetet.");

        String instruction2 =("A tojásokat szétválasztjuk. Egy nagy tálban robotgéppel összekeverjük a tejet,\n" +
                "    a tojássárgáját, a cukrot, a lisztet, az olajat, a vaníliás cukrot, a sütőport és a sót.\n" +
                "    Kemény habbá verjük a tojásfehérjéket, majd óvatosan a masszához forgatjuk.\n" +
                "    A tésztát a hűtőben pihentetjük egy órát,\n" +
                "    majd gofrisütőben a szokásos módon kisütjük a gofrikat.");

        String instruction3 =("Az egyik pohár tejfölbe belekeverünk 4 evőkanál cukrot és 2 csomag vaníliás cukrot.\n" +
                "        A másikba 5 evőkanál cukrot, 1 csomag vaníliás cukrot, valamint 1 kanál kakaóport.\n" +
                "        Egy közepes méretű (kb. 20x30 cm-es) tepsi aljára tegyünk egy réteg háztartási kekszet.\n" +
                "        Kenjük el rajta a vaníliás tejföl 2/3 részét. Fedjük be egy réteg keksszel,\n" +
                "        egyengessük el rajta a kakaós tejföl 2/3-át. Borítsuk be egy újabb réteg keksszel,\n" +
                "        majd a maradék vaníliás és kakaós tejfölt öntsük a tetejére, egyengessük el,\n" +
                "        fogpiszkálóval tetszés szerint rajzoljunk bele mintákat.\n" +
                "        Tegyük hűtőbe 10-12 órára. A keksz megpuhul, a tejföl pedig kissé megköt.");

        String instruction4 =("Egy 175 ml-es kefires dobozzal kimérjük a hozzávalókat.\n" +
                "    Összekeverjük a lisztet, a sütőport, a cukrot és a vaníliás cukrot. Hozzáadjuk a kefirt, az olajat és a tojást,\n" +
                "    és alaposan összekeverjük. A tésztát kivajazott és kilisztezett tepsibe öntjük.\n" +
                "    A lecsögpögtetett meggyet megszórjuk a fahéjjal, majd a tésztára szórjuk.\n" +
                "    180 fokra előmelegített sütőben 30 perc alatt készre sütjük, porcukorral a tetején tálaljuk.\n");

        String instruction5 =("Egy tálban áttörjük a túrót, hozzáadjuk a porcukrot és a vaníliás cukrot.\n" +
                "        A kókuszreszelékből félreteszünk egy keveset, a többit a keverékhez adjuk.\n" +
                "        Ezután megmossuk és szárazra töröljük a citromot, és a masszához adjuk a lereszelt a héját.\n" +
                "        A hozzávalókat alaposan összegyúrjuk, majd kis gombócokat formálunk belőle.\n" +
                "        A végén a golyókat meghempergetjük a maradék kókuszreszelékben.");

        String instruction6 =("Alaposan összegyúrjunk a darált kekszet a porcukorral, a kakaóporral és a rummal,\n" +
                "    a tojássárgájával és tejjel, majd a hűtőbe tesszük, kb. 1 órára.\n" +
                "    A puha vajat krémesre keverjük a vaníliás cukorral, majd apránként hozzáadjuk a kókuszreszeléket.\n" +
                "    A porcukorral megszórt sütőpapíron kinyújtjuk a kekszes masszát.\n" +
                "    Rákenjük a kókuszos krémet, és feltekerjük a sütőpapír segítségével.\n" +
                "    A tekercset egy kevés porcukorban és kókuszreszelékben megforgatjuk,\n" +
                "    majd alufóliába csomagoljuk, és hűtőbe tesszük, amíg megszilárdul.\n" +
                "    Meleg vízbe mártott, megtörölt késsel kb. 1 cm-es szeletekre vágjuk.");

        String instruction7 =("Egy keverőtálban, konyhai robotgép segítségével minden alapanyagot összegyúrunk,\n" +
                "    majd kis golyókat formálunk a masszából.\n" +
                "    Sütőpapírral bélelt tepsire rakosgatjuk őket, majd villávalkissé lenyomjuk -\n" +
                "    ezzel mintegy mintázzuk is a felületüket. De ellapíthatjuk atenyererünkkelis,\n" +
                "    majd 3-3 csokicseppet vagy apróra vágott étcsokidarabot belenyomhatunka tésztába.\n" +
                "    200 fokra előmelegített sütőben max. 10 perc alatt készre sütjük a kekszecskéinket!");

        String instruction8 =("A meghámozott banánokat összetörjük egy villával.\n" +
                "Átszitáljuk egy tálba a lisztet és a sütőport, majd hozzáadjuk a cukrot, a vaníliás cukrot,\n" +
                "a tojást, az olajat és a banánt, majd alaposan össszedolgozzuk.\n" +
                "Kivajazzuk a muffinsütőt, majd a mélyedésekbe halmozzuk a tésztamasszát.\n" +
                "180 fokra előmelegített sütőben 20-30 percig sütjük, majd a formában hagyjuk kihűlni.\n" +
                "A muffinokat banánkarikákkal díszítjük.\n");

        String instruction9 =("A tojásokat feltörjük, egy tálba öntjük, majd a cukorral habosra kavarjuk, végül hozzáadjuk a lisztet.\n" +
                "        Ezeket összedolgozzuk és ásványvízzel lazítjuk a tésztát.\n" +
                "        A palacsintatészta sűrűségét egyénileg határozzuk meg.\n" +
                "        Bevonatos serpenyőben egyenként kisütjük a palacsintákat, és hűlni hagyjuk.\n" +
                "        A palacsintákat meggylekvárral töltjük meg, és háromszög alakúra hajtogatjuk.");

        String instruction10 =("A lisztet egy tálba szitáljuk, majd elkeverjük benne a sót és a sütőport.\n" +
                "    Egy másik tálban a tojást simára keverjük a porcukorral, a vaníliás cukorral és a tejföllel.\n" +
                "    Hozzáadjuk a sütőporos lisztet, és jól összedolgozzuk.\n" +
                "    Lisztezett felületen 0,5 cm vastagra nyújtjuk a tésztát, majd egy közepes átmérőjű pogácsaszaggatóval kiszaggatjuk.\n" +
                "    Ízlés szerint készíthetünk lyukat a közepébe.\n" +
                "    Bő, forró olajban, a közepestől egy kicsit kisebb lángon a fánkok mindkét oldalát szép pirosra sütjük.\n" +
                "    Konyhai papírtörlőn lecsepegtetjük a felesleges olajat. Porcukorral meghintve, sárgabaracklekvárral kínáljuk.");

        String instruction11 =("A túrót áttörjük, például egy krumplinyomóval. Összekeverjük a tojásokkal és a búzadarával,\n" +
                "        a cukorral, a citrom reszelt héjával, és a csipet sóval, majd letakarva minimum 1 órára tegyük hűtőbe\n" +
                "         – hogy a dara jól megszívja magát.\n" +
                "        Ezután nedves kézzel diónyi gombócokat formázunk a masszából, és enyhén sós, forró,\n" +
                "        gyöngyöző vízben kifőzzük – amint feljönnek a gombócok a víz tetejére, onnan számítva további 5 percig főzzük őket.\n" +
                "        Kevés olajon, alacsony lángon megpirítjuk a zsemlemorzsát, vigyázzunk mert könnyen túlbarnul.\n" +
                "        Két evőkanál porcukrot hozzákeverünk, és a kifőtt gombócokat ebbe az édes morzsába forgatjuk bele.\n" +
                "        A túrógombócot porcukorral megszórva, édes, fahéjas tejföllel, langyosan tálaljuk.");

        String instruction12 =(" A tejes pite elkészítéséhez az egész tojásokat a cukorral, a sóval és a vaníliás cukorral kikeverjük,\n" +
                "        majd hozzáadjuk a lisztet és a tejet is, de csak apránként. Egynemű tésztává keverjük.\n" +
                "        Egy nagyobb, magas falú tepsit alaposan kikenünk vajjal, és beleöntjük a kevert tésztát.\n" +
                "        Előmelegített sütőben először magas hőmérsékleten (190 fokon) 10 percig, aztán alacsonyabb hőmérsékleten\n" +
                "         (170 fokon) 40 perc alatt szép pirosra sütjük.\n" +
                "        A süteményt négyzet alakúra vágjuk, és baracklekvárral tálaljuk.");

        String instruction13 =("A töltelék hozzávalóit egy tálban simára keverjük. A zsemléket kettévágjuk,\n" +
                "        a belsejüket kikaparjuk, hogy kb. 1 cm vastag héj maradjon.\n" +
                "        A tejet langyosra melegítjük, és hozzáadjuk a megolvasztott vajat és a cukrot.\n" +
                "        A zsemlék belét leöntjük 1-2 dl vajas tejjel, kicsit kinyomkodjuk és a töltelékhez adjuk,\n" +
                "        majd ezzel is kikeverjük.\n" +
                "        Kivajazunk egy tűzálló tálat. A zsemléket megmártjuk a vajas tejben,\n" +
                "        és egymás mellé állítjuk a jénaiban. Elosztjuk bennük a tölteléket, meglocsoljuk a maradék vajas tejjel,\n" +
                "        majd mindegyik tetejére még néhány kanál tejfölt teszünk.\n" +
                "        180 fokos sütőbe toljuk, és kb. 30 perc alatt készre sütjük\n" +
                "        (addig, amíg a zsemlék széle és a tejföl is itt-ott megpirul).");

        String instruction14 =("Végy egy kiscicát. Ízesitsd sóval, borssal, majd sütőben 180 fokon egy órán át süsd.\n " +
                "Ha kész, ébredj fel! \n" +
                "A cicák túl aranyosak, így nem lenne szíved megenni! :) \n");


        Recipe recipe1 = new Recipe("Házi vaniliás túrókrém", "easy", 10, false, ingredients1, instruction1);
        Recipe recipe2 = new Recipe("Bögrés gofri", "hard", 30, false,ingredients2,instruction2);
        Recipe recipe3 = new Recipe("Kekszes-tejfölös süti sütés nélkül", "hard", 30, false,ingredients3,instruction3);
        Recipe recipe4 = new Recipe("BÖGRÉS KEFIRES-MEGGYES KEVERT SÜTI", "hard", 30, false,ingredients4,instruction4);
        Recipe recipe5 = new Recipe("EGYSZERŰ TÚRÓS KÓKUSZGOLYÓ", "hard", 30, false,ingredients5,instruction5);
        Recipe recipe6 = new Recipe("KÓKUSZTEKERCS", "hard", 30, false,ingredients6,instruction6);
        Recipe recipe7 = new Recipe("PUDINGOS KEKSZEK", "hard", 30, true,ingredients7,instruction7);
        Recipe recipe8 = new Recipe("EGYSZERŰ BANÁNOS MUFFIN", "hard", 30, false,ingredients8,instruction8);
        Recipe recipe9 = new Recipe("EGYSZERŰ MEGGYES PALACSINTA", "hard", 30, false,ingredients9,instruction9);
        Recipe recipe10 = new Recipe("TÍZPERCES SÜTŐPOROS FÁNK", "hard", 30, false,ingredients10,instruction10);
        Recipe recipe11 = new Recipe("KLASSZIKUS TÚRÓGOMBÓC FAHÉJAS TEJFÖLLEL", "hard", 30, false,ingredients11,instruction11);
        Recipe recipe12 = new Recipe("TEJES PITE", "hard", 30, false,ingredients12,instruction12);
        Recipe recipe13 = new Recipe("TÚRÓS ZSEMLE, AHOGY A NAGYMAMÁM KÉSZÍTI", "hard", 30, false,ingredients13,instruction13);
        Recipe recipe14 = new Recipe("Macskapörkölt", "hard", 30, false,ingredients14,instruction14);



        System.out.println(recipe1);
        System.out.println(Arrays.toString(ingredients));
        /*if (recipe1...) {
            System.out.println("Eklészítési utasítás");
        }*/


        }



    /*public void findRecipe(){*/



        }




