package Student;
import GradeCalculator.GradeCalculator;
import ClassClassifier.ClassClassifier;
import GradeClassifier.GradeClassifier;
public class Student {
    public String name;

    // 과목은 int로 지정 (점수를 다이렉트로 받기 위해)
    public int math;
    public int english;
    public int korean;

    public Student(String name, int math, int english, int korean) {
        this.name = name;
        this.math = math;
        this.english = english;
        this.korean = korean;
    }

    public double SumOfGrade() {
        return GradeCalculator.SumOfGrade(math, english, korean);
    }

    public double Average() {
        return GradeCalculator.Average(math, english, korean);
    }

    public String Ban() {
        return ClassClassifier.Ban(Grade());
    }

    public String Grade() {
        return GradeClassifier.Grade(Average());
    }
}