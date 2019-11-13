package net.benfro.lab.tconline.web;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SingleEqCalcController {

   @RequestMapping("/simple")
   public Map<String,Double> simple() {
      return Maps.newHashMap();
   }
}
