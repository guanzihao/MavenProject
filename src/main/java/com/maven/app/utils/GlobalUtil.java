package com.maven.app.utils;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 公用的配置文件处理类
 * 
 * @author FYL
 */

public class GlobalUtil {
    private static Logger LOGGER = Logger.getLogger(GlobalUtil.class);

    /**
     * 文件配置路径
     */
    public static final String PATHCONFIG = "/conf/global.properties";
    
    private static final String PATHCONFIGJDBC= "/conf/jdbc.properties";

    /**
     * 获得配置的值
     * 
     * @param key 标示
     * @return 值
     */
    public static String getValue(String key) {
        try {
            Properties properties = new Properties();
            InputStream in = GlobalUtil.class.getResourceAsStream(PATHCONFIG);
            properties.load(in);
            in.close();
            return properties.getProperty(key);
        } catch (Exception e) {
            LOGGER.error(e, e);
        }
        return null;
    }
    /**
     * 获得配置的值
     * 
     * @param key 标示
     * @return 值
     */
    public static String getJDBCValue(String key) {
        try {
            Properties properties = new Properties();
            InputStream in = GlobalUtil.class.getResourceAsStream(PATHCONFIGJDBC);
            properties.load(in);
            in.close();
            return properties.getProperty(key);
        } catch (Exception e) {
            LOGGER.error(e, e);
        }
        return null;
    }
}
