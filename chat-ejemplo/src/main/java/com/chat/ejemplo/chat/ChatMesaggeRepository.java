package com.chat.ejemplo.chat;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface ChatMesaggeRepository extends MongoRepository<ChatMessage,String> {
  List<ChatMessage> findByChatId(String chatId);
}
