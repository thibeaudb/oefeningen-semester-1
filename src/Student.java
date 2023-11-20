public class Student {
    private String name;
    private int historyExamPoints;
    private char group;

    public Student(String name, int historyExamPoints, char group) {
        this.name = name;
        this.historyExamPoints = historyExamPoints;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getHistoryExamPoints() {
        return historyExamPoints;
    }

    public char getGroup() {
        return group;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setHistoryExamPoints(int newPoints) {
        this.historyExamPoints = newPoints;
    }

    public void setGroup(char newGroup) {
        this.group = newGroup;
    }
}

