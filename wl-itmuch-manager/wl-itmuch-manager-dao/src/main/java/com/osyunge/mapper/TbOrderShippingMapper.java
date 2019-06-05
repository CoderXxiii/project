package com.osyunge.mapper;

import com.osyunge.pojo.TbOrderShipping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderShippingMapper {
    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);
}