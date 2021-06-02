package Kodlama.Io.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "company_founders")
@AllArgsConstructor
@NoArgsConstructor
public class CompanyFounder {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "company_id")
	private int companyId;
	@Column(name = "founder_name")
	private int founderName;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "active")
	private Boolean active;
}
