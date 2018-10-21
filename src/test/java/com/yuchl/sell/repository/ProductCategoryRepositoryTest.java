package com.yuchl.sell.repository;

import com.yuchl.sell.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


/**
 * @Author yuchl
 * @Date 2018/9/29 0029
 * @Description 类目持久层测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        Optional<ProductCategory> repositoryOne = productCategoryRepository.findById(1);

    }

    @Test
    @Transactional
    @Rollback(false)
    public void saveTest(){
        Optional<ProductCategory> repositoryOne = productCategoryRepository.findById(1);
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("热搜榜");
        productCategory.setCategoryType(3);
        /*repositoryOne.get().setCategoryName("男生榜");
        repositoryOne.get().setCategoryType(4);*/
        /*productCategory.setCreateTime(LocalDateTime.now());
        productCategory.setUpdateTime(LocalDateTime.now());*/
        productCategoryRepository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}