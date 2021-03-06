package com.icy.portal.pojo;

import java.util.List;

import com.icy.pojo.TbItem;

public class CatSelectResult {
	
	
	public List<Item> getList() {
		return list;
	}
	public void setList(List<Item> list) {
		this.list = list;
	}
	public long getPageCount() {
		return pageCount;
	}
	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}
	public long getCurPage() {
		return curPage;
	}
	public void setCurPage(long curPage) {
		this.curPage = curPage;
	}
	public long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(long recordCount) {
		this.recordCount = recordCount;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	private List<Item> list;
	private long pageCount;
	private long curPage;
	private long recordCount;
	private String msg;


}
