package br.furb.diswah.transport;

import br.furb.diswah.exception.CommunicationException;

/**
 * 
 * @author Andr� Felipe de Almeida {almeida.andref@gmail.com}
 */
public class RPCTransport extends BasicTransport {

	protected RPCTransport(TransportProperties properties){
		super(properties);
	}
	
	@Override
	public <T> T requestInterface(Class<T> target, Object[] params) throws CommunicationException {
		// TODO Auto-generated method stub
		return null;
	}

}