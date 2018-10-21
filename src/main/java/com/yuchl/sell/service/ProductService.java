package com.yuchl.sell.service;

import com.yuchl.sell.domain.ProductInfo;
import com.yuchl.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author yuchl
 * @Date 2018/10/8 0008
 * @Description 商品服务
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    //ProductInfo onSale(String productId);

    //下架
    //ProductInfo offSale(String productId);
}
