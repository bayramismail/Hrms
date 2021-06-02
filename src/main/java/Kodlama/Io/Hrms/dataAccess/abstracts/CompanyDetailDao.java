package Kodlama.Io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.Io.Hrms.entities.concretes.CompanyDetail;



public interface CompanyDetailDao extends JpaRepository<CompanyDetail, Integer> {

}
