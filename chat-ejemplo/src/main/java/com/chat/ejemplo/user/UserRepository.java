package com.chat.ejemplo.user;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chat.ejemplo.util.Status;


public interface UserRepository  extends MongoRepository<User,String>{
  List<User> findAllByStatus(Status status);
}
