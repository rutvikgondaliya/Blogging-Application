package com.rutvik.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rutvik.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
