package com.app.model;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
@Entity
@ Table(name="customer_table")
public class Customer {
	@Id
	@Column(name="cusid")
	private int cusId;
	@Column(name="cusname")
	private String cusName;

	@ElementCollection
	@CollectionTable(name="cusData",joinColumns=@JoinColumn(name="cidfk"))
	@Column(name="data")
	private Set<String> data=new HashSet<String>();



	@ElementCollection
	@CollectionTable(name="mapData",joinColumns=@JoinColumn(name="cidfk"))
	@MapKeyColumn(name="pos")
	@Column(name="data")


	private Map<Integer, String> datamap=new TreeMap<Integer,String>();



	public Customer() {
		super();
	}



	public int getCusId() {
		return cusId;
	}



	public void setCusId(int cusId) {
		this.cusId = cusId;
	}



	public String getCusName() {
		return cusName;
	}



	public void setCusName(String cusName) {
		this.cusName = cusName;
	}



	public Set<String> getData() {
		return data;
	}



	public void setData(Set<String> data) {
		this.data = data;
	}



	public Map<Integer, String> getDatamap() {
		return datamap;
	}



	public void setDatamap(Map<Integer, String> datamap) {
		this.datamap = datamap;
	}



	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", data=" + data + ", datamap=" + datamap + "]";
	}



	

}
