package com.mofancn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mofancn.common.pojo.EUDataGridResult;
import com.mofancn.common.utils.MofancnResult;
import com.mofancn.pojo.TbContent;
import com.mofancn.service.ContentCategoryService;
import com.mofancn.service.ContentService;

@Controller
public class showContextController {

	@Autowired
	private ContentCategoryService contentCategoryService;
	@Autowired
	private ContentService ContentService;
	
	
	@RequestMapping("/content/query/list")
	@ResponseBody
	public EUDataGridResult showContext(Integer categoryId,Integer page,Integer rows){
		EUDataGridResult euDataGridResult = contentCategoryService.showcategory(categoryId, page, rows);
		return euDataGridResult;
}
	@RequestMapping("/content/save")
	@ResponseBody
	public MofancnResult insertContent(TbContent tbContent){
		MofancnResult result = ContentService.insertContent(tbContent);
		return result;
	}
	
}
