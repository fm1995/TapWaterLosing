package com.sy.service.yhgl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sy.entity.UsSms;
import com.sy.entity.UsUser;
import com.sy.service.parentser.UsParentSer;
import com.sy.service.parentser.ParentSerI;

 
@Service
public class UsUserService extends UsParentSer implements ParentSerI<UsUser>{

	public void text() {
		System.out.println("text。。。");
		List<UsSms> selAll = usSmsMapper.selAll();
		for (UsSms usSms : selAll) {
			System.out.println(usSms.getEmpId());
		}
	}

	@Override
	public List<UsUser> getAll() {
		return usUserMapper.selectByExample(null);
	}
	@Override
	public UsUser selectByPrimaryKey(String id) {
		return usUserMapper.selectByPrimaryKey(id);
	}
	@Override
	public int insert(UsUser entity) {
		return usUserMapper.insert(entity);
	}
	@Override
	public int update(UsUser entity) {
		return usUserMapper.updateByPrimaryKey(entity);
	}
	@Override
	public int delete(String id) {
		return usUserMapper.deleteByPrimaryKey(id);
	}

	 
	
}
