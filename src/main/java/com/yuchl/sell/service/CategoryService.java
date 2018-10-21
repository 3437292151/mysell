package com.yuchl.sell.service;

import com.yuchl.sell.domain.ProductCategory;

import java.util.List;

/**
 * @Author yuchl
 * @Date 2018/10/8 0008
 * @Description
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
