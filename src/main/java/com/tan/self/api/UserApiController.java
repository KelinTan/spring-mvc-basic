package com.tan.self.api;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tan.self.bean.RestResponse;
import com.tan.self.mapper.UserMapper;
import com.tan.self.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Mr.tan
 * Date:  2018/01/25 14:15
 * Description:
 */
@RestController
@Api(tags = "用户接口")
@RequestMapping("user")
public class UserApiController {

    @Autowired
    private UserMapper userMapper;

    @ApiOperation(httpMethod = "GET", value = "获取单个用户信息", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public RestResponse getUserDetail(@PathVariable(value = "id") Integer id) {
        return new RestResponse(200, "success", userMapper.selectById(id));
    }


    @ApiOperation(httpMethod = "GET", value = "获取所有用户信息", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public RestResponse getAllUser() {
        return new RestResponse(200, "success", userMapper.selectList(new EntityWrapper<User>()));
    }

    @ApiOperation(httpMethod = "POST", value = "新增用户", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RestResponse saveUser(User user) {
        return new RestResponse(200, "success", userMapper.insert(user));
    }

    @ApiOperation(httpMethod = "POST", value = "删除用户", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public RestResponse delUser(@ApiParam(name = "用户ID",required = true) @RequestParam(value = "id") Integer id) {
        return new RestResponse(200, "success", userMapper.deleteById(id));
    }
}
