package com.mofancn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mofancn.common.utils.MofancnResult;
import com.mofancn.pojo.TbItemParam;
import com.mofancn.service.itemParmService;

@Controller
@RequestMapping("/item/param")
public class itemParmController {
	@Autowired
	private itemParmService itemParmService;

	@RequestMapping("/query/itemcatid/{itemId}")
	@ResponseBody
	public MofancnResult getItemParmByCid(@PathVariable Long itemId) throws Exception {
		MofancnResult result = itemParmService.getItemParmByCid(itemId);
		return result;
	}
	@RequestMapping("/save/{cid}")
	@ResponseBody
	public MofancnResult insertParmByCid(@PathVariable long cid,String paramData){
		TbItemParam tbItemParam = new TbItemParam();
		tbItemParam.setItemCatId(cid);
		tbItemParam.setParamData(paramData);
		itemParmService.insertParmBycid(tbItemParam);
		return MofancnResult.ok();
	}
}
