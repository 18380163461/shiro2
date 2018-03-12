package com.pd.shiro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-03-01 14:36
 */
public class ShiroTest1 {
    private static final Logger logger = LoggerFactory.getLogger(ShiroTest1.class);

    public static void main(String args[]) {
       /* File file=new File("classpath:ehcache.xml");
        String s=file.getAbsolutePath();
        System.out.println(s);*/

       /*Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("shiro", "123456789");
        subject.login(token);
        logger.info("login sucessed;   " + subject.getPrincipal());
        subject.logout();*/
    }
}
