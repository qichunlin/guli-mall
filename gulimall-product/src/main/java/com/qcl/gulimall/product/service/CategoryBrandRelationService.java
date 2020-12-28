package com.qcl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qcl.common.utils.PageUtils;
import com.qcl.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author legend
 * @email legend@gmail.com
 * @date 2020-12-27 17:20:34
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

