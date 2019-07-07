package com.testproject.app.model;

import com.testproject.app.model.Person;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
public class CommandObj {
    private String myname;
    private String mobile;
    private MultipartFile myfile;
}
