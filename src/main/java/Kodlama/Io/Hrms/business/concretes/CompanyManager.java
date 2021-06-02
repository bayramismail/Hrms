package Kodlama.Io.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.Io.Hrms.business.abstracts.CompanyService;
import Kodlama.Io.Hrms.core.utilities.result.DataResult;
import Kodlama.Io.Hrms.core.utilities.result.Result;
import Kodlama.Io.Hrms.core.utilities.result.SuccessDataResult;
import Kodlama.Io.Hrms.core.utilities.result.SuccessResult;
import Kodlama.Io.Hrms.dataAccess.concretes.CompanyDao;
import Kodlama.Io.Hrms.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService{

	private CompanyDao companyDao;
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public Result add(Company company) {
		// TODO Auto-generated method stub
		companyDao.save(company);
		return new SuccessResult("Kayıt basarılı");
	}

	@Override
	public DataResult<Company> getByUserId(int userId) {
		// TODO Auto-generated method stub
		
		return new SuccessDataResult<Company>(companyDao.getByUserId(userId));
	}

}
