package com.dto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Employee {

	private Integer eid;
	private String ename;
	private Integer eage;
	private byte[] photo;
    private byte[] resume;
	
	public  Integer getEid() {
		    return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getEage() {
		return eage;
	}
	public void setEage(Integer eage) {
		this.eage = eage;
	}
	
	public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(String photoPath) throws IOException {
        this.photo = Files.readAllBytes(Path.of(photoPath));
    }

    public byte[] getResume() {
        return resume;
    }

    public void setResume(String resumePath) throws IOException {
        this.resume = Files.readAllBytes(Path.of(resumePath));
    }
	
	
}
