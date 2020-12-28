package com.qcl.gulimall.product;

import com.qcl.gulimall.product.entity.BrandEntity;
import com.qcl.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("华为desc");
        brandEntity.setShowStatus(1);
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
