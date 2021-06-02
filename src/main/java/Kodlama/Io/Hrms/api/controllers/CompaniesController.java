package Kodlama.Io.Hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.Io.Hrms.business.abstracts.CompanyDetailService;
import Kodlama.Io.Hrms.business.abstracts.CompanyService;
import Kodlama.Io.Hrms.core.utilities.result.Result;
import Kodlama.Io.Hrms.entities.concretes.Company;
import Kodlama.Io.Hrms.entities.concretes.CompanyDetail;
import Kodlama.Io.Hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {

	private CompanyService _companyService;
    private CompanyDetailService _companyDetailService;
    @Autowired
	public CompaniesController(CompanyService _companyService, CompanyDetailService _companyDetailService) {
		super();
		this._companyService = _companyService;
		this._companyDetailService = _companyDetailService;
	}
	
    @PostMapping("/add")
	public Result Add( Company company,CompanyDetail companyDetail) {
		
		var result= this._companyService.add(company);
		if (result.isSuccess()) {
			 int a=_companyService.getByUserId(company.getUserId()).getData().getUserId();
		 companyDetail.setCompanyId(a);
		 return  this._companyDetailService.add(companyDetail);
		}
		return result;
	}
	
	
}
