package com.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Batches;


@Service
public interface BatchService {
	
	Batches addbatch(Batches batches);

	Batches getbatchDetail(int bid);

	List<Batches> getAllbatches();

}
