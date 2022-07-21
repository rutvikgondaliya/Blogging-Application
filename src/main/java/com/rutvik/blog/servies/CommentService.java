package com.rutvik.blog.servies;

import com.rutvik.blog.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto, Integer postId);
	
	void deleteComment(Integer commentId);

}
