package com.demo.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.BatchRepo;
import com.demo.entity.Batches;
import com.demo.exception.BatchNotFoundException;
import com.demo.services.BatchService;

@Service
public class BatchServiceImpl implements BatchService {
	@Autowired
	BatchRepo brepo;

	@Override
	public Batches addbatch(Batches batches) {
		// TODO Auto-generated method stub
		return brepo.save(batches);

	}

	@Override
	public Batches getbatchDetail(int bid) {
		// TODO Auto-generated method stub
		return brepo.findById(bid).orElseThrow(() -> new BatchNotFoundException("Entered batch is not present"));

	}

	@Override
	public List<Batches> getAllbatches() {
		// TODO Auto-generated method stub
		return brepo.findAll();

	}

}
