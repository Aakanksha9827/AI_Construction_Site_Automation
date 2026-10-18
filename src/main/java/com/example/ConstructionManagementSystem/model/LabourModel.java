package com.example.ConstructionManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LabourModel {

	private String name;
	private String email;
	private String mobileNumber;
	private int experience;
	private String prevProject;
	private double expectedSalary;
	private String experties;
	private String skills;
}
