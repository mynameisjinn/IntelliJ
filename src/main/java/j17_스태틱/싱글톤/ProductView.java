package j17_스태틱.싱글톤;

public class ProductView {

    private ProductView() {};

    // instance 변수 안에 ProductView의 주소값을 담는다.
    // static - 공유
    // private - 클래스 안에서만 호출가능
    private static ProductView instance = null;

    // 외부에서 호출하기위한 getter method
    public static ProductView getInstance() {
        if (instance == null) {             // 객체가 생성되지 않았다면
            instance = new ProductView();   // class 안에서 생성.
        }
        return instance;        // 만들어진 객체 return
    }
    // instance가 static으로 선언되었기 때문에 한번 생성되면 그 다음부턴 null 값을 가질 수 없다.
    // ( static - 공유영역이라 메모리 값이 1개 )
    // 객체를 생성하지않고 바로 return ( 이미 생성된 객체를 )
    // -> 객체는 1개만 생성된다. - 싱글톤 특징

    // 사용 이유 ?


    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }
}
