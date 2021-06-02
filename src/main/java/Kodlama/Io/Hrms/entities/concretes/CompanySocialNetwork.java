package Kodlama.Io.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "company_social_networks")
public class CompanySocialNetwork {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "company_id")
	private int companyId;
	@Column(name = "name")
	private String name;
	@Column(name = "connection")
	private String connection;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "active")
	private Boolean active;
}
