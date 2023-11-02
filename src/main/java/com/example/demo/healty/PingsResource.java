package com.example.demo.healty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PingsResource {


  @GetMapping("/ping/ok")
  @ResponseBody
  public String ok() {
    return "OK";
  }
}
