package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import com.example.domain.MemberDomain;

 

@Repository
public class MemberRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<MemberDomain> MEMBER_ROW_MAPPER = (rs,i) -> {
		MemberDomain member = new MemberDomain();
		member.setId(rs.getInt("id"));
		member.setName(rs.getString("name"));
		member.setAge(rs.getInt("age"));
		member.setDepId(rs.getInt("dep_id"));
		return member;
	};
	
	public List<MemberDomain> load(String word){
		List<MemberDomain> memberList = new ArrayList<MemberDomain>();
		String sql = "select * from members where name like :word";
		SqlParameterSource param = new MapSqlParameterSource().addValue("word", "%"+word+"%");
		System.out.println("ここまでは来てる");
		memberList = template.query(sql, param, MEMBER_ROW_MAPPER);
		return memberList;
		
	}
	
}
