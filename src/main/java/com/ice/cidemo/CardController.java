package com.ice.cidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

  @GetMapping("/testing")
  public String testController(){
    return "This is Spring Rest Controller33 44 66 88 99";
  }

}
