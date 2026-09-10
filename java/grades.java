

public class grades {
    
    private double score;

    public grades(int id, String courseCode, double score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
    
        this.score = score;
    }

    public double getScore() { return score; }

    public String calculateLetterGrade() {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }
}