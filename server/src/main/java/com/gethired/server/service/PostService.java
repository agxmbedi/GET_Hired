package com.gethired.server.service;

import com.gethired.server.dto.PostDTO;
import com.gethired.server.model.PostModel;

import java.util.List;

public interface PostService {

    public List<PostModel> getAllPosts();

    public PostModel savePost(PostDTO post);
}