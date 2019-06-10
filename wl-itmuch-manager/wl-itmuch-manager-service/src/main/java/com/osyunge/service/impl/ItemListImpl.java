package com.osyunge.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.osyunge.EasyUIDataGridResult;
import com.osyunge.mapper.TbItemMapper;
import com.osyunge.pojo.TbItem;
import com.osyunge.pojo.TbItemExample;
import com.osyunge.service.ItemList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemListImpl implements ItemList {
    @Autowired
    private TbItemMapper itemMapper;
    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        PageHelper.startPage(page,rows);
        TbItemExample example=new TbItemExample();
        List<TbItem> list=itemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo=new PageInfo<>(list);
        EasyUIDataGridResult result=new EasyUIDataGridResult();
        result.setRows(list);
        result.setTotal(pageInfo.getTotal());

        return result;


    }
}
