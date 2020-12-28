package com.qcl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qcl.common.utils.PageUtils;
import com.qcl.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author legend
 * @email legend@gmail.com
 * @date 2020-12-27 17:20:34
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

