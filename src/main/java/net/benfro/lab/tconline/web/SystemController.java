package net.benfro.lab.tconline.web;

import com.google.common.collect.Lists;
import net.benfro.lab.tconline.SystemProvider;
import net.benfro.lab.tconline.domain.SystemInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.thermocalc.core.CalculationEngineException;

@RestController
public class SystemController {
   @Autowired
   private SystemProvider systemProvider;

   @RequestMapping("/allPhases")
   public Iterable<String> getAllPhases(@RequestParam("db") String database, @RequestParam("elem")String elements) throws CalculationEngineException {
      String[] split = elements.split(",");
      SystemInput input = new SystemInput(database, Lists.newArrayList(split));
      return systemProvider.selectDatabaseAndElements(input).getAllPhasesInDatabases();
   }

}
