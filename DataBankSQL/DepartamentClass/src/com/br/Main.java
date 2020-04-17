package com.br;

import com.br.entities.Department;
import com.br.entities.Seller;
import db.dao.FactoryDao;
import db.dao.SellerDao;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Department department = new Department(1, "books");
        System.out.println(department);

        Seller seller = new Seller(23, "lucas", new Date(), department);
        System.out.println(seller);

        SellerDao sellerDao = FactoryDao.createSellerDao();
    }
}
