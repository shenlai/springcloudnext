package com.sl.store.service;

import com.sl.store.dto.PageResponse;
import com.sl.store.entity.Product;

public interface IProductService {

    PageResponse<Product> getProductList(Product productCondition, int pageIndex, int pageSize);

}
