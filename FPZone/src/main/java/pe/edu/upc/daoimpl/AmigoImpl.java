package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IamigoDao;
import pe.edu.upc.entity.Amigo;

public class AmigoImpl implements IamigoDao, Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "FPZone")
	private EntityManager em;

	@Transactional
	public void insert(Amigo amigo) {
		try {
			em.persist(amigo);
			
		} catch (Exception e) {
			System.out.println("Error al insertar DAOImpl");
		}

	}

	@SuppressWarnings("unchecked")
	public List<Amigo> list() {
		
		List<Amigo> lista = new ArrayList<Amigo>();
		try {
			javax.persistence.Query q = em.createQuery("select i from Amigo i");
			lista = (List<Amigo>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar DAOImpl");
		}
		return lista;
	}

}
