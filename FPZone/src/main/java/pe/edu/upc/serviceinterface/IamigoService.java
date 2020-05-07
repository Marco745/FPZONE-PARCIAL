package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Amigo;

public interface IamigoService {
	public void insert(Amigo amigo);

	public List<Amigo> list();
}
