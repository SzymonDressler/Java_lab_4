public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        Dom dom1 = new Dom();
        Budynek dom2 = new Dom();

        dom1.powierzchnia(2000);
        dom1.liczbaOkien(45);
        dom1.liczbaMieszkancow(15);
        dom1.kolorDomu(KolorEnum.BLUE);
        dom1.setBreadth(25);
        dom1.setLength(13);
        dom1.showPrice(600000);
        dom1.showInfo();

        System.out.println("dom1 ma: " + KolorEnum.BLUE + " kolor");
        System.out.println(dom1.adresBudynku("Kirova"));
        System.out.println(dom1.toString());
        dom2.powierzchnia(3500);
        dom2.kolorDomu(KolorEnum.RED);
        dom2.liczbaMieszkancow(53);
        dom2.liczbaOkien(47);
        dom2.setBredth(35);
        dom2.setLenght(58);


        dom2.showInfo();
        System.out.println("dom2 ma: " + KolorEnum.RED + " kolor");
        System.out.println(dom2.adresBudynku("Wladyslawa"));
        System.out.println(dom2.toString());



    }
}
