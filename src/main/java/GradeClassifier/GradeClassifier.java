package GradeClassifier;

public class GradeClassifier {
    public static String Grade(double average) {
        if ((average >= 90) && (average <= 100)) {
            return "A";
        }
        if ((average >= 80) && (average < 90)) {
            return "B";
        }
        if ((average >= 70) && (average < 80)) {
            return "C";
        }
        if (average >= 60 && average < 70) {
            return "D";
        }
        if (average < 60) {
            return "F";
        }
        return "유효하지 않습니다.";
    }
}