package j15_Object클래스;

import j15_Object클래스.Teacher;

import java.lang.reflect.Field;

public class TeacherClassClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일","코리아아이티");
        Teacher teacher2 = new Teacher("김준일","코리아아이티");

        Class t_class = teacher1.getClass();

        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());

        Field[] fields = t_class.getDeclaredFields();
        for(int i=0; i<fields.length; i++) {
            System.out.println(i+" 번째 배열의 이름 " +fields[i].getName()); // 이름이라고 해야하나? 잘모르겠음
            System.out.println(i+" 번째 배열의 자료형 "+fields[i].getType().getSimpleName());
        }
        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher);
        System.out.println(teacher1.getClass() == Teacher.class); // true 인 이유?
    }
}
