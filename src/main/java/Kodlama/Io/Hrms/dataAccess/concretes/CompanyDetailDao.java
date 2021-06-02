package Kodlama.Io.Hrms.dataAccess.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.Io.Hrms.entities.concretes.CompanyDetail;



public interface CompanyDetailDao extends JpaRepository<CompanyDetail, Integer> {

}
