package com.pd.shiro.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;

/**
 * @Description:
 * @author: youpd@asiainfo.com
 * @create: 2018-03-09 11:04
 */
public class RealmShrio extends AuthenticatingRealm {

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("RealmShrio----" + authenticationToken.toString());
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName = token.getUsername();
        System.out.println("userName" + userName);
        if (null != userName) {
        }
        String passWord="123456";
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(userName,passWord,getName());
        return simpleAuthenticationInfo;
    }
}
