package nab.nabone.npsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nab.nabone.npsapi.model.TechnicalService;
import nab.nabone.npsapi.service.TechnicalServiceService;

@RestController
public class TechnicalServiceController {

	@Autowired
	private TechnicalServiceService technicalService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String name) {

		return technicalService.create(name).toString();
	}

	@RequestMapping("/get")
	public TechnicalService get(@RequestParam String name) {

		return technicalService.getByName(name);
	}
	
	@RequestMapping("/getAll")
	public List<TechnicalService> getAll(@RequestParam String name) {
		return technicalService.getAll();
	}
	
	@RequestMapping("delete")
	public String delete(@RequestParam String name) {
		technicalService.delete(name);
		return "Deleted: " + name;
	}
	
	
} 
