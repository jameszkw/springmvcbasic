package com.mkyong.common.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloWorldController
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月26日 下午7:30:26
 *
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
	@RequestMapping("/helloworld")
	@ResponseBody
	public String helloWorld() {
		System.out.println("helloWorld()");
		return "helloWorld()";
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String get() {
		System.out.println("get()");
		return "get()";
	}

	@RequestMapping(value = "/{day}/{month}", method = RequestMethod.GET)
	@ResponseBody
	public String pathVariable(@PathVariable String day,
			@PathVariable String month) {
		System.out.println(day);
		System.out.println(month);
		return new Date().toString();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String post() {
		System.out.println("post()");
		return "post";
	}

	@RequestMapping(value = "/{day}/{month}", method = RequestMethod.POST)
	@ResponseBody
	public String post1(@PathVariable String day, @PathVariable String month) {
		System.out.println(day);
		System.out.println(month);
		return "post1";
	}

	@RequestMapping("/nomethod")
	public String noMethod() {
		System.out.println("noMethod()");
		return "noMethod";
	}

	@RequestMapping(value = "/pets", params = "myParam=myValue")
	@ResponseBody
	public void paramsMap() {
		// implementation omitted
		System.out.println("paramsMap");
	}
	
	@RequestMapping(value = "/pets", method = RequestMethod.POST, headers="content-type=text/*")
	  public void postPets(@PathVariable String ownerId) {    
	    // implementation omitted
		System.out.println("postPets");
	  }

}
