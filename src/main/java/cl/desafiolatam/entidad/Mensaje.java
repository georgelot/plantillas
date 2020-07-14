package cl.desafiolatam.entidad;

public class Mensaje {
	
	private int id;
	private String remitente;
	private String mensaje;
	
	public Mensaje(int id, String remitente, String mensaje) {
		this.id = id;
		this.remitente = remitente;
		this.mensaje = mensaje;
	}
	
	public Mensaje() {}

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRemitente() {
		return this.remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getMensaje() {
		return this.mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", remitente=" + remitente + ", mensaje=" + mensaje + "]";
	}	
}
