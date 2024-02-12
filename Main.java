// A public class Main egy Java osztály, amit Main-nek hívnak
public class Main {

    public static int number;

    private static final String PATH = "C:\\Users"; // ez legyen egy file elérési útja ...
    private static final String DOCUMENT_PATH = "C:\\Users\\Administrator\\Documents";
    /*
    A main metódus a program belépési pontja.
    Ez a metódus fut le először, amikor a program elindul.
    A String[] args a metódus paramétere, amely egy tömb, amelyben a parancssori argumentumok találhatók.
    String... args (ezzel is lehetne helyettesíteni)
    */
    public static void main(String[] args) {

        // A System.out.println metódus kiírja a zárójelben lévő szöveget a konzolra.
        // Ez a sor "Hello World" szöveget írja ki a konzolra.
        String text = "Hello World";
        // String notLikeThis = new String("Hello World"); // nem ajánlom, memória, stb. miatt
        String textAnother = "Hello World";
        System.out.println(text);

        System.out.println("Path: " + PATH);
        System.out.println("Document path: " + DOCUMENT_PATH);

        // TODO valamit itt csinálnék, de baba sír :) -> hiányzó logikát jobb lenne feljegyezni :)

        byte declaration; // deklarálás, ha megadom a típusát és a változó nevét
        declaration = 12; // itt adok neki értéket!
        System.out.println(declaration);
        byte initialization = 1; // inicializálás, ha megadom a változó típuást és nevét, valamint egyből értéket adok neki
        System.out.println("Inicializáció: " + initialization);

        byte number = 1; // szürke, tehát nincs használatban az 1, mert a köv. sorban felülírtam az értékét!
        number = 2;
        System.out.println(number);

        byte num = add(); // itt meghívtunk egy metódust paraméter nélkül ... (EZ FÜGGVÉNY)

        System.out.println("Metódusból összeg: " + num);

        printSeparator(); // meghívtunk egy metódust aminek nincs visszatérési értéke! (EZ METÓDUS!!!!)

        byte a = 120;
        byte b = 125;
        int sum = sum(a, b);
        System.out.println("Összeg: " + sum);

        char vowel = 'e';
        System.out.println("Összeg" + sum + vowel);

        printSeparator();

        // Változók és adattípusok
        // -2147483648 to 2147483647
        int number2 = 10;
        double fraction = 3.14;
        System.out.println(fraction);

        String isTrueText = "true";
        boolean isTrue = true; // kevesebb helyet foglal, mint a szöveg! ezért használjuk az igaz hamisnál ezt!
        System.out.println("Igaz vagy hamis?: " + isTrueText);
        System.out.println("Igaz vagy hamis?: " + isTrue);

        int conditionNum = 5;
        // Feltételes utasítások
        if (number2 > conditionNum) {
            System.out.println("A szám nagyobb, mint a/az " + conditionNum + ".");
        } else {
            System.out.println("A szám kisebb, vagy egyenlő mint az 5.");
        }

        System.out.println("Condition from method: ");
        checkCondition(2, 200);
        int firstNum = 200;
        int secondNum = 100;
        checkCondition(firstNum, secondNum);

        printSeparator();
        checkOtherCondition(firstNum, secondNum);
        checkOtherCondition(secondNum, firstNum);
        checkOtherCondition(100, 100);
    }

    public static byte add() {
        return 100 + 25;
    }

    public static int sum(byte a, byte b) {
        return a + b;
    }

    public static void printSeparator() {
        System.out.println("------------------------------");
    }

    public static void checkCondition(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("A " + num1 + " nagyobb, mint a/az " + num2 + ".");
        } else {
            System.out.println("A " + num1 + " kisebb, vagy egyenlő mint az " + num2 + ".");
        }
    }

    public static void checkOtherCondition(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("A " + num1 + " nagyobb, mint a/az " + num2 + ".");
        } else if (num1 == num2) {
            System.out.println("A két szám teljesen egyenlő, azaz: " + num1);
        } else {
            System.out.println("A " + num1 + " kisebb, mint az " + num2 + ".");
        }
    }
}
