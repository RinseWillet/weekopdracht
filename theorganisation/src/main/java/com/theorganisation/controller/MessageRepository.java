package com.theorganisation.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.theorganisation.domain.Message;

@Component
public interface MessageRepository extends CrudRepository<Message, Long> {

}
