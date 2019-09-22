package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.BrandEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandDaoTest {

    @Autowired
    private BrandDao brandDao;

    @Test
    public void test(){

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("leo");
        brandEntity.setDescript("加油");
        brandEntity.setFirstLetter("l");
        this.brandDao.insert(brandEntity);

    }

}
