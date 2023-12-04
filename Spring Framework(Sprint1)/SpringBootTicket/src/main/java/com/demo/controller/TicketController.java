package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Dao.TicketDao;
import com.demo.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao ticketDao;
	@PostMapping("/booktictets")
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		ticketDao.saveAll(tickets);
		return "ticket booked:" + tickets.size();
	}
	@GetMapping("/getTickets")
	public List<Ticket> getTickets() {
		return (List<Ticket>) ticketDao.findAll();
	}
}
