package com.api.book.bootrestbook.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Author_Table")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int aid;
	String fname;
	String lname;
	String lang;
	
	@OneToOne(mappedBy = "author")
	@JsonBackReference
	@Cascade(CascadeType.ALL)
	Book book;
	
	public Author() {
	}

	public Author(int aid, String fname, String lname, String lang) {
		super();
		this.aid = aid;
		this.fname = fname;
		this.lname = lname;
		this.lang = lang;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", fname=" + fname + ", lname=" + lname + ", lang=" + lang + "]";
	}
	
	
	
	
}
