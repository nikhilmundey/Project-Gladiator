package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Scheme {
	
	@Id
	@Column(name="SCHEME_ID")
	private int schemeId;
	
	@Column(name="SCHEME_NAME")
	private String schemeName;
	
	@Column(name="SCHEME_DESCRIPTION")
	private String schemeDescription;
	
	@OneToOne(mappedBy="scheme", cascade=CascadeType.ALL)
	private ScholarshipApplication scholarshipApp;

	public int getSchemeId() {
		return schemeId;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}
}