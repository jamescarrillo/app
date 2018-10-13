package com.redsoluciones.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redsoluciones.model.Categoria;

@Path("/categorias")
public class CategoriaAPI {

	@GET
	@Path("listar")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String getPagintion() {
		String json = "";
		Categoria categoria1 = new Categoria();
		categoria1.setIdcategoria(1);
		categoria1.setNombre("ROPA");
		Categoria categoria2 = new Categoria();
		categoria2.setIdcategoria(2);
		categoria2.setNombre("ZAPATOS");
		Categoria categoria3 = new Categoria();
		categoria3.setIdcategoria(3);
		categoria3.setNombre("PERFUMES");
		Categoria categoria4 = new Categoria();
		categoria4.setIdcategoria(4);
		categoria4.setNombre("BEBIDAS");
		List<Categoria> list = new ArrayList<Categoria>(10);
		list.add(categoria1);
		list.add(categoria2);
		list.add(categoria3);
		list.add(categoria4);
		Map<String, Object> jsonROOT = new HashMap<String, Object>();
        jsonROOT.put("DATA", list);
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(jsonROOT);
        } catch (JsonProcessingException ex) {
            try {
				throw ex;
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		return json;
	}
}
