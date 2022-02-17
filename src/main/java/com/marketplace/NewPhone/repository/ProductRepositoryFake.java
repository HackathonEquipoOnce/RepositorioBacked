package com.marketplace.NewPhone.repository;

import com.marketplace.NewPhone.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductRepositoryFake implements ProductRepository{


    @Override
    public List<Product> getAll() {

        List <Product> productList = new ArrayList<Product>();
        Product product1 = new Product(333,"Iphone", "https://www.macnificos.com/sites/files/styles/product_page_zoom/public/images/product/iphone-13-pro-max-azul-alpino-01.jpg", "segunda mano",  15 );
        Product product2 = new Product(2,"Samsung", "https://media.ldlc.com/r374/ld/products/00/05/92/87/LD0005928749_1.jpg", "segunda mano",  15 );
        Product product3 = new Product(3,"Xiaomi", "https://m.media-amazon.com/images/I/51TFGmlFmoL._AC_SL1001_.jpg", "segunda mano",  15 );
        Product product4 = new Product(333,"Huawei", "https://consumer-img.huawei.com/content/dam/huawei-cbg-site/common/mkt/pdp/phones/p50-pro/size/p50-pro-black.png", "bonita",  15 );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        return productList;
    }

    @Override
    public Product getById(Integer id) {
       return new Product(222,"phoneById", "https://consumer-img.huawei.com/content/dam/huawei-cbg-site/common/mkt/pdp/phones/p50-pro/size/p50-pro-black.png", "xxxx", 15 );
    }

}
