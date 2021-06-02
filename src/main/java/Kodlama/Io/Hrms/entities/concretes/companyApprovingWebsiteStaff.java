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
@Table(name = "company_approving_website_staff")
@AllArgsConstructor
@NoArgsConstructor
public class companyApprovingWebsiteStaff {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "website_staff_id")
	private int websiteStaffId;
	@Column(name = "company_verification_id")
	private int companyVerificationId;
	@Column(name = "detail")
	private String detail;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "active")
	private Boolean active;
}
