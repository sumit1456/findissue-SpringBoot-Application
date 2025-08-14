package com.findissue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.findissue.service.SearchRepo;

@Controller
public class RepositoryController {
	@Autowired
	SearchRepo sr;
	
	@GetMapping("/search-repo")
    public String searchRepo(@RequestParam String query, Model model,
    		@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4") int size) {
	return sr.searchRepo(query, model, page, size);
}


}
