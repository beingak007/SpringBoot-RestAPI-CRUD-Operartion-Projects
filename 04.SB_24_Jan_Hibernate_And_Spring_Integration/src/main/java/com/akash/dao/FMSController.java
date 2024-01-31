package com.akash.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.model.Fms;

@RestController
public class FMSController {

	@Autowired
	SessionFactory sf;

	@PostMapping("insertSingleRecordsBody")
	public String SingleRecordsBody(@RequestBody Fms fm) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(fm);
		transaction.commit();

		return "ShowSingleRecords" + fm;

	}

	@GetMapping("showSingleRecord/{id}")
	public Fms SingleRecAPI(@PathVariable int id) {
		Session session = sf.openSession();

		Fms fm = session.get(Fms.class, id);
		return fm;
	}

	@GetMapping("showMultipleRecords")
	public List<Fms> ShowAllData() {
		Session session = sf.openSession();
//		Query query = session.createQuery("from food management system");
		Query query = session.createQuery("from FMS");
		List<Fms> list = query.list();

		return list;
	}

	@PostMapping("insertSingleRecordBody")
	public String insertSingle(@RequestBody Fms fms) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		session.save(fms);
		t.commit();
		return "Insert Single Records :" + fms;
	}

	@PostMapping("insertSingleRecordPath/{id}/{name}")
	public String insertAPI(@PathVariable int id, @PathVariable String name) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Fms fms = new Fms(id, name);
		session.save(fms);
		t.commit();
		session.close();
		return "Insert Single Records " + fms;
	}



	@PostMapping("insertMultipleRecords")
	public String multipleInsert(@RequestBody List<Fms> list) {
		for (Fms fms : list) {
			Session session = sf.openSession();
			Transaction tt = session.beginTransaction();
			session.save(fms);
			tt.commit();
			session.close();
		}
		return "InsertedMultipleReBody : " + list;

	}

	@PutMapping("updateSingleRecord")
	public String updateSingle(@RequestBody Fms FMS) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(FMS);
		tx.commit();
		return "Update Single Records" + FMS;
	}

	@PutMapping("updateMultipleRecord")
	public String multipleUpdate(@RequestBody List<Fms> list) {

		for (Fms FMS : list) {
			Session ss = sf.openSession();
			Transaction transaction = ss.beginTransaction();
			ss.update(FMS);
			transaction.commit();
		}
		return "Update Multiple Records" + list;
	}

	@DeleteMapping("deleteSingleRecord/{id}")
	public String deleteSignleAPI(@PathVariable int id) {

		Session ss = sf.openSession();
		Transaction transaction = ss.beginTransaction();
		Fms stud = ss.load(Fms.class, id);
		ss.delete(stud);
		transaction.commit();

		return "Deleted Single Records Where ID : " + id;
	}

	@DeleteMapping("deleteMultipleRecord")
	public String deleteAll() {

		Session s = sf.openSession();
		Transaction transaction = s.beginTransaction();
		Query query = s.createQuery("DELETE FROM FMS");
		query.executeUpdate();
		transaction.commit();

		return "Deletes All Table Record's";
	}

	@PatchMapping("partialSingleFieldUpdate/{id}/{name}")
	public String partialSingleFieldUpdate(@PathVariable int id, @PathVariable String name) {

		Session session = sf.openSession();
		Fms FMS = session.get(Fms.class, id);
		FMS.setName(name);
		Transaction transaction = session.beginTransaction();
		session.update(FMS);
		transaction.commit();

		return "PartialUpadte Single Records" + FMS;
	}

	@PatchMapping("partialMultipleFieldUpdate/{id}/{name}")
	public String partialMultipleFieldUpdate(@PathVariable int id, @PathVariable String name) {
		Session session = sf.openSession();
		Fms fms = session.get(Fms.class, id);
		fms.setName(name);
		Transaction transaction = session.beginTransaction();
		session.update(fms);
		transaction.commit();

		return "Partila Multiple Records" + fms;
	}
	

}
