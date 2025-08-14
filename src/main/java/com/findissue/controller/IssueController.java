package com.findissue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.findissue.Issue;
import com.findissue.exception.GenericException;
import com.findissue.service.FindIssueService;
import com.findissue.service.SearchRepo;




@Controller
public class IssueController {
	
	@Autowired
	FindIssueService fs;
	
	
	@GetMapping("/home")
	public String begin() {
		return "index";
	}
	
//	@GetMapping("/issues")
//	public String getIssues(Model model) {
//		
//		return "isssues";
//	}
	
	@GetMapping("/issues")
	public String getIssues(@RequestParam String org,
	                        @RequestParam String repo,
	                        @RequestParam(defaultValue = "1") int page,
	                        Model model) {

	    int pageSize = 3; // Show 10 issues per page
	    Issue[] issues = fs.getIssuesGitHub(org, repo, page, pageSize);

	    model.addAttribute("issues", issues);
	    model.addAttribute("page", page);
	    model.addAttribute("prevPage", page > 1 ? page - 1 : 1);
	    model.addAttribute("nextPage", page + 1);
	    model.addAttribute("org", org);
	    model.addAttribute("repo", repo);

	    return "isssues";
	}

	
	
	@GetMapping("/about")
		public String getAbout() {
			return "about";
		
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	

}
