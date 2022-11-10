package j17_스태틱.싱글톤;

public class ViewMain {
    public static void main(String[] args) {
//        ProductView productView = new ProductView();

        ProductView productView = ProductView.getInstance();

        productView.showMainView();
        productView.showOrderView();
    }
}
