package org.keith.test.module.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

	@RequestMapping(value="/md_index")
	public Map<String,String> testMdIndex(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", "md_index");
		return map;
	}
}
