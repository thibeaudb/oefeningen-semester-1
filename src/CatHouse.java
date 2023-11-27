public class CatHouse {
    public static void main(String[] args) {
        Cat MyCat1 = new Cat();
        Cat MyCat2 = new Cat();
        Cat MyCat3 = new Cat();
        MyCat1.name = ("Kamiel");
        MyCat1.age = (5);
        MyCat1.color = ("Zwart");
        MyCat1.tricks = true;
        System.out.println("De naam is: " + MyCat1.name);
        System.out.println("De leeftijd is: " + MyCat1.age + " jaar");
        System.out.println("De kleur is: " + MyCat1.color);
        System.out.println("Kan de kat trucjes? " + (MyCat1.tricks ? "Ja" : "Nee"));

        MyCat2.name = ("Kjento");
        MyCat2.age = (2);
        MyCat2.color = ("blauw");
        MyCat2.tricks = false;
        System.out.println("De naam is: " + MyCat2.name);
        System.out.println("De leeftijd is: " + MyCat2.age);
        System.out.println("De kleur is: " + MyCat2.color);
        System.out.println("Kan de kat trucjes? " + (MyCat2.tricks ? "Ja" : "Nee"));

        MyCat3.name = ("Maxim");
        MyCat3.age = (33);
        MyCat3.color = ("Zwart");
        MyCat3.tricks = false;
        System.out.println("De naam is: " + MyCat3.name);
        System.out.println("De leeftijd is: " + MyCat3.age + " jaar");
        System.out.println("De kleur is: " + MyCat3.color);
        System.out.println("Kan de kat trucjes? " + (MyCat3.tricks ? "Ja" : "Nee"));
    }
}
