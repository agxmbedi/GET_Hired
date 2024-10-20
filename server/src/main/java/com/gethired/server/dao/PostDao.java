package com.gethired.server.dao;
import com.gethired.server.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostDao extends MongoRepository<PostModel, String> {
}