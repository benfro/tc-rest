package net.benfro.lab.tconline;

import com.google.common.collect.Lists;
import net.benfro.lab.tconline.web.SystemController;
import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.thermocalc.commons.logging.Logging;
import se.thermocalc.core.CalculationEngineException;
import se.thermocalc.externalapi.exceptions.APIException;
import se.thermocalc.externalapi.thermodynamic.SingleEquilibriumCalculation;
import se.thermocalc.externalapi.thermodynamic.SingleEquilibriumTempResult;

import java.util.ArrayList;

import static se.thermocalc.externalapi.TCSystem.TCSystem;

@SpringBootApplication
public class TcOnlineApplication {

	@Autowired
	private SystemController systemController;

	private static Logger logger = LoggerFactory.getLogger(TcOnlineApplication.class);

	public static void main(String[] args) throws CalculationEngineException, APIException {



		SpringApplication.run(TcOnlineApplication.class, args);
		logger.info("Hi, guys");

		//SingleEquilibriumCalculation calculation = TCSystem().selectDatabaseAndElements("ALDEMO", Lists.newArrayList("Al", "Cu", "Si")).
		//			buildSystem().
		//			withSingleEquilibriumCalculation(false, new ArrayList<>()).
		//			setCondition("T", 800).
		//			setCondition("P", 101325).
		//			setCondition("N", 1).
		//			setCondition("X(Cu)", 1e-4).
		//			setCondition("X(Si)", 1e-4).
		//			disableGlobalMinimization().
		//			runPolyCommand("adv_op global N,,,,");
//
		//logger.info("Start");
		//double k = 40;
		//for (int icu = 0; icu <= k; icu++) {
		//	double x_cu = 1e-4 + 0.05 / k * icu;
		//	calculation.setCondition("X(Cu)", x_cu);
		//	for (int isi = 0; isi <= k; isi++) {
		//		double x_si = 1e-4 + 0.05 / k * isi;
		//		SingleEquilibriumTempResult result = calculation.setCondition("X(Si)", x_si).calculateTempResult();
		//		double hcp_a3 = result.getValueOf("gm(hcp_a3)");
		//		double liq = result.getValueOf("gm(liq)");
		//		logger.info("Gibbs {}, {}, {}, {}", hcp_a3, liq, x_cu, x_si);
		//	}
		//}
		logger.info("stop");
	}

}
