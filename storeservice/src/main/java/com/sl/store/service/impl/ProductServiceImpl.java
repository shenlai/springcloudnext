package com.sl.store.service.impl;

import com.sl.store.dao.ProductDao;
import com.sl.store.dto.PageResponse;
import com.sl.store.entity.Product;
import com.sl.store.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public PageResponse<Product> getProductList(Product productCondition, int pageIndex, int pageSize) {

        int rowIndex = pageIndex > 0 ? (pageIndex - 1) * pageSize : 0;
        List<Product> list = productDao.queryProductList(productCondition, rowIndex, pageSize);
        int count = productDao.queryProductCount(productCondition);

        return new PageResponse(count, list);
    }
}
