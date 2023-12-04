package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.demo.entity.Member;
import com.demo.repository.MemberRepository;

@Service
public class MemberService {

    private final MemberRepository gymrepo;

    public MemberService(MemberRepository gymrepo) {
        this.gymrepo = gymrepo;
    }

    //get all values
    public List<Member> getAllGym() {
        return gymrepo.findAll();
    }

    //get a single id value
    public Member getGymById(int id) {
        return gymrepo.findById(id).orElse(null);
    }

    //for post method
    public Member createGym(Member gym) {
        return gymrepo.save(gym);
    }

    //for put method
    public Member updateGym(int id, Member updateGym) {
        Member existingMember = gymrepo.findById(id).orElse(null);
        if (existingMember == null) {
            return null;
        }
        existingMember.setName(updateGym.getName());
        existingMember.setPhone(updateGym.getPhone());
        existingMember.setAddress(updateGym.getAddress());
        existingMember.setPrice(updateGym.getPrice());
        existingMember.setJoinDate(updateGym.getJoinDate());
        existingMember.setEndDate(updateGym.getEndDate());
       
        if (updateGym.getMembership() != null) {
            existingMember.setMembership(updateGym.getMembership());
        }        return gymrepo.save(existingMember);
    }
    
 

    //for delete method
    public boolean deleteGym(int id) {
        Member existingMember = gymrepo.findById(id).orElse(null);

        if (existingMember == null) {
            return false;
        }
        gymrepo.delete(existingMember);
        return true;
    }
}
