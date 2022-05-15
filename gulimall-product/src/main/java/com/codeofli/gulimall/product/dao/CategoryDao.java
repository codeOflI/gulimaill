package com.codeofli.gulimall.product.dao;

import com.codeofli.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author codeofli
 * @email 1162314270@qq.com
 * @date 2022-05-15 18:40:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
