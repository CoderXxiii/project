package com.osyunge.mapper;

import com.osyunge.pojo.TbContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentMapper {
    int insert(TbContent record);

    int insertSelective(TbContent record);
}