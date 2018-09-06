package com.yc.service;

<<<<<<< HEAD
import java.util.List;

=======
import com.github.pagehelper.PageInfo;
>>>>>>> branch 'master' of https://github.com/2500911955/infomanager.git
import com.yc.po.PersonnelInfo;

public interface PersonnelInfoService {

<<<<<<< HEAD
	List<PersonnelInfo> findAll();

	int deleteById(Integer pid);
=======
	@SuppressWarnings("rawtypes")
	PageInfo findPerson(Integer n, Integer size);
	
	PersonnelInfo isLogin(String username,String password);
>>>>>>> branch 'master' of https://github.com/2500911955/infomanager.git

}
