package com.Analyze.utils.FileIO;

import com.Analyze.model.评论源Entity;
import com.Analyze.repository.评论源;
import com.Analyze.utils.GetTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 * Created by huozongsheng on 2017/5/4.
 */
public class FileOutPut {
    @Autowired
    评论源 comment;
    private String path;
    MultipartFile file;
    public FileOutPut (MultipartFile file){
        path = "/Users/huozongsheng/IdeaProjects/Analyze_cloud/src/main/webapp/Comments/"+file.getOriginalFilename();
        this.file = file;
    }
    public FileOutPut (String path,MultipartFile file){
        this.path = path+file.getOriginalFilename();
        this.file = file;
    }
    public void setPath(String path){
        this.path = path;
    }
    public void excute() throws IOException {
        File outputfile = new File(path);
        FileUtils.copyInputStreamToFile(file.getInputStream(), outputfile);
    }
}
