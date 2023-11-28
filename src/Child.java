public class Child {
    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 4 && name.length() < 81) {
            this.name = name;
        } else {
            System.out.println("De naam is te lang/kort.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 16 && age > 0) {
            this.age = age;
        } else {
            System.out.println("De leeftijd is te oud/jong.");
        }
    }

    public static void main(String[] args) {
        Child child = new Child("Kjento", 9);
        System.out.println("Naam: " + child.getName());
        System.out.println("Leeftijd: " + child.getAge());
        child.setName("Robbie");
        child.setAge(8);
        System.out.println("Nieuwe naam: " + child.getName());
        System.out.println("Nieuwe leeftijd: " + child.getAge());
    }

    public void celebrateBirthday() {
        age++;
        System.out.println("Proficiat!");

    }
}