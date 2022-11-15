package j25_문자열;

public class String1 {
    public static void main(String[] args) {

        String filePath = "C:/Users/hyejin/java-study/src/main/java/String.java";
        String filePath2 = "C:/Users/hyejin/project/java-study2/src/main/java/Integer.java";

        String projectName = null;
        String fileName = null;
        String extension = null;

//        System.out.println("프로젝트명 : " + projectName);
//        System.out.println("파일명 : " + fileName);
//        System.out.println("확장자명 : " + extension);

        /*
            subString() -> 문자열을 잘라준다.
            indexOf() -> 내가 찾는 문자열의 위치 인덱스를 반환
         */

        int srcIndex = filePath.indexOf("/src");
        String projectPath = filePath.substring(0, srcIndex);

        projectName = projectPath.substring(projectPath.lastIndexOf("/")+1);
        fileName = filePath.substring(filePath.lastIndexOf("/")+1,filePath.lastIndexOf("."));
        extension = filePath.substring(filePath.lastIndexOf("."));

        System.out.println("프로젝트명 : " + projectName);
        System.out.println("파일명 : " + fileName);
        System.out.println("확장자명 : " + extension);

        // 집주소 자르는거 해보기 - 시.구,동 으로




    }
}
