package com.findissue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.findissue.Issue;
import com.findissue.exception.GenericException;
import com.findissue.exception.IlligalParamatersException;
import com.findissue.exception.IncorrectUrlException;
import com.findissue.exception.ServerErrorException;



@Service
public class FindIssueService {
	
	
	
	@Autowired
	RestTemplate rest_template;
	
	public Issue[] getIssuesGitHub(String org, String repo, int page, int perPage) {
	    String url = String.format("https://api.github.com/repos/%s/%s/issues?page=%d&per_page=%d", org, repo, page, perPage);
	    try {
	    	 Issue[] a = rest_template.getForObject(url, Issue[].class);
	    	 return a;
	    }
	    catch(ResourceAccessException ra) {
	    	throw new IncorrectUrlException();
	    }
	    catch (HttpClientErrorException e) {
	    	if(e.getStatusCode().value()==404) {
	    		 throw new ServerErrorException(); // Or another custom exception
	    	}
	    	else {
	    		throw new IlligalParamatersException();
	    	}
	       
	    }
	    catch(Exception e) {
	    	throw new GenericException();
	    }
	    
	}


}
