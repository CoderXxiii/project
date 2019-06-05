package com.osyunge.mapper;

import com.osyunge.pojo.TbItemCat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCatMapper {

    int insert(TbItemCat record);

    int insertSelective(TbItemCat record);
}