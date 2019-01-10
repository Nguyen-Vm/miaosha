package com.miaoshaproject.controller;

import com.miaoshaproject.controller.viewobject.UserVo;
import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.error.EmBusinessError;
import com.miaoshaproject.model.UserModel;
import com.miaoshaproject.response.CommonReturnType;
import com.miaoshaproject.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author RWM
 * @date 2019/1/10
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseControler {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public CommonReturnType getUser(@RequestParam Integer userId) throws BusinessException {
        // 调用service服务获取对应id的用户对象并返回前端
        UserModel userModel = userService.getUserById(userId);

        if (userModel == null) {
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }

        // 将核心领域模型用户对象转化为可供UI使用的viewobject
        UserVo userVo = convertFromModel(userModel);

        // 返回通用的对象
        return CommonReturnType.create(userVo);
    }

    private UserVo convertFromModel(UserModel userModel) {
        if (userModel == null) {
            return null;
        }
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userModel, userVo);
        return userVo;
    }


}
