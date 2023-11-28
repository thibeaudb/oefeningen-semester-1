public class Main2 {
    public static void main(String[] args) {
        Child child = new Child("maxim", 9);


        System.out.println("Naam: " + child.getName());
        System.out.println("Leeftijd: " + child.getAge());


        child.setName("davino");


        System.out.println("Naam na update: " + child.getName());


        child.celebrateBirthday();


        System.out.println("Leeftijd na verjaardag: " + child.getAge());
    }

}
