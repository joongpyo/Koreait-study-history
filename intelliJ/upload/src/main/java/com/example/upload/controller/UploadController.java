package com.example.upload.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


@Controller
public class UploadController {

    @Value("${fileDir}")
    String fileDir;

    @GetMapping("/upload")
    public String getUpload(){
        return "upload/upload";
    }

    @GetMapping("/view")
    public String getView(){
        return "upload/view";
    }

    @PostMapping("/upload")
    public String setUpload(@RequestParam("file") MultipartFile file, Model model ) throws IOException {
//        String fileDir = "C:/Users/ITPS/Downloads/upload/src/main/resources/static/upload/";
        //파일 중복 -> 변경(uuid) -> 확장자 기준으로 배열 0 -> uuid 변경하여 -> 저장
//        UUID 임의의 난수 생성
//        String uuid = UUID.randomUUID().toString();

        String origName = file.getOriginalFilename(); //원래 파일명

//        .을 기준으로(indexOf(".")) 자르기(substring)

        String ext = origName.substring(origName.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();

        String fileName = uuid + ext;

        String savePathFile = fileDir + fileName;

        file.transferTo(new File(savePathFile));


        model.addAttribute("filename", fileName);
//        System.out.println(fileName);
        return "upload/view";
    }
}
