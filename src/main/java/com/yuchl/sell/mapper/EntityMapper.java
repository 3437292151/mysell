package com.yuchl.sell.mapper;

import java.util.List;

/**
 * @Author yuchl
 * @Date 2018/10/16 0016
 * @param <D> - DTO 参数类型
 * @param <E> - Entity 参数类型
 * @Description 一个通用的dto到实体映射器的契约
 */
public interface EntityMapper<D, E> {

    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List <D> toDto(List<E> entityList);
}
