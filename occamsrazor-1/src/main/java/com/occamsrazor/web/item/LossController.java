package com.occamsrazor.web.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lostItem")
public class LossController {
	@Autowired LossService itemService;

	@GetMapping("/list")
	public List<Loss> list() {
		
		return itemService.fideAll();
	}
}
