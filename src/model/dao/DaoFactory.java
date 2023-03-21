package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createsSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
