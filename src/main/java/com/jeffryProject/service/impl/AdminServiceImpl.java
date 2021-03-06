package com.jeffryProject.service.impl;

import com.jeffryProject.dao.PswMapper;
import com.jeffryProject.dao.UserMapper;
import com.jeffryProject.entity.Psw;
import com.jeffryProject.entity.User;
import com.jeffryProject.error.CommonException;
import com.jeffryProject.error.EmCommError;
import com.jeffryProject.service.AdminService;
import com.jeffryProject.utils.MyUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PswMapper pswMapper;

    @Override
    public User findUserByUid(int uid) {
        User user = userMapper.selectUserInfo(uid);
        if (user == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createTime = user.getCreateTime();
        String sd = sdf.format(new Date(Long.parseLong(createTime + "000")));// 时间戳转换成时间
        user.setCreateTime(sd);
        return user;
    }

    @Override
    public User findUserByUsername(String username) {
        User user = userMapper.selectUserInfoByUsername(username);
        if (user == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createTime = user.getCreateTime();
        String sd = sdf.format(new Date(Long.parseLong(createTime + "000")));// 时间戳转换成时间
        user.setCreateTime(sd);
        return user;
    }

    @Override
    public Psw getUserPsw(int uid) {
        Psw psw = pswMapper.selectUserPsw(uid);
        if (psw == null) {
            return null;
        }
        return psw;
    }

    @Override
    public User validateLogin(String logName, String password) throws CommonException {
        User user;
        //通过正则判断登录名是用户名还是注册邮箱
        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(logName);
        boolean isMatched = matcher.matches();
        if(isMatched){
            //通过email获取用户uid
            user = userMapper.selectUserInfoByEmail(logName);
        }else {
            user = userMapper.selectUserInfoByUsername(logName);
        }
        if (user == null) {
            throw new CommonException(EmCommError.USER_NOT_EXIST);
        }
        Psw psw = this.pswMapper.selectUserPsw(user.getUid());
        //比对用户密码数据
       String pswSalt = MyUtils.pswSalt(password,psw.getSalt());//生成密码
        if (!StringUtils.equals(psw.getPassword(),pswSalt)) {
            throw new CommonException(EmCommError.USER_LOGIN_FAIL);
        }
        return user;
    }

    @Override
    @Transactional
    public void createUser(User user) throws CommonException {

    }
}
