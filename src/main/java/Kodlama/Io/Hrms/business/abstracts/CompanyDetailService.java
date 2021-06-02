package Kodlama.Io.Hrms.business.abstracts;

import Kodlama.Io.Hrms.core.utilities.result.Result;
import Kodlama.Io.Hrms.entities.concretes.CompanyDetail;

public interface CompanyDetailService {
Result add(CompanyDetail companyDetail);
}
