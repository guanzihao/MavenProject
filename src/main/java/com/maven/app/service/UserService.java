package com.maven.app.service;

import org.springframework.web.multipart.MultipartFile;

public interface UserService {
    /** 
     * ��ȡexcel�е�����,����list 
     */  
    String readExcelFile( MultipartFile file);  
}
