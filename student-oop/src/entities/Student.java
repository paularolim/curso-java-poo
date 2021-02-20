package entities;

public class Student {
    public String name;
    public double score1;
    public double score2;
    public double score3;

    public double finalGrade() {
        return score1 + score2 + score3;
    }

    public double missingPoints() {
        return 60 - this.finalGrade();
    }

    public String finalResult() {
        return this.finalGrade() >= 60
            ? "%nPASS"
            : "%nFAILED %nMISSING " + String.format("%.2f", this.missingPoints()) + " POINTS";
    }
}
