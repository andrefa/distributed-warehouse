package br.furb.diswah.storage;

import java.rmi.RemoteException;

import br.furb.diswah.model.Product;

/**
 * 
 * @author Andr� Felipe de Almeida {almeida.andref@gmail.com}
 */
public class ProductStorageImpl extends AbstractEntityStorage<Product> implements ProductStorage {

	/**
	 * @throws RemoteException
	 */
	public ProductStorageImpl() throws RemoteException {
		super();
	}

	@Override
	public Class<Product> getEntityClass() {
		return Product.class;
	}
	
}