package cl.desafiolatam.service;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.entidad.Mensaje;

public class MensajeServiceImpl implements IMensajeService{
	
	private List<Mensaje> mensajes;
	
	public MensajeServiceImpl() {
		mensajes = new ArrayList<>();
	}
	
	@Override
	public List<Mensaje> obtenerTodos() {
		return mensajes;
	}

	@Override
	public void agregarMensaje(Mensaje mensaje) {
		if(mensaje != null) {
			int id = mensajes.size();
			mensaje.setId(id);
			mensajes.add(mensaje);
		}
	}

	@Override
	public void eliminar(int id) {
		mensajes.remove(id);
		for(int i = 0; i < mensajes.size(); i ++) {
			mensajes.get(i).setId(i);
		}
	}
}
