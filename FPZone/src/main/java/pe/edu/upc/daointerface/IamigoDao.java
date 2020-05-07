package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Amigo;

public interface IamigoDao {

	public void insert(Amigo amigo);
	public List<Amigo> list();
}
