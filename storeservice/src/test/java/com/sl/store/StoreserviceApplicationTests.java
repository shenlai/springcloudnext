package com.sl.store;

import com.sl.store.dao.ProductDao;
import com.sl.store.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@MapperScan("com.sl.store.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreserviceApplicationTests {

    @Autowired
    private ProductDao productDao;

    @Test
    public void contextLoads() {

        Product productCondition = new Product();

        List<Product> list = productDao.queryProductList(productCondition,1,5);

        System.out.println("product count:"+list.size());
    }

}
