package com.qcl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qcl.common.utils.PageUtils;
import com.qcl.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author legend
 * @email legend@gmail.com
 * @date 2020-12-27 17:20:34
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

