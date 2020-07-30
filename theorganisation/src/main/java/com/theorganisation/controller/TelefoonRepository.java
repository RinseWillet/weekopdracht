package com.theorganisation.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.theorganisation.domain.Telefoon;

@Component
public interface TelefoonRepository extends CrudRepository<Telefoon, Long> {

}
