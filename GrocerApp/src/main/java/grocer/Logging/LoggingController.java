package grocer.Logging;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoggingController {


	@Autowired
    private ContactDAOImpl contactDAO;
	
	@RequestMapping(value="/")
	public ModelAndView showHome(ModelAndView model) {
		model.setViewName("index");
		
		return model;
	}
	
	@RequestMapping(value="/logs")
	public ModelAndView listLogs(ModelAndView model) throws IOException{
	    List<Log> listLogs = contactDAO.list();
	    model.addObject("logs", listLogs);
	    model.setViewName("rawlogs");
	 
	    return model;
	}
	
	@RequestMapping(value="/parsedlogs")
	public ModelAndView listParsedLogs(ModelAndView model) throws IOException, SQLException{
	    List<ParsedLog> listLogs = contactDAO.parsedList();
	    model.addObject("parsedlogs", listLogs);
	    model.setViewName("cleanlogs");
	 
	    return model;
	}
	
	
}
