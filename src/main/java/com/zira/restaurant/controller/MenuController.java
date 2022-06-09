package com.zira.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zira.restaurant.model.Menu;
import com.zira.restaurant.service.IMenuService;

@Controller
public class MenuController {
	
	
	@Autowired
	private IMenuService menuService; 
	
	@RequestMapping("/menu/{pageNo}/{pageSize}")
	@ResponseBody
	public List<menu> getpaginated(@PathVariable int pageNo,@PathVariable int pageSize){
		  return menuService.findPaginated(pageNo, pageSize);
	}
	

	@RequestMapping("Menu")
	public String saveMenu(Menu m) {
		repo.save(m);
		return m;
	}
	
	@RequestMapping("addMenu")
	public String saveMenu(Menu m) {
		repo.save(m);
		return "menu";
	}
		
		

		@RequestMapping("delMenu")
		public String delMenu(Menu productId) {
			repo.deleteById(productId);
			return "menu";
	}

}
