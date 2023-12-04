package com.demo.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Member;
import com.demo.service.MemberService;


@RestController
@RequestMapping("/Gym")
public class GymController {

    private final MemberService gymservice;

    public GymController(MemberService gymservice) {
        this.gymservice = gymservice;
    }

    @GetMapping("/get/All")
    public ResponseEntity<List<Member>> getAllGym() {
        List<Member> gyms = gymservice.getAllGym();
        return ResponseEntity.ok(gyms);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Member> getGymById(@PathVariable int id) {
        Member gym = gymservice.getGymById(id);
        if (gym != null) {
            return ResponseEntity.ok(gym);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/addMember")
    public ResponseEntity<String> createGym(@RequestBody Member gym) {
        Member createdGym = gymservice.createGym(gym);
        if (createdGym != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Gym member with ID " + createdGym.getId() + " added successfully");
            
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create gym member ID");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateGym(@PathVariable int id, @RequestBody Member updatedGym) {
        Member gym = gymservice.updateGym(id, updatedGym);
        if (gym != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Gym member with ID " + id + " updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable int id) {
        boolean deleted = gymservice.deleteGym(id);
        if (deleted) {
            return ResponseEntity.ok("Gym member with ID " + id + " is deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}