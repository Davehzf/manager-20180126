package com.mofancn.controller;

import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mofancn.common.utils.JsonUtils;
import com.mofancn.service.pictureService;

@Controller
public class PictureController {
	@Autowired
	private pictureService pictureService;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String pictureupload(MultipartFile uploadFile)
	{
		Map result = pictureService.uploadPicture(uploadFile);
		String json = JsonUtils.objectToJson(result);
		return json;
	}
	
}
