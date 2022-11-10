package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
class ProductImg{
    private int imgCode;
    private String imgName;
}

public class ProductMap {
    public static void main(String[] args) {

        Map<String, Object> product = new HashMap<String, Object>();
        product.put("productCode",1);
        product.put("productName", "스타벅스 텀블러");
        product.put("productColor","Black");
        product.put("productSize","Venti");
        product.put("productImage",null);

        List<ProductImg> productImgs = new ArrayList<ProductImg>();
        productImgs.add(new ProductImg(1,"starbucks_black_tumbler1.png"));
        productImgs.add(new ProductImg(2,"starbucks_black_tumbler2.png"));
        productImgs.add(new ProductImg(3,"starbucks_black_tumbler3.png"));
        productImgs.add(new ProductImg(4,"starbucks_black_tumbler4.png"));

        product.put("productImg",productImgs);
//        System.out.println(product);

        /*
        텀블러이미지1: starbucks_black_tumbler1.png
        텀블러이미지2: starbucks_black_tumbler2.png
        텀블러이미지3: starbucks_black_tumbler3.png
        텀블러이미지4: starbucks_black_tumbler4.png
         */

        // 내 답안
        for (int i = 0; i < productImgs.size(); i++) {
            System.out.println("텁블러이미지"+productImgs.get(i).getImgCode()+": "
                    +productImgs.get(i).getImgName());
        }
        System.out.println();

        // 강사님 답안
        List<ProductImg> productImgList = (List<ProductImg>) product.get("productImg");
        for(ProductImg img : productImgList){
            System.out.println("텀블러이미지"+img.getImgCode()+": "+img.getImgName());
        }
    }
}
