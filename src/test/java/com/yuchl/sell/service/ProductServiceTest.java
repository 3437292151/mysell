package com.yuchl.sell.service;

import com.yuchl.sell.domain.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author yuchl
 * @Date 2018/10/8 0008
 * @Description 商品服务测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456", productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productServiceUpAll = productService.findUpAll();
        Assert.assertNotEquals(0, productServiceUpAll.size());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = PageRequest.of(0,10);
        Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
        log.info("productInfoPage total: {}; page: {}; content: {}", productInfoPage.getTotalElements(),productInfoPage.getTotalPages(), productInfoPage.getContent());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123458");
        productInfo.setProductName("芒果冰");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的冰");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(3);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}