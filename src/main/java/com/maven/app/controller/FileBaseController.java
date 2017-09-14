package com.maven.app.controller;

import java.io.File;

import org.apache.log4j.Logger;


public class FileBaseController extends BaseController {
    private static Logger LOGGER = Logger.getLogger(FileBaseController.class);



    /**
     * 获得服务器临时文件路径
     * 
     * @param filePath
     * @return 文件路径
     */
    public String getFilePath(String filePath) {
        return request.getSession().getServletContext().getRealPath("/upfile") + File.separator + filePath;
    }

  
}
