public class Student {
    private String name;
    private int historyExamPoints;
    private char group;

    //dit is een constructor.
    public Student(String name, int historyExamPoints, char group) {
        this.name = name;
        this.historyExamPoints = historyExamPoints;
        this.group = group;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        if (name.length() > 5) {
            if (name.length() < 62) {
                this.name = newName;
            }
            else {
                System.out.print("Je naam heeft te veel karakters");
            }
        }
        else {
            System.out.print("Je naam heeft te weinig karakters. ");
        }
    }
    public int getHistoryExamPoints() {
        return historyExamPoints;
    }
    public void setHistoryExamPoints(int newPoints) {
        this.historyExamPoints = newPoints;
    }
    public char getGroup() {
        return group;
    }
    public void setGroup(char newGroup) {
        this.group = newGroup;
    }
    public void printReport() {
        System.out.println("de naam van de student is " + name + ".");
        System.out.println("zijn punten op zijn geschiedenisexamen zijn " + historyExamPoints + " punten.");
        System.out.println("zijn klasgroep is " + group + ".");
    }
}

