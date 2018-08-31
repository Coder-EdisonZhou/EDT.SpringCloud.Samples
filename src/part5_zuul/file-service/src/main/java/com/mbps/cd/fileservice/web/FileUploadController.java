package com.mbps.cd.fileservice.web;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @project: part5_zuul
 * @description:
 * @author: Edison Zhou
 * @create: 2018-08-29
 **/
public class FileUploadController {
    @PostMapping(value = "/upload")
    public @ResponseBody String handleFileUpload(@RequestParam(value = "file",
            required = true)MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        File fileToSave = new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes, fileToSave);

        return fileToSave.getAbsolutePath();
    }
}
