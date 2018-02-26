package com.genewhisper.dao.entity;

import java.sql.Timestamp;

public class CustomerProfileEntity {

	private int fid;
	private String name;
	private String email;
	private Timestamp doe;

	/**
	 * @return the fid
	 */
	public int getFid() {
		return fid;
	}

	/**
	 * @param fid
	 *            the fid to set
	 */
	public void setFid(int fid) {
		this.fid = fid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the doe
	 */
	public Timestamp getDoe() {
		return doe;
	}

	/**
	 * @param doe
	 *            the doe to set
	 */
	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerProfileEntity [fid=" + fid + ", name=" + name + ", email=" + email + ", doe=" + doe + "]";
	}

}
