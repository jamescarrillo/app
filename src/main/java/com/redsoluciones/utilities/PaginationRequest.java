package com.redsoluciones.utilities;

import java.util.Map;

public class PaginationRequest {

    private Integer page;
    private Integer size;
    private Boolean all;
    private Map<String, Object> parameters;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Boolean getAll() {
		return all;
	}
	public void setAll(Boolean all) {
		this.all = all;
	}
	public Map<String, Object> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}
	

}
