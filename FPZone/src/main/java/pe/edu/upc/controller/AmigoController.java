package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Amigo;

import pe.edu.upc.serviceinterface.IamigoService;

@Named
@RequestScoped
public class AmigoController implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Inject
	private IamigoService iService;
	
	private Amigo i;
	
	List<Amigo> listaAmigo;
	
	public void init() {
		this.i= new Amigo();
		this.listaAmigo = new ArrayList<Amigo>();
		this.list();
	}

	public String newInfectious() {
		this.setI(new Amigo());
		return "infectiousAgent.xhtml";
	}

	public void insert() {
		iService.insert(i);
		this.cleanAmigo();
		this.list();
	}

	public void list() {
		listaAmigo = iService.list();
	}

	public void cleanAmigo() {
		this.init();
	}
	
	public Amigo getI() {
		return i;
	}

	public void setI(Amigo i) {
		this.i = i;
	}

	public List<Amigo> getListaAmigo() {
		return listaAmigo;
	}

	public void setListaAmigo(List<Amigo> listaAmigo) {
		this.listaAmigo = listaAmigo;
	}
	
	
	
}
