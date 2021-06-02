package Kodlama.Io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.Io.Hrms.entities.concretes.Company;


public interface CompanyDao extends JpaRepository<Company, Integer>{
	Company getByUserId( int userId);
}
