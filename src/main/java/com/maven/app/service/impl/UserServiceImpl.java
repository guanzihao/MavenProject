package com.maven.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.maven.app.domain.ReadExcel;
import com.maven.app.domain.User;
import com.maven.app.service.UserService;
@Service 
public class UserServiceImpl implements UserService{
    
    @Override
    public String readExcelFile(MultipartFile file) {  
        String result ="";  
        //��������EXCEL����  
        ReadExcel readExcel=new ReadExcel();  
        //����excel����ȡ�ϴ����¼���  
        List<User> useList = readExcel.getExcelInfo(file);  
        //�����Ѿ���excel�е�����ת����list������,�������Ϳ��Բ���list,���Խ��б��浽���ݿ�,������������,  
        //�������ҵ���й�,���ﲻ�������ʾ��  
        if(useList != null && !useList.isEmpty()){  
            result = "�ϴ��ɹ�";  
        }else{  
            result = "�ϴ�ʧ��";  
        }  
        return result;  
    }  
}
