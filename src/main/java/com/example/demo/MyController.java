package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MyController {

    @PostMapping("/testsubmit")
    @ResponseBody
    public String testSubmit(TestForm t){
        return " ___name:==> " +t.getName()+" ___email:==> " +t.getEmail()+" ___file:==> " +t.getMyfile().getOriginalFilename();
    }
}
class TestForm{
    String name;
    String email;
    MultipartFile myfile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MultipartFile getMyfile() {
        return myfile;
    }

    public void setMyfile(MultipartFile myfile) {
        this.myfile = myfile;
    }
}
