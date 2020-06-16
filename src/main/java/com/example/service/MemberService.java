package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.MemberDomain;
import com.example.repository.MemberRepository;

@Service
public class MemberService {
 
	@Autowired
	private MemberRepository repository;
	
	public List<MemberDomain> load(String word){
		List<MemberDomain> memberList = repository.load(word);
		return memberList;
	}
}
