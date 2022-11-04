package j17_스태틱;

public class ProductMain_2 {

    public static void main(String[] args) {
        int autoIncrement = Product.getAutoIncrement();
        System.out.println(autoIncrement);
        System.out.println(Product.autoIncrement);
        Product.autoIncrement++;
        System.out.println(Product.getAutoIncrement());

        Product p1 = new Product("p1");
        System.out.println(p1.getAutoIncrement());
    }
}
