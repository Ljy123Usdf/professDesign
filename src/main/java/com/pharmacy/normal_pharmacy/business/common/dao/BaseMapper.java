package com.pharmacy.normal_pharmacy.business.common.dao;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * 通用dao，用于简单的crud，使用时继承此接口
 * @author 梁晋一2020/2/1
 * */
@Repository
public interface BaseMapper<T> extends Mapper<T> {
}
