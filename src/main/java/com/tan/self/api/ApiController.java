package com.tan.self.api;

import com.tan.self.bean.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Mr.Tanzc on 2017/8/12.
 */
@Controller
@ResponseBody
@RequestMapping("api")
public class ApiController {

    private Logger logger = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping("getJson")
    public RestResponse getApiJson() {

        RestResponse restResponse = new RestResponse();
        restResponse.setCode(200);
        restResponse.setMsg("操作成功");
        logger.info("获取json数据接口");
        return restResponse;
    }
}
