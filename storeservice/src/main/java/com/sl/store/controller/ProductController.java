package com.sl.store.controller;

import com.sl.store.dto.PageResponse;
import com.sl.store.entity.Product;
import com.sl.store.service.IProductService;
import com.sl.store.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    /**
     * 产品列表
     * @param request
     * @return
     */

    @GetMapping
    private PageResponse<Product> getProductList(HttpServletRequest request) {
        PageResponse<Product> response = new PageResponse<Product>();

        int pageIndex = HttpServletRequestUtil.getInt(request, "page");
        int pageSize = HttpServletRequestUtil.getInt(request, "rows");
        Long shopId = HttpServletRequestUtil.getLong(request, "shopId");
        pageIndex = pageIndex <= 0 ? 1 : pageIndex;
        pageSize = pageSize <= 0 ? 20 : pageSize;
        if (pageIndex > 0 && pageSize > 0) {

            Product productCondition = new Product();
            productCondition.setShopId(shopId);
            response = productService.getProductList(productCondition, pageIndex, pageSize);
        } else {
            response = new PageResponse<Product>(false,0,"参数错误");
        }
        return response;
    }
}
