package springweb.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@Table(name="company")
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="company_id")
	private long companyId;

	@Column(name="company_code")
	private Object companyCode;

	@Column(name="company_name")
	private Object companyName;

	@Column(name="company_parent_id")
	private long companyParentId;

	@Column(name="company_short_name")
	private Object companyShortName;


	private Object description;

	private boolean enabled;

	@Column(name="is_branch")
	private boolean isBranch;


	public Company() {
	}

	public long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public Object getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(Object companyCode) {
		this.companyCode = companyCode;
	}

	public Object getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(Object companyName) {
		this.companyName = companyName;
	}

	public long getCompanyParentId() {
		return this.companyParentId;
	}

	public void setCompanyParentId(long companyParentId) {
		this.companyParentId = companyParentId;
	}

	public Object getCompanyShortName() {
		return this.companyShortName;
	}

	public void setCompanyShortName(Object companyShortName) {
		this.companyShortName = companyShortName;
	}

	

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean getIsBranch() {
		return this.isBranch;
	}

	public void setIsBranch(boolean isBranch) {
		this.isBranch = isBranch;
	}

	

}