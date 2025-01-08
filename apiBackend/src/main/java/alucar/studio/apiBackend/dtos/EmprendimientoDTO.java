package alucar.studio.apiBackend.dtos;

import java.io.Serializable;
import java.util.List;

import alucar.studio.apiBackend.models.Emprendimiento;

public class EmprendimientoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nombre;
	private String descripcion;
	private Boolean creditoFiscal;
	private Long idEmprendedor;
    private List<CategoriaDTO> categorias;
    private List<CanalPagoDTO> canalPagos;
    
    public EmprendimientoDTO(Emprendimiento emprd) {
    	this.id = emprd.getId();
    	this.nombre = emprd.getNombre();
    	this.descripcion = emprd.getDescripcion();
    	this.creditoFiscal = emprd.getCreditoFiscal();
    	this.idEmprendedor = emprd.getIdEmprendedor();
    	this.categorias = emprd.getCategorias().stream().map(CategoriaDTO::new).toList();
    	this.canalPagos = emprd.getCanalPagos().stream().map(CanalPagoDTO::new).toList();
    			
    }
    
    public EmprendimientoDTO() {
		super();
	}

	public EmprendimientoDTO(String nombre, String descripcion, Boolean creditoFiscal, Long idEmprendedor,
			List<CategoriaDTO> categorias, List<CanalPagoDTO> canalPagos) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.creditoFiscal = creditoFiscal;
		this.idEmprendedor = idEmprendedor;
		this.categorias = categorias;
		this.canalPagos = canalPagos;
	}

	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getCreditoFiscal() {
		return creditoFiscal;
	}
	public void setCreditoFiscal(Boolean creditoFiscal) {
		this.creditoFiscal = creditoFiscal;
	}
	public Long getIdEmprendedor() {
		return idEmprendedor;
	}
	public void setIdEmprendedor(Long idEmprendedor) {
		this.idEmprendedor = idEmprendedor;
	}
	public List<CategoriaDTO> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<CategoriaDTO> categorias) {
		this.categorias = categorias;
	}
	public List<CanalPagoDTO> getCanalPagos() {
		return canalPagos;
	}
	public void setCanalPagos(List<CanalPagoDTO> canalPagos) {
		this.canalPagos = canalPagos;
	}
    
    

}
