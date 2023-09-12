package MainGrade;

import java.util.Scanner;
import Student.Student;

public class MainGrade {
    public static void main(String[] args) {
        int studentNum = 0; // 스캐너로 입력받을 학생 수

        Scanner sc = new Scanner(System.in); // 학생 수 스캐너
        Scanner scanner = new Scanner(System.in); // 학생정보 스캐너

        System.out.print("학생 수를 입력하세요 -> ");
        studentNum = sc.nextInt();

        Student[] student = new Student[studentNum];
        System.out.println("학생이름, 수학점수, 영어점수, 국어점수 순으로 괄호 안 형식을 맞춰 입력하세요(성하 100 100 100)");


        for (int i = 0; i < student.length; i++) {
            String name = scanner.next();
            int math = scanner.nextInt();
            int english = scanner.nextInt();
            int korean = scanner.nextInt();


            student[i] = new Student(name,math,english,korean);
        }
        System.out.println("----출력예시입니다-----");
        System.out.println("학생이름 + 수학점수 + 영어점수 + 국어점수 + 총점 + 평균");
        System.out.println("------------------");

        for (Student value : student) {
            System.out.print("학생이름: " + value.name
                    + ", 수학성적: " + value.math + ", 영어성적: " + value.english + ", 국어성적: " + value.korean);
            System.out.print(", 총점: " + value.SumOfGrade());
            System.out.println(", 평균: " + value.Average());
            System.out.println(" 등급: " + value.Grade());
            System.out.println(" 소속학급: " + value.Ban());
        }
        scanner.close();
        sc.close();
    }
}