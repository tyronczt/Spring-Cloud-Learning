package com.tyron.eureka.client.provider.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: 文件上传
 * @Author: tyron
 * @Date: Created in 2020/2/16
 */
@RestController
public class FileUpload {

    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file") MultipartFile file) {
        if (file == null) {
            return "文件不能为空。";
        }
        return file.getOriginalFilename() + "的文件上传成功";
    }
}
