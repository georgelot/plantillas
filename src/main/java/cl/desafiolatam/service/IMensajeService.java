package cl.desafiolatam.service;

import java.util.List;

import cl.desafiolatam.entidad.Mensaje;

public interface IMensajeService{
	
	List<Mensaje> obtenerTodos();
	void agregarMensaje(Mensaje mensaje);
	void eliminar(int id);
}
