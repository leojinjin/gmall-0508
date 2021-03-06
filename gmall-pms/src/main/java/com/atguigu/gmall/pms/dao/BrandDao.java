package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 品牌
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2019-09-21 11:05:50
 */
@Mapper
@Component
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
