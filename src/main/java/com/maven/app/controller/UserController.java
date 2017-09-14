package com.maven.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.maven.app.service.UserService;

@Controller
@RequestMapping("/user.do")
public class UserController extends OrganizeBaseController{
    
    @Autowired  
    private UserService  userService;  
      
    @RequestMapping(value="/upload",method = RequestMethod.POST)  
    @ResponseBody  
    public String  upload(@RequestParam(value="file",required = false)MultipartFile file,HttpServletRequest request, HttpServletResponse response){  
        String result = userService.readExcelFile(file);  
        return result;  
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
