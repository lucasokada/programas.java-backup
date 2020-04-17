package db.dao;

import db.dao.impl.SellerDaoImpl;

public class FactoryDao { //classe expoe um metodo que retorna o tipo da interface, que internamente
                          //instancia uma implementaçao. Injeçao de dependincia sem explicitar a instanciaçao

    public static SellerDao createSellerDao() {
        return new SellerDaoImpl();
    }
}
