package School.ClassClassifier;


public class ClassClassifier {
    public static String Ban(String grade) {
        if (grade.equals("A")) {
            return "아이비리그";
        }
        if (grade.equals("B")) {
            return "스카이";
        }
        if (grade.equals("C")) {
            return "인서울";
        }
        if (grade.equals("D") || grade.equals("F")) {
            return "파이팅";
        }
        return "유효하지 않습니다.";
    }
}