package com.osyunge.mapper;

import com.osyunge.pojo.TbOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderItemMapper {

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

}