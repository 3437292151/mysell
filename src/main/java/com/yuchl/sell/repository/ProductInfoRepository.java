package com.yuchl.sell.repository;

import com.yuchl.sell.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author yuchl
 * @Date 2018/10/8 0008
 * @Description 商品持久层
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
