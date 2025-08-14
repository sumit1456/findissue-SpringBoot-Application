package com.findservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findissue.GitHubRepo;

public interface GitHubRepoRepository extends JpaRepository<GitHubRepo, Integer> {

}
