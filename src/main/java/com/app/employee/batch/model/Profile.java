package com.app.employee.batch.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Profile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7547344967060504602L;
	private long empCode;
	private String empName;
	private String profileName;

}
