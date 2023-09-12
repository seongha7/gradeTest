package 학교.학급.학생.과목.점수;

public class GradeCalculator {
    public static double SumOfGrade(int math, int english, int korean) {
        return math + korean + english;
    }

    public static double Average(int math, int english, int korean) {
        return (double) (math + korean + english) / 3;
    }
}