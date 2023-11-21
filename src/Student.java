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
        this.name = newName;
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
}

