package com.sl.store.dao;

import java.util.List;
import com.sl.store.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//@Mapper
//@Repository("productDao")
public interface ProductDao {

    //List<Product> selectAllProductByPage(Map map);

    //List<Product> selectAllProduct();

    List<Product> queryProductList(@Param("productCondition") Product productCondition, @Param("rowIndex")int rowIndex, @Param("pageSize")int pageSize);

    int queryProductCount(@Param("productCondition") Product productCondition);

    //Product queryProductByProductId(long productId);
}
