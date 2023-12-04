public class GameCharacter {
    public GameCharacter(String name, char sex, double strength) {
        this.name = name;
        this.sex = sex;
        this.strength = strength;
    }
    public GameCharacter(String name, double strength) {
        this.name = name;
        this.strength = strength;
    }
    private String name;
    private char sex;
    private double strength;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return this.sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public double getStrength() {
        return this.strength;
    }
    public void setStrength(double strength) {
        this.strength = strength;
    }

}

