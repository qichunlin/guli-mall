package com.qcl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qcl.common.utils.PageUtils;
import com.qcl.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author legend
 * @email legend@gmail.com
 * @date 2020-12-27 17:20:34
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

