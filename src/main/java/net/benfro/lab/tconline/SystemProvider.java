package net.benfro.lab.tconline;

import com.google.common.collect.Lists;
import net.benfro.lab.tconline.domain.SystemInput;
import org.springframework.stereotype.Service;
import se.thermocalc.core.CalculationEngineException;
import se.thermocalc.externalapi.database.System;

import java.util.ArrayList;

import static se.thermocalc.externalapi.TCSystem.TCSystem;

@Service
public class SystemProvider {

   public System selectDatabaseAndElements(SystemInput systemInput) throws CalculationEngineException {
      return TCSystem().selectDatabaseAndElements(systemInput.getDatabase(), systemInput.getElements()).buildSystem();
   }
}
