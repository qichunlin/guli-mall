package com.qcl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qcl.common.utils.PageUtils;
import com.qcl.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author legend
 * @email legend@gmail.com
 * @date 2020-12-27 17:20:34
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

