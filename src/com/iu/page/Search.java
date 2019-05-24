package com.iu.page;

public class Search {
	
	private String search;
	private String kind;
	
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		if(search==null) {
			search ="";
		}else {
			this.search = search;			
		}
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
		if(kind==null) {
			kind="title";
		}else if(kind.equals("c")) {
			kind="contents";
		}else if(kind.equals("w")) {
			kind="writer";
		}else {
			kind="title";
		}
	}
	
	

}
