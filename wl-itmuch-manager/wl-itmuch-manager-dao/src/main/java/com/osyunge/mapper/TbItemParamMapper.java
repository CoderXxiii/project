package com.osyunge.mapper;

import com.osyunge.pojo.TbItemParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemParamMapper {


    int insert(TbItemParam record);

    int insertSelective(TbItemParam record);
}