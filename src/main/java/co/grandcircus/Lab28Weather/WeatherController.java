package co.grandcircus.Lab28Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WeatherController {
	
	@Autowired
	private ApiService apiServ;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("response", apiServ.getWeather());
		return mav;
	}
	
//	@RequestMapping("/dictionary")
//	public ModelAndView dictionaryResults(@RequestParam String word) {
//		
//		ModelAndView mav = new ModelAndView("definition");
//		
//		Response diction = apiServ.findDefinition(word);
//		
//		if(diction == null) {
//			return new ModelAndView("redirect:/");
//		}
//		
//		mav.addObject("word", diction);
//		
//		return mav;
//	}
	
	

}
