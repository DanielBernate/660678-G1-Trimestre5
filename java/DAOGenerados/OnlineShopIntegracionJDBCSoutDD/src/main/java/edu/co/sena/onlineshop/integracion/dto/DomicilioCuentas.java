/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.dto;

import edu.co.sena.onlineshop.integracion.dao.*;
import edu.co.sena.onlineshop.integracion.factory.*;
import edu.co.sena.onlineshop.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class DomicilioCuentas implements Serializable
{
	/** 
	 * This attribute maps to the column direccion in the domicilio_cuentas table.
	 */
	protected String direccion;

	/** 
	 * This attribute represents whether the attribute direccion has been modified since being read from the database.
	 */
	protected boolean direccionModified = false;

	/** 
	 * This attribute maps to the column telefono in the domicilio_cuentas table.
	 */
	protected String telefono;

	/** 
	 * This attribute represents whether the attribute telefono has been modified since being read from the database.
	 */
	protected boolean telefonoModified = false;

	/** 
	 * This attribute maps to the column barrio in the domicilio_cuentas table.
	 */
	protected String barrio;

	/** 
	 * This attribute represents whether the attribute barrio has been modified since being read from the database.
	 */
	protected boolean barrioModified = false;

	/** 
	 * This attribute maps to the column localidad in the domicilio_cuentas table.
	 */
	protected String localidad;

	/** 
	 * This attribute represents whether the attribute localidad has been modified since being read from the database.
	 */
	protected boolean localidadModified = false;

	/** 
	 * This attribute maps to the column CORREO_POSTAL in the domicilio_cuentas table.
	 */
	protected String correoPostal;

	/** 
	 * This attribute represents whether the attribute correoPostal has been modified since being read from the database.
	 */
	protected boolean correoPostalModified = false;

	/** 
	 * This attribute maps to the column MUNICIPIO_idMUNICIPIO in the domicilio_cuentas table.
	 */
	protected int municipioIdmunicipio;

	/** 
	 * This attribute represents whether the attribute municipioIdmunicipio has been modified since being read from the database.
	 */
	protected boolean municipioIdmunicipioModified = false;

	/** 
	 * This attribute maps to the column CUENTA_NUMERO_DOCUMENTO in the domicilio_cuentas table.
	 */
	protected String cuentaNumeroDocumento;

	/** 
	 * This attribute represents whether the attribute cuentaNumeroDocumento has been modified since being read from the database.
	 */
	protected boolean cuentaNumeroDocumentoModified = false;

	/** 
	 * This attribute maps to the column CUENTA_TIPO_DOCUMENTO in the domicilio_cuentas table.
	 */
	protected String cuentaTipoDocumento;

	/** 
	 * This attribute represents whether the attribute cuentaTipoDocumento has been modified since being read from the database.
	 */
	protected boolean cuentaTipoDocumentoModified = false;

	/**
	 * Method 'DomicilioCuentas'
	 * 
	 */
	public DomicilioCuentas()
	{
	}

	/**
	 * Method 'getDireccion'
	 * 
	 * @return String
	 */
	public String getDireccion()
	{
		return direccion;
	}

	/**
	 * Method 'setDireccion'
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
		this.direccionModified = true;
	}

	/** 
	 * Sets the value of direccionModified
	 */
	public void setDireccionModified(boolean direccionModified)
	{
		this.direccionModified = direccionModified;
	}

	/** 
	 * Gets the value of direccionModified
	 */
	public boolean isDireccionModified()
	{
		return direccionModified;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return String
	 */
	public String getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
		this.telefonoModified = true;
	}

	/** 
	 * Sets the value of telefonoModified
	 */
	public void setTelefonoModified(boolean telefonoModified)
	{
		this.telefonoModified = telefonoModified;
	}

	/** 
	 * Gets the value of telefonoModified
	 */
	public boolean isTelefonoModified()
	{
		return telefonoModified;
	}

	/**
	 * Method 'getBarrio'
	 * 
	 * @return String
	 */
	public String getBarrio()
	{
		return barrio;
	}

	/**
	 * Method 'setBarrio'
	 * 
	 * @param barrio
	 */
	public void setBarrio(String barrio)
	{
		this.barrio = barrio;
		this.barrioModified = true;
	}

	/** 
	 * Sets the value of barrioModified
	 */
	public void setBarrioModified(boolean barrioModified)
	{
		this.barrioModified = barrioModified;
	}

	/** 
	 * Gets the value of barrioModified
	 */
	public boolean isBarrioModified()
	{
		return barrioModified;
	}

	/**
	 * Method 'getLocalidad'
	 * 
	 * @return String
	 */
	public String getLocalidad()
	{
		return localidad;
	}

	/**
	 * Method 'setLocalidad'
	 * 
	 * @param localidad
	 */
	public void setLocalidad(String localidad)
	{
		this.localidad = localidad;
		this.localidadModified = true;
	}

	/** 
	 * Sets the value of localidadModified
	 */
	public void setLocalidadModified(boolean localidadModified)
	{
		this.localidadModified = localidadModified;
	}

	/** 
	 * Gets the value of localidadModified
	 */
	public boolean isLocalidadModified()
	{
		return localidadModified;
	}

	/**
	 * Method 'getCorreoPostal'
	 * 
	 * @return String
	 */
	public String getCorreoPostal()
	{
		return correoPostal;
	}

	/**
	 * Method 'setCorreoPostal'
	 * 
	 * @param correoPostal
	 */
	public void setCorreoPostal(String correoPostal)
	{
		this.correoPostal = correoPostal;
		this.correoPostalModified = true;
	}

	/** 
	 * Sets the value of correoPostalModified
	 */
	public void setCorreoPostalModified(boolean correoPostalModified)
	{
		this.correoPostalModified = correoPostalModified;
	}

	/** 
	 * Gets the value of correoPostalModified
	 */
	public boolean isCorreoPostalModified()
	{
		return correoPostalModified;
	}

	/**
	 * Method 'getMunicipioIdmunicipio'
	 * 
	 * @return int
	 */
	public int getMunicipioIdmunicipio()
	{
		return municipioIdmunicipio;
	}

	/**
	 * Method 'setMunicipioIdmunicipio'
	 * 
	 * @param municipioIdmunicipio
	 */
	public void setMunicipioIdmunicipio(int municipioIdmunicipio)
	{
		this.municipioIdmunicipio = municipioIdmunicipio;
		this.municipioIdmunicipioModified = true;
	}

	/** 
	 * Sets the value of municipioIdmunicipioModified
	 */
	public void setMunicipioIdmunicipioModified(boolean municipioIdmunicipioModified)
	{
		this.municipioIdmunicipioModified = municipioIdmunicipioModified;
	}

	/** 
	 * Gets the value of municipioIdmunicipioModified
	 */
	public boolean isMunicipioIdmunicipioModified()
	{
		return municipioIdmunicipioModified;
	}

	/**
	 * Method 'getCuentaNumeroDocumento'
	 * 
	 * @return String
	 */
	public String getCuentaNumeroDocumento()
	{
		return cuentaNumeroDocumento;
	}

	/**
	 * Method 'setCuentaNumeroDocumento'
	 * 
	 * @param cuentaNumeroDocumento
	 */
	public void setCuentaNumeroDocumento(String cuentaNumeroDocumento)
	{
		this.cuentaNumeroDocumento = cuentaNumeroDocumento;
		this.cuentaNumeroDocumentoModified = true;
	}

	/** 
	 * Sets the value of cuentaNumeroDocumentoModified
	 */
	public void setCuentaNumeroDocumentoModified(boolean cuentaNumeroDocumentoModified)
	{
		this.cuentaNumeroDocumentoModified = cuentaNumeroDocumentoModified;
	}

	/** 
	 * Gets the value of cuentaNumeroDocumentoModified
	 */
	public boolean isCuentaNumeroDocumentoModified()
	{
		return cuentaNumeroDocumentoModified;
	}

	/**
	 * Method 'getCuentaTipoDocumento'
	 * 
	 * @return String
	 */
	public String getCuentaTipoDocumento()
	{
		return cuentaTipoDocumento;
	}

	/**
	 * Method 'setCuentaTipoDocumento'
	 * 
	 * @param cuentaTipoDocumento
	 */
	public void setCuentaTipoDocumento(String cuentaTipoDocumento)
	{
		this.cuentaTipoDocumento = cuentaTipoDocumento;
		this.cuentaTipoDocumentoModified = true;
	}

	/** 
	 * Sets the value of cuentaTipoDocumentoModified
	 */
	public void setCuentaTipoDocumentoModified(boolean cuentaTipoDocumentoModified)
	{
		this.cuentaTipoDocumentoModified = cuentaTipoDocumentoModified;
	}

	/** 
	 * Gets the value of cuentaTipoDocumentoModified
	 */
	public boolean isCuentaTipoDocumentoModified()
	{
		return cuentaTipoDocumentoModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof DomicilioCuentas)) {
			return false;
		}
		
		final DomicilioCuentas _cast = (DomicilioCuentas) _other;
		if (direccion == null ? _cast.direccion != direccion : !direccion.equals( _cast.direccion )) {
			return false;
		}
		
		if (direccionModified != _cast.direccionModified) {
			return false;
		}
		
		if (telefono == null ? _cast.telefono != telefono : !telefono.equals( _cast.telefono )) {
			return false;
		}
		
		if (telefonoModified != _cast.telefonoModified) {
			return false;
		}
		
		if (barrio == null ? _cast.barrio != barrio : !barrio.equals( _cast.barrio )) {
			return false;
		}
		
		if (barrioModified != _cast.barrioModified) {
			return false;
		}
		
		if (localidad == null ? _cast.localidad != localidad : !localidad.equals( _cast.localidad )) {
			return false;
		}
		
		if (localidadModified != _cast.localidadModified) {
			return false;
		}
		
		if (correoPostal == null ? _cast.correoPostal != correoPostal : !correoPostal.equals( _cast.correoPostal )) {
			return false;
		}
		
		if (correoPostalModified != _cast.correoPostalModified) {
			return false;
		}
		
		if (municipioIdmunicipio != _cast.municipioIdmunicipio) {
			return false;
		}
		
		if (municipioIdmunicipioModified != _cast.municipioIdmunicipioModified) {
			return false;
		}
		
		if (cuentaNumeroDocumento == null ? _cast.cuentaNumeroDocumento != cuentaNumeroDocumento : !cuentaNumeroDocumento.equals( _cast.cuentaNumeroDocumento )) {
			return false;
		}
		
		if (cuentaNumeroDocumentoModified != _cast.cuentaNumeroDocumentoModified) {
			return false;
		}
		
		if (cuentaTipoDocumento == null ? _cast.cuentaTipoDocumento != cuentaTipoDocumento : !cuentaTipoDocumento.equals( _cast.cuentaTipoDocumento )) {
			return false;
		}
		
		if (cuentaTipoDocumentoModified != _cast.cuentaTipoDocumentoModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (direccion != null) {
			_hashCode = 29 * _hashCode + direccion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (direccionModified ? 1 : 0);
		if (telefono != null) {
			_hashCode = 29 * _hashCode + telefono.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (telefonoModified ? 1 : 0);
		if (barrio != null) {
			_hashCode = 29 * _hashCode + barrio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (barrioModified ? 1 : 0);
		if (localidad != null) {
			_hashCode = 29 * _hashCode + localidad.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (localidadModified ? 1 : 0);
		if (correoPostal != null) {
			_hashCode = 29 * _hashCode + correoPostal.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (correoPostalModified ? 1 : 0);
		_hashCode = 29 * _hashCode + municipioIdmunicipio;
		_hashCode = 29 * _hashCode + (municipioIdmunicipioModified ? 1 : 0);
		if (cuentaNumeroDocumento != null) {
			_hashCode = 29 * _hashCode + cuentaNumeroDocumento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (cuentaNumeroDocumentoModified ? 1 : 0);
		if (cuentaTipoDocumento != null) {
			_hashCode = 29 * _hashCode + cuentaTipoDocumento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (cuentaTipoDocumentoModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DomicilioCuentasPk
	 */
	public DomicilioCuentasPk createPk()
	{
		return new DomicilioCuentasPk(cuentaNumeroDocumento, cuentaTipoDocumento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.onlineshop.integracion.dto.DomicilioCuentas: " );
		ret.append( "direccion=" + direccion );
		ret.append( ", telefono=" + telefono );
		ret.append( ", barrio=" + barrio );
		ret.append( ", localidad=" + localidad );
		ret.append( ", correoPostal=" + correoPostal );
		ret.append( ", municipioIdmunicipio=" + municipioIdmunicipio );
		ret.append( ", cuentaNumeroDocumento=" + cuentaNumeroDocumento );
		ret.append( ", cuentaTipoDocumento=" + cuentaTipoDocumento );
		return ret.toString();
	}

}
