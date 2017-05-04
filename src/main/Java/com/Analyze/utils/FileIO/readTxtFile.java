package com.Analyze.utils.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by huozongsheng on 2017/3/30.
 */
public class readTxtFile {
    private String filepath;
    private String charset;
    private ArrayList<String> store= new ArrayList<>();
    public readTxtFile(String filePath, String charset) {
        this.charset = charset;
        this.filepath = filePath;
    }
    public ArrayList<String> excute(){
        try {
            String encoding = charset;
            File file = new File(filepath);
            if (file.isFile() && file.exists()) { //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    store.add(lineTxt);
                }
                read.close();
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return store;
    }

}
