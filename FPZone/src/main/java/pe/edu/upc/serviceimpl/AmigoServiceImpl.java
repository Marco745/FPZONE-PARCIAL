package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerface.IamigoDao;
import pe.edu.upc.entity.Amigo;
import pe.edu.upc.serviceinterface.IamigoService;

public class AmigoServiceImpl implements IamigoService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IamigoDao Id;

	public void insert(Amigo amigo) {
		try {
			Id.insert(amigo);
		} catch (Exception e) {
			System.out.println("Error al insertar amigo en el service");
		}
	}

	public List<Amigo> list() {

		return Id.list();
	}

}
