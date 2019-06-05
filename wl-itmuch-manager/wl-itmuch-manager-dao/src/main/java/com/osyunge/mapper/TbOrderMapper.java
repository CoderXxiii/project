package com.osyunge.mapper;

import com.osyunge.pojo.TbOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderMapper {

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

}