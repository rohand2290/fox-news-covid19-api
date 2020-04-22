package com.de2290.foxNewsCOVID19API.APIBackend;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class APIController {


    @GetMapping("/getHeadlines")
    public HeadlineList getHeadlineList() throws IOException {
        return new HeadlineGetter().getHeadlineList();
    }
}
