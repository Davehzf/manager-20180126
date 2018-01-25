package com.mofancn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mofancn.service.showItemParamService;

@Controller
public class showItemParamsController {
	@Autowired
	private showItemParamService showItemParamService;
	
	@RequestMapping("/items/{itemId}")
	public String showItemParasById(@PathVariable Long itemId,Model model){
		String string = showItemParamService.showItemParm(itemId);
		model.addAttribute("itemparam", string);
		return "item";
	}

}
