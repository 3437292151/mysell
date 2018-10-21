package com.yuchl.sell.service.impl;

import com.yuchl.sell.domain.ProductCategory;
import com.yuchl.sell.repository.ProductCategoryRepository;
import com.yuchl.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *@Author yuchl
 *@Date 2018/10/8 0008
 *@Description 类目
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        Optional<ProductCategory> productCategory = productCategoryRepository.findById(categoryId);
        return productCategory.orElse(new ProductCategory());
    }

    @Override
    public List<ProductCategory> findAll() {
        List<ProductCategory> productCategoryList = productCategoryRepository.findAll();
        return productCategoryList;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        List<ProductCategory> productCategories = productCategoryRepository.findByCategoryTypeIn(categoryTypeList);

        return productCategories;
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        ProductCategory productCategoryReturn = productCategoryRepository.save(productCategory);
        return productCategoryReturn;
    }
}
