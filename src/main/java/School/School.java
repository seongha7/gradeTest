package School;
import School.ClassClassifier.Student.Student;
import School.ClassClassifier.Student.Subject.Subject;
import School.ClassClassifier.Student.Subject.GradeClassifier.GradeClassifier;
import School.ClassClassifier.Student.Subject.GradeCalculator.GradeCalculator;
import School.ClassClassifier.ClassClassifier;


public class School {

    Student student;
    Subject subject;

    public int math;
    public int english;
    public int korean;
    public String name;
    public School(String name, int math, int english, int korean) {
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
