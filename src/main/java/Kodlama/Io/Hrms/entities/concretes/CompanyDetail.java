package Kodlama.Io.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "company_details")
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDetail {
	@Column(name = "company_id")
	private int companyId;
	@Column(name = "web_address")
	private String webAddress;
	@Column(name = "address")
	private String address;
	@Column(name = "company_detail")
	private String companyDetail;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "active")
	private Boolean active;
}
