package grocer.Logging;

import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

Logger logger = LoggerFactory.getLogger(LoggingController.class);

@RequestMapping("/logs")
public String index() {
    

    try {
		return Logging.outputLogs();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}
