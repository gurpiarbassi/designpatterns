package com.gurps.designpatterns.structural.bridge;

public class PersistenceEntity {

	private Long primaryKey;
	private String recordType; //D=database, F=File

	public Long getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(Long primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}	
}
