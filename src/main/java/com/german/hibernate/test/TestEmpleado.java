package com.german.hibernate.test;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.german.hibernate.modelo.Empleado;

public class TestEmpleado {

	// @PersistenceContext(unitName = "archivo")
	private static EntityManager manager;

	// @PersistenceUnit(unitName="archivo")
	private static EntityManagerFactory emf;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("archivo");
		manager = emf.createEntityManager();
		Empleado e1 = new Empleado(1L, "juan", "perez", new GregorianCalendar(1991, 12, 1).getTime());
		Empleado e2 = new Empleado(2L, "juan", "perez", new GregorianCalendar(1991, 12, 1).getTime());

		manager.getTransaction().begin();
		manager.persist(e1);
		manager.persist(e2);
		manager.getTransaction().commit();
		List<Empleado> lista = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		System.out.println("En la BD hay: " + lista.size() + " empleados");
		for (Empleado empleado : lista) {
			System.out.println(empleado.toString());
		}
	}

}
