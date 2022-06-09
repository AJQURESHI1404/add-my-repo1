package com.zira.restaurant.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nilesh.demo.model.Student;
import com.nilesh.demo.repository.SaveStudentRepository;
import com.zira.restaurant.model.Inventory;
import com.zira.restaurant.repository.InventoryRepository;
import com.zira.restaurant.service.IInventoryServive;

@Controller
public class InventoryController {
     
	@Autowired
	private IInventoryServive inventoryService;
	
	@RequestMapping("/inventory/{pageNo}/{pageSize}")
	@ResponseBody
	public List<Inventory> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
		return inventoryService.findPaginated(pageNo, pageSize);
	}

	@RequestMapping("home")
	public String homeFun(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("totalStudent", repo.count());
		return "homePage";
	}
	
	@Autowired
	InventoryRepository repo;
	
	@RequestMapping("addInventory")
	public String saveStudent(Inventory I) {
		repo.save(I);
		return "homePage";
	}
	
	
	@RequestMapping("delInventory")
	public String delStudent(int Iid) {
		repo.deleteById(Iid);
		return "homePage";
	}
	
	
}


