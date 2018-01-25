package com.mofancn.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class testFTP {

		@Test
		public void testFTP() throws Exception{
			FTPClient ftpClient = new FTPClient();
			ftpClient.connect("119.23.135.98",21);
			ftpClient.login("hzf","Hzf39504");
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			FileInputStream inputStream = new FileInputStream(new File("E:\\test.JPG"));
			ftpClient.changeWorkingDirectory("/home/hzf/webapps");
			ftpClient.storeFile("test.ico", inputStream);
			ftpClient.logout();
		}
}
