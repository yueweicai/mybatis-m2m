package com.entitys;

import java.util.List;

public class Product {
	private Integer id;
	private String name;
	private String kind;
	private String factory;
	private String trem;
	private Float price;
	private String info;
	private List<Size> sizes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getTrem() {
		return trem;
	}
	public void setTrem(String trem) {
		this.trem = trem;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public List<Size> getSizes() {
		return sizes;
	}
	public void setSize(List<Size> sizes) {
		this.sizes = sizes;
	}
}
