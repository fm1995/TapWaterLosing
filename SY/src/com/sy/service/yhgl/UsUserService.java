package com.sy.service.yhgl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sy.entity.UsSms;
import com.sy.entity.UsUser;
import com.sy.service.parentser.ParentSerI;
import com.sy.service.parentser.UsParentSer;

 
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

	/**
	 * 分页查询
	 * @param page
	 * @param rows
	 * @param userMoney
	 * @return
	 */
	public List<UsUser> selectYSList(int page, int rows, Integer userMoney) {
		return usUserMapper.selectYSList((page - 1) * rows,rows,userMoney);
	}
	/** 
	 * 分页查询 查询总数 
	 * @param page
	 * @param rows
	 * @param userMoney 
	 * @return
	 */
	public int selectYSListCount(int page, int rows, Integer userMoney){
		return usUserMapper.selectYSListCount( page,  rows, userMoney);
	}
	public Map<String,Object> yushou(int page, int rows, Integer userMoney){
		int total = this.selectYSListCount((page - 1) * rows,  rows, userMoney);
		List<UsUser> users=usUserMapper.selectYSList((page - 1) * rows,rows,userMoney);
	
		Double moneys = usUserMapper.selectYSMonenys((page - 1) * rows,  rows, userMoney);
		System.out.println("moneys: ="+moneys);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", total);
		map.put("rows", users);
		map.put("moneys", moneys==null?moneys:0.0);
		map.put("userMoney", userMoney);
		int pageCount=(int) Math.ceil(total/(rows*1.0));
		map.put("page", page);
		map.put("pageCount", pageCount);
		return map;
	}
	
}
