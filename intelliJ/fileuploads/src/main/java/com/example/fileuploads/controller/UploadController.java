package com.example.fileuploads.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.UUID;

@Controller
public class UploadController {

    @Value("${fileDir}")
    String fileDir;

    @GetMapping("/upload")
    public String getUpload() {
        return "upload/uploadForm";
    }

    @PostMapping("/upload")
    public String setUpload(
            Model model,
            @RequestParam("file") MultipartFile file) throws IOException {

        String folderName = new SimpleDateFormat("yyyyMMdd").format(System.currentTimeMillis());
        File makeFolder = new File(fileDir + folderName);

        /* make dir */
        if( !makeFolder.exists() ) {
            makeFolder.mkdir();
        }

        String oriName = file.getOriginalFilename();
        String uuid = UUID.randomUUID().toString();
        String ext = oriName.substring( oriName.lastIndexOf(".") );

        String savedFileName = uuid + ext;
        String savedPathFileName = fileDir + folderName + "/" + savedFileName;

        file.transferTo( new File(savedPathFileName) );

        /* view Data */
        model.addAttribute("savedFileName", savedFileName);
        model.addAttribute("folderName", folderName);
        model.addAttribute("savedPathFileName", savedPathFileName);

        return "upload/uploadView";
    }

    @GetMapping("/uploadView")
    public String getUploadView() {
        return "upload/uploadView";
    }


    @GetMapping("/download")
    public ResponseEntity<Resource> getDownload(@RequestParam String savedPathFileName) throws MalformedURLException {

        UrlResource resource = new UrlResource("file:" + savedPathFileName);
        String encodedFileName = UriUtils.encode(savedPathFileName, StandardCharsets.UTF_8);
        String contentDisposition = "attachment; filename=\"" +encodedFileName+ "\"";

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition).body(resource);
    }

}
