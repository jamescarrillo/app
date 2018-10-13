package com.redsoluciones.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import com.redsoluciones.dao.CategoriaDAO;
import com.redsoluciones.model.Categoria;
import com.redsoluciones.utilities.BeanCrud;
import com.redsoluciones.utilities.PaginationResponse;

public class CategoriaDAOImpl implements CategoriaDAO{
	
	@Resource(name = "jdbc/apptienda")
	private DataSource pool;

	@Override
	public PaginationResponse getPagination(Map<String, Object> parameters, Connection conn)  {
		// TODO Auto-generated method stub
		PaginationResponse pagination = new PaginationResponse();
		//PreparedStatement pst;
		//ResultSet rs;
		//List<Categoria> list = new ArrayList<Categoria>(Integer.parseInt(String.valueOf(parameters.get("PAGE"))));
		
		return pagination;
	}
	
	@Override
	public PaginationResponse getPagination(Map<String, Object> parameters) throws SQLException {
		// TODO Auto-generated method stub
		PaginationResponse pagination = null;
		/*
		try (Connection conn = this.pool.getConnection()){
			pagination = getPagination(parameters, conn);
		} catch (SQLException e) {
			// TODO: handle exception
			throw e;
		}
		*/
		return pagination;
	}

	@Override
	public BeanCrud create(Categoria obj, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BeanCrud update(Categoria obj, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BeanCrud delete(Categoria obj, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria get(Categoria obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
