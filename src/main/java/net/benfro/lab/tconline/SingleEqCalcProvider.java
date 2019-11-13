package net.benfro.lab.tconline;

import net.benfro.lab.tconline.domain.SystemInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.thermocalc.core.CalculationEngineException;
import se.thermocalc.externalapi.exceptions.APIException;
import se.thermocalc.externalapi.thermodynamic.SingleEquilibriumCalculation;

import java.util.ArrayList;

@Service
public class SingleEqCalcProvider {

   @Autowired
   private SystemProvider systemProvider;

   public SingleEquilibriumCalculation getSingleEqCalc(SystemInput input, boolean defaultCondition, ArrayList<String> components) throws CalculationEngineException, APIException {
      return systemProvider.selectDatabaseAndElements(input).withSingleEquilibriumCalculation(defaultCondition, components);
   }

}
