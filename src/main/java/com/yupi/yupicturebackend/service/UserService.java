package com.yupi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.yupicturebackend.model.dto.user.UserQueryRequest;
import com.yupi.yupicturebackend.model.vo.LoginUserVO;
import com.yupi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ken
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-03-11 21:58:29
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * get currently login user
     * @param request
     * @return user
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * encrypt password
     */
    String getEncryptPassword(String password);

    /**
     * obtain desensitized user login information
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * logout
     * @param request req
     * @return bool
     */
    boolean userLogout(HttpServletRequest request);

    public UserVO getUserVO(User user);

    public List<UserVO> getUserVOList(List<User> users);

    public QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
}

