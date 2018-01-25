package com.mofancn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mofancn.common.pojo.EUDataGridResult;
import com.mofancn.common.utils.MofancnResult;
import com.mofancn.pojo.TbItem;
import com.mofancn.service.SelectByid;

@Controller
public class test {
	
	@Autowired
	private SelectByid selectByid;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public	TbItem SelectByidtest(@PathVariable long itemId){
		TbItem tbItem = selectByid.SelecByidTest(itemId);
		return tbItem;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult showTbItem(Integer page,Integer rows){
		EUDataGridResult getid = selectByid.getid(page, rows);
		return getid;
		
	}
	@RequestMapping(value = "/item/save", method = RequestMethod.POST)
	@ResponseBody
	public MofancnResult creatItem(TbItem tbItem,String desc,String itemParams) throws Exception{
		MofancnResult result = selectByid.CreatItem(tbItem,desc,itemParams);
		return result;
		
	}
}
