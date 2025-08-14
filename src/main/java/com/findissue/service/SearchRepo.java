package com.findissue.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

import com.findissue.GitHubRepo;
import com.findissue.GitHubSearchResponse;

@Service
public class SearchRepo {
	
	@Autowired
	RestTemplate rest_template;
	
	public String searchRepo(String query, Model model, int page, int size) {
	    String url = String.format("https://api.github.com/search/repositories?q=%s&page=%d&per_page=%d", query, page, size);
        GitHubSearchResponse res = rest_template.getForObject(url, GitHubSearchResponse.class);
        model.addAttribute("repositories", res.getItems());
        model.addAttribute("page", page);
        model.addAttribute("pageSize", size);
        model.addAttribute("query", query);
        model.addAttribute("hasNextPage", res.getItems().size() == size);
        model.addAttribute("nextPage", page + 1);
        model.addAttribute("prevPage", page > 1 ? page - 1 : 1);

		return "repo";
       
	}
	


	
	

}
