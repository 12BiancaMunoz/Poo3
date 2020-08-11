package com.ejerciciopoo.main;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.ejerciciopoo.entidades.Persona;
import com.ejerciciopoo.entidades.Ranking;
import com.ejerciciopoo.entidades.Skill;



public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() 
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	
	

	public static void main(String[] args) {
		Persona personas= new Persona("Bianca Muñoz");
		ingresarPersona(personas);
		Persona person= new Persona("Bryan Silva ");
		ingresarPersona(person);
		
		Ranking ranking= new Ranking(4);
		ingresarRanking(ranking);
		Ranking ranking1= new Ranking(2);
		ingresarRanking(ranking1);
		
		Skill ski= new Skill("Redes de Computadoras I");
		ingresarSkill(ski);
		Skill skil= new Skill("Matematica Fiananciera ");
		ingresarSkill(skil);

		
	}
	static void ingresarPersona(Persona personas) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personas);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresarSkill(Skill skil) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(skil);
		session.getTransaction().commit();
		session.close();

	}
	
	static void ingresarRanking(Ranking ranking) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(ranking);
		session.getTransaction().commit();
		session.close();

	}

	


}
