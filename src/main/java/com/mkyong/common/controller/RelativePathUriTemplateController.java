package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: RelativePathUriTemplateController
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月26日 下午8:12:57
 *
 */
@Controller
@RequestMapping("/owners/{ownerId}")
public class RelativePathUriTemplateController {
	@RequestMapping("/pets/{petId}")
	  public void findPet(@PathVariable String ownerId, @PathVariable String petId, Model model) {    
	    // implementation omitted
		System.out.println(ownerId);
		System.out.println(petId);
	  }
	
}
