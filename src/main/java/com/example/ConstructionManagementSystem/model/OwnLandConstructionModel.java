package com.example.ConstructionManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnLandConstructionModel {
	private String name;
	private String email;
	private String mobileNum;
	private int BHK;
	private String location;
}
