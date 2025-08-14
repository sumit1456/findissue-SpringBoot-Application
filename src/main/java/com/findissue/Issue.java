package com.findissue;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

@Component
public class Issue {
	
	 private String title;
	    private String html_url;
	    private String body;
	    private String state;
	    private String created_at;

	    // Optional: More fields you can include
	    private User user; // nested object

	    // Getters and Setters
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getHtml_url() {
	        return html_url;
	    }

	    public void setHtml_url(String html_url) {
	        this.html_url = html_url;
	    }

	    public String getBody() {
	        return body;
	    }

	    public void setBody(String body) {
	        this.body = body;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getCreated_at() {
	        return created_at;
	    }

	    public void setCreated_at(String created_at) {
	        this.created_at = created_at;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

		
	}


