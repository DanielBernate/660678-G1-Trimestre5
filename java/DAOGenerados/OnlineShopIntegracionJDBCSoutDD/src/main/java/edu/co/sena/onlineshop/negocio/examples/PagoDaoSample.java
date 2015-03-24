/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.negocio.examples;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.onlineshop.integracion.dao.PagoDao;
import edu.co.sena.onlineshop.integracion.dto.Pago;
import edu.co.sena.onlineshop.integracion.exceptions.PagoDaoException;
import edu.co.sena.onlineshop.integracion.factory.PagoDaoFactory;

public class PagoDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByFactura(0);
		// findWhereFacturaIdFacturaEquals(0);
		// findWhereTipoPagoEquals("");
		// findWhereNumeCuentaEquals("");
		// findWhereNumeroTargetaEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			PagoDao _dao = getPagoDao();
			Pago _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByFactura'
	 * 
	 * @param facturaIdFactura
	 */
	public static void findByFactura(int facturaIdFactura)
	{
		try {
			PagoDao _dao = getPagoDao();
			Pago _result[] = _dao.findByFactura(facturaIdFactura);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFacturaIdFacturaEquals'
	 * 
	 * @param facturaIdFactura
	 */
	public static void findWhereFacturaIdFacturaEquals(int facturaIdFactura)
	{
		try {
			PagoDao _dao = getPagoDao();
			Pago _result[] = _dao.findWhereFacturaIdFacturaEquals(facturaIdFactura);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTipoPagoEquals'
	 * 
	 * @param tipoPago
	 */
	public static void findWhereTipoPagoEquals(String tipoPago)
	{
		try {
			PagoDao _dao = getPagoDao();
			Pago _result[] = _dao.findWhereTipoPagoEquals(tipoPago);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNumeCuentaEquals'
	 * 
	 * @param numeCuenta
	 */
	public static void findWhereNumeCuentaEquals(String numeCuenta)
	{
		try {
			PagoDao _dao = getPagoDao();
			Pago _result[] = _dao.findWhereNumeCuentaEquals(numeCuenta);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNumeroTargetaEquals'
	 * 
	 * @param numeroTargeta
	 */
	public static void findWhereNumeroTargetaEquals(int numeroTargeta)
	{
		try {
			PagoDao _dao = getPagoDao();
			Pago _result[] = _dao.findWhereNumeroTargetaEquals(numeroTargeta);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getPagoDao'
	 * 
	 * @return PagoDao
	 */
	public static PagoDao getPagoDao()
	{
		return PagoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Pago dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getFacturaIdFactura() );
		buf.append( ", " );
		buf.append( dto.getTipoPago() );
		buf.append( ", " );
		buf.append( dto.getNumeCuenta() );
		buf.append( ", " );
		buf.append( dto.getNumeroTargeta() );
		System.out.println( buf.toString() );
	}

}
