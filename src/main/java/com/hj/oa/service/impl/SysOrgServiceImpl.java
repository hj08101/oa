package com.hj.oa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hj.oa.dao.IBaseDao;
import com.hj.oa.entity.SysOrg;
import com.hj.oa.mapper.SysOrgMapper;
import com.hj.oa.service.ISysOrgService;

@Service
public class SysOrgServiceImpl extends BaseServiceImpl<SysOrg>
		implements ISysOrgService {
	
	@Autowired
	private SysOrgMapper sysOrgDao;

	@Override
	public IBaseDao<SysOrg> getBaseDao() {
		return sysOrgDao;
	}
}
