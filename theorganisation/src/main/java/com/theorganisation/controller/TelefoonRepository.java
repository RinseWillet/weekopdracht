package com.theorganisation.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.theorganisation.domain.*;

@Repository
@Component
public interface TelefoonRepository extends CrudRepository<Telefoon, Long> {

}
