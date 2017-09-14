package com.maven.app.controller;


import com.maven.app.domain.UserAccount;


public class OrganizeBaseController extends FileBaseController {
    public static final String USER_SESSION = "PM_USER_SESSION_KEY";
    
    public static final String user_SESSION_OPENID = "PM_USER_SESSION_KEY_OPENID";


    /**
     * 获得当前登录人
     * 
     * @return UserAccount
     */
    public UserAccount getCurrUser() {
        return (UserAccount) getSessionAttribute(USER_SESSION);
    }

    /**
     * 存放当前登录人信息
     * 
     * @param request HttpServletRequest
     * @param userAccount UserAccount
     */
    public void setCurrUser(UserAccount userAccount) {
        request.getSession().setAttribute(USER_SESSION, userAccount);
    }

}
