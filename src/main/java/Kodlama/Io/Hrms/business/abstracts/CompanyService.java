package Kodlama.Io.Hrms.business.abstracts;

import Kodlama.Io.Hrms.core.utilities.result.DataResult;
import Kodlama.Io.Hrms.core.utilities.result.Result;
import Kodlama.Io.Hrms.entities.concretes.Company;

public interface CompanyService {
 Result add(Company company);
 DataResult<Company> getByUserId(int userId);
}
