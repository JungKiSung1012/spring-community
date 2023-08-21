package com.JKS.community.repository;

import com.JKS.community.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    Post findByTitle(String title);
}