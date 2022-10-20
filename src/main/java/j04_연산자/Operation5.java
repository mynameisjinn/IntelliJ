package j04_연산자;
    // 조건 연산자

public class Operation5 {
    public static void main(String[] args) {
        int totalCount = 102;
        int maxPage = totalCount%10 == 0 ? totalCount/10 : totalCount/10 +1;

        int page = 12;

        int startIndex = page%5==0 ? page-4 : page-(page%5)+1;
        int endIndex = startIndex +4 <= maxPage ? startIndex+4 : maxPage;

        System.out.println("page : "+page);
        System.out.println("startIndex : "+startIndex);
        System.out.println("endIndex : "+endIndex);
        System.out.println("maxPage : "+maxPage);

        String isMaxPageStr = page == endIndex ? "마지막 인덱스 입니다." : "마지막 인덱스가 아닙니다.";
        System.out.println("isMaxPageStr : "+isMaxPageStr);
    }
}
