package j06_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;            // 시험점수
        String grade = null;      // 학점(등급)

        System.out.println("점수를 입력하세요 : ");
        score = sc.nextInt();
        /* 조건
        score가 0보다 작거나 0보다 크면 grade는 X라고 값을 넣어줌.
        score -> 90~100, grade -> A
        score -> 80~89,  grade -> B
        score -> 70~79,  grade -> C
        score -> 60~69,  grade -> D
        score -> 0~59,  grade -> F

        입력한 점수는 _ 이며, 학점은 _ 학점입니다.
         */
//        if(score>=90 && score<=100){
//            grade = "A";
//        }else if(score>=80 && score<=89){
//            grade = "B";
//        }else if(score>=70&& score<=79){
//            grade = "C";
//        }else if(score>=60 && score<=69){
//            grade = "D";
//        }else if(score>0 && score<=59){
//            grade = "F";
//        }
//        else {
//            grade = "X";
//        }
//        System.out.println("입력한 점수는 "+score+"이며, 학점은 "+grade+"입니다.");

        if(score<0 || score>100){
            grade ="X";
        }else if(score>89) {
            grade = "A";
        }else if(score>79) {
            grade = "B";
        }else if(score>69) {
            grade = "C";
        }else if(score>89) {
            grade = "D";
        }else{
            grade="F";
        }
    }
}
