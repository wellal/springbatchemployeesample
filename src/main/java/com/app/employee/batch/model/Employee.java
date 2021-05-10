package com.app.employee.batch.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4647372811810437968L;
	private long empCode;
	private String empName;
	private int expInYears;
}
