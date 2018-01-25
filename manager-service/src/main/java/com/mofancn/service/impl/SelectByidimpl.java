package com.mofancn.service.impl;

import java.util.Date;
import java.util.List;import org.apache.log4j.DailyRollingFileAppender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mofancn.common.pojo.EUDataGridResult;
import com.mofancn.common.utils.IDUtils;
import com.mofancn.common.utils.MofancnResult;
import com.mofancn.mapper.TbItemDescMapper;
import com.mofancn.mapper.TbItemMapper;
import com.mofancn.mapper.TbItemParamItemMapper;
import com.mofancn.mapper.TbItemParamMapper;
import com.mofancn.pojo.TbItem;
import com.mofancn.pojo.TbItemDesc;
import com.mofancn.pojo.TbItemExample;
import com.mofancn.pojo.TbItemParam;
import com.mofancn.pojo.TbItemParamItem;
import com.mofancn.service.SelectByid;

@Service
public class SelectByidimpl implements SelectByid {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Autowired
	private TbItemDescMapper TbItemDescMapper;
	
	@Autowired
	private TbItemParamItemMapper tbItemParamItemMapper;

	@Override
	public TbItem SelecByidTest(long itemId) {
		// TODO Auto-generated method stub
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);
		return tbItem;
	}

	@Override
	public EUDataGridResult getid(int start, int rows) {
		// TODO Auto-generated method stub
		TbItemExample example = new TbItemExample();
		PageHelper.startPage(start, rows);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public MofancnResult CreatItem(TbItem tbItem, String desc,String itemparm) throws Exception {

		long id = IDUtils.genItemId();
		tbItem.setId(id);
		tbItem.setStatus((byte) 1);
		tbItem.setCreated(new Date());
		tbItem.setUpdated(new Date());

		tbItemMapper.insert(tbItem);
		MofancnResult result = creatdesc(id, desc);
		if(result.getStatus() != 200)
		{
			throw new Exception();
		}
		result = insertparams(id, itemparm);
		if(result.getStatus() != 200)
		{
			throw new Exception();
		}
		return MofancnResult.ok();

	}

	private MofancnResult creatdesc(Long itemId,String desc) {
		TbItemDesc tbItemDesc = new TbItemDesc();
		tbItemDesc.setItemId(itemId);
		tbItemDesc.setItemDesc(desc);
		tbItemDesc.setCreated(new Date());
		tbItemDesc.setUpdated(new Date());
		TbItemDescMapper.insert(tbItemDesc);
		return MofancnResult.ok();
		
	}
	
	private MofancnResult insertparams(Long itemId,String itemparm) {
		TbItemParamItem tbItemParam = new TbItemParamItem();
		tbItemParam.setItemId(itemId);
		tbItemParam.setParamData(itemparm);
		tbItemParam.setCreated(new Date());
		tbItemParam.setUpdated(new Date());
		
		tbItemParamItemMapper.insert(tbItemParam);
		return MofancnResult.ok();
	}

}
