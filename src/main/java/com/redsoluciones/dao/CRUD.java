package com.redsoluciones.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import com.redsoluciones.utilities.BeanCrud;
import com.redsoluciones.utilities.PaginationResponse;

public interface CRUD<T> {

	PaginationResponse getPagination(Map<String, Object> parameters, Connection conn) throws SQLException;
	
	PaginationResponse getPagination(Map<String, Object> parameters) throws SQLException;

	BeanCrud create(T obj, Map<String, Object> parameters) throws SQLException;

	BeanCrud update(T obj, Map<String, Object> parameters) throws SQLException;

	BeanCrud delete(T obj, Map<String, Object> parameters) throws SQLException;

	T get(T obj);

}
