package com.osyunge.mapper;

import com.osyunge.pojo.TbItemParamItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemParamItemMapper {

    int insert(TbItemParamItem record);

    int insertSelective(TbItemParamItem record);
}