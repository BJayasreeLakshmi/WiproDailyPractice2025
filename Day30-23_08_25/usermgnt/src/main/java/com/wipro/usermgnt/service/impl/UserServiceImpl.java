package com.wipro.usermgnt.service.impl;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import com.wipro.usermgnt.entity.User;
import com.wipro.usermgnt.repo.UserRepo;
import com.wipro.usermgnt.repo.UserRepo;
import com.wipro.usermgnt.service.UserService;

//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.security.Keys;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> findAll() {
		
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		Optional<User> userOpt= userRepo.findById(id);
		if(userOpt.isPresent())
		{
			return userOpt.get();
		}
		return null;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}

	@Override
	public String login(User user) {
		// TODO Auto-generated method stub
		
		User userData=userRepo.findByEmailAndPassWord(user.getEmail(), user.getPassWord());
		if(userData!=null)
		{
			System.out.println("Here");
			return "success";
			//return getJWTToken(user.getEmail());
		}
		return null;
	}
	
	

//    private String getJWTToken(String username) {
//        Key key = Keys.hmacShaKeyFor(AppConstant.SECRET.getBytes(StandardCharsets.UTF_8));
//        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
//
//        return Jwts.builder()
//                .setId("jwtExample")
//                .setSubject(username)
//                .claim("authorities", grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + 60000))
//                .signWith(key,SignatureAlgorithm.HS512)
//                .compact();
//    }

}
