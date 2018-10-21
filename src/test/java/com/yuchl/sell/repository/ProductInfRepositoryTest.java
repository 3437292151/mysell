package com.yuchl.sell.repository;

import com.yuchl.sell.domain.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author yuchl
 * @Date 2018/10/8 0008
 * @Description 商品持久层测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfRepository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfs = productInfRepository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfs.size());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo result = productInfRepository.save(productInfo);
        Assert.assertNotNull(result);
    }
}