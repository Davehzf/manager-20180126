package com.mofancn.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mofancn.common.utils.FtpUtil;
import com.mofancn.common.utils.IDUtils;
import com.mofancn.service.pictureService;

@Service
public class pictureServiceImpl implements pictureService {

	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;
	@Value("${FTP_BASEPATH}")
	private String FTP_BASEPATH;
	@Value("${IMAGE_BASEPATH}")
	private String IMAGE_BASEPATH;

	
	@Override
	public Map uploadPicture(MultipartFile inputFiletest) {
		// TODO Auto-generated method stub
		Map resultMap = new HashMap<>();
		try {
			String oldname = inputFiletest.getOriginalFilename();
			String newname = IDUtils.genImageName();
			String imagepath = new DateTime().toString("/yyyy/MM/dd");
			newname = newname + oldname.substring(oldname.lastIndexOf("."));
			boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASEPATH,imagepath, newname, inputFiletest.getInputStream());
			if(!result)
				{
					resultMap.put("error", 1);
					resultMap.put("message", "上传文件失败");
					return resultMap;
				}
			resultMap.put("error", 0);
			resultMap.put("url", IMAGE_BASEPATH + imagepath + "/" + newname);
			return resultMap;
		} catch (Exception e) {
			resultMap.put("error", 1);
			resultMap.put("message", "上传发生异常");
			return resultMap;
		}
	}

}
