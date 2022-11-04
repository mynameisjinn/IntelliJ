package j17_스태틱;

public class ProductMain {

    public static void main(String[] args) {
        Product[] products = new Product[5];
        /*
            1.serialNumber = 20220001, productName = "스타벅스 블랙 텀블러1"
            2.serialNumber = 20220002, productName = "스타벅스 블랙 텀블러2"
            3.serialNumber = 20220003, productName = "스타벅스 블랙 텀블러3"
            4.serialNumber = 20220004, productName = "스타벅스 블랙 텀블러4"
            5.serialNumber = 20220005, productName = "스타벅스 블랙 텀블러5"

         */
        for(int i = 0; i <products.length; i++) {
            products[i] = new Product("스타벅스 블랙 텀블러" + (i + 1));
        }

//        products[0] = new Product("스타벅스 블랙 텀블러"+1);
//        products[1] = new Product("스타벅스 블랙 텀블러"+2);
//        products[2] = new Product("스타벅스 블랙 텀블러"+3);
//        products[3] = new Product("스타벅스 블랙 텀블러"+4);
//        products[4] = new Product("스타벅스 블랙 텀블러"+5);

        for(int i = 0; i < products.length; i++){
            System.out.println(products[i]);
        }

    }
}
