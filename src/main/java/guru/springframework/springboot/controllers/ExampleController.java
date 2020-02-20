package guru.springframework.springboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@RequestMapping("/")
	public Map<String, Object> getIndex() {
		Map<String, Object> returnVal = new HashMap<String, Object>();
		returnVal.put("hello", "world");

		return returnVal;
	}

}
