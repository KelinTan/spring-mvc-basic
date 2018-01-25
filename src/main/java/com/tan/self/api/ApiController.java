package com.tan.self.api;

import com.tan.self.bean.RestResponse;
import io.swagger.annotations.Api;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Mr.Tanzc on 2017/8/12.
 */
@Controller
@RequestMapping("api")
@ResponseBody
@Api(tags = "API接口")
public class ApiController {

    private Logger logger = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping(value = "getJson", method = RequestMethod.GET)
    public RestResponse getApiJson() {

        RestResponse restResponse = new RestResponse();
        restResponse.setCode(200);
        restResponse.setMsg("操作成功");
        logger.info("获取json数据接口");
        return restResponse;
    }

    /**
     * 图片上传
     *
     * @param file 文件
     * @return
     */
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public RestResponse upload(@RequestParam("file") MultipartFile file) {
        RestResponse restResponse = new RestResponse();
        try {
            FileUtils.writeByteArrayToFile(new File("/data/upload/" + file.getOriginalFilename()), file.getBytes());
            restResponse.setCode(200);
            restResponse.setMsg("上传成功");
        } catch (IOException e) {
            e.printStackTrace();
            restResponse.setCode(500);
            restResponse.setMsg("网络异常");
        }
        return restResponse;
    }
}
