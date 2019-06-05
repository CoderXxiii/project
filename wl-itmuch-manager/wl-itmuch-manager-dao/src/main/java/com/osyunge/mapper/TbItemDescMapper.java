package com.osyunge.mapper;

import com.osyunge.pojo.TbItemDesc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemDescMapper {

    int insert(TbItemDesc record);

    int insertSelective(TbItemDesc record);
}