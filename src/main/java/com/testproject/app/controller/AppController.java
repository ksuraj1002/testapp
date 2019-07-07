package com.testproject.app.controller;

import com.testproject.app.model.CommandObj;
import com.testproject.app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class AppController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/json")
    public String getJson(){
        return "json";
    }


    @GetMapping() //not url
    public String getIndex(){
        return "index";
    }

    /*@PostMapping("/submitdata")
    @ResponseBody
    public  String postData(@RequestParam(required=true, value="myfile") MultipartFile myfile, @RequestParam("jsonString") String jsonString) throws IOException {
         System.out.println(myfile.getOriginalFilename()+ " "+myfile.getBytes().toString());
         System.out.println(jsonString);
        return "Successfully";
    }*/

    @PostMapping("/submitdata")
    @ResponseBody
    public String postData(CommandObj commandObj) throws IOException {
       /* File convertFile = new File("F:/bca"+ commandObj.getMyfile().getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(convertFile);
        fout.write(commandObj.getMyfile().getBytes());
        fout.close();*/
       System.out.println(commandObj.getMyfile().getOriginalFilename());
        return "Submitted Successfully";
    }
}
