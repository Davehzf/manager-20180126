package com.mofancn.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mofancn.common.utils.MofancnResult;
import com.mofancn.mapper.TbItemParamMapper;
import com.mofancn.pojo.TbItemParam;
import com.mofancn.pojo.TbItemParamExample;
import com.mofancn.pojo.TbItemParamExample.Criteria;
import com.mofancn.service.itemParmService;


@Service
public class itemParmServiceimpl implements itemParmService {
	
	
	@Autowired
	private TbItemParamMapper TbItemParamMapper;

	@Override
	public MofancnResult getItemParmByCid(Long cid) throws Exception{
		TbItemParamExample example = new TbItemParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(cid);
		List<TbItemParam> list = TbItemParamMapper.selectByExampleWithBLOBs(example);
		if (list != null && list.size() > 0) {
			return MofancnResult.ok(list.get(0));
		}
		return MofancnResult.ok();
	}

	@Override
	public MofancnResult insertParmBycid(TbItemParam tbItemParam) {
		tbItemParam.setCreated(new Date());
		tbItemParam.setUpdated(new Date());
		TbItemParamMapper.insert(tbItemParam);
		
		return MofancnResult.ok();
	}


	

}
