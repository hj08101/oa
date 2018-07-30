package com.hj.oa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hj.oa.entity.SysOrg;
import com.hj.oa.service.ISysOrgService;

@Controller
@RequestMapping("sysOrg")
public class SysOrgController {
	
	@Autowired
	private ISysOrgService sysOrgService;
	
	@RequestMapping("getById")
	@ResponseBody
	public SysOrg getOrgById(@RequestParam(required=true) Long id) {
		return sysOrgService.selectByPrimaryKey(id);
	}
}
