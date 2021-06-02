package Kodlama.Io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.Io.Hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
