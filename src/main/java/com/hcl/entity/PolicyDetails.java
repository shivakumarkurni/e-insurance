package com.hcl.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PolicyDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private long policyId;
private String policyName;
private String policyType;
private double policyAmount;
private Date policyDuration;
	

}
