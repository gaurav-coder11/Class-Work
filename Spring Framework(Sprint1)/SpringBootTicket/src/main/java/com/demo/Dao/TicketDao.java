package com.demo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
