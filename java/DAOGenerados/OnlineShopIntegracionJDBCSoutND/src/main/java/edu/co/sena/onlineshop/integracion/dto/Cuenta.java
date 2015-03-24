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

public class Cuenta implements Serializable
{
	/** 
	 * This attribute maps to the column PRIMER_NOMBRE in the cuenta table.
	 */
	protected String primerNombre;

	/** 
	 * This attribute maps to the column SEGUNDO_NOMBRE in the cuenta table.
	 */
	protected String segundoNombre;

	/** 
	 * This attribute maps to the column PRIMER_APELLIDO in the cuenta table.
	 */
	protected String primerApellido;

	/** 
	 * This attribute maps to the column SEGUNDO_APELLIDO in the cuenta table.
	 */
	protected String segundoApellido;

	/** 
	 * This attribute maps to the column TIPO_DOCUMENTO in the cuenta table.
	 */
	protected String tipoDocumento;

	/** 
	 * This attribute maps to the column NUMERO_DOCUMENTO in the cuenta table.
	 */
	protected String numeroDocumento;

	/** 
	 * This attribute maps to the column PASSWORD in the cuenta table.
	 */
	protected String password;

	/** 
	 * This attribute maps to the column CORREO_ELECTRONICO in the cuenta table.
	 */
	protected String correoElectronico;

	/** 
	 * This attribute maps to the column USUARIO in the cuenta table.
	 */
	protected String usuario;

	/** 
	 * This attribute maps to the column usuario_idusuario in the cuenta table.
	 */
	protected String usuarioIdusuario;

	/**
	 * Method 'Cuenta'
	 * 
	 */
	public Cuenta()
	{
	}

	/**
	 * Method 'getPrimerNombre'
	 * 
	 * @return String
	 */
	public String getPrimerNombre()
	{
		return primerNombre;
	}

	/**
	 * Method 'setPrimerNombre'
	 * 
	 * @param primerNombre
	 */
	public void setPrimerNombre(String primerNombre)
	{
		this.primerNombre = primerNombre;
	}

	/**
	 * Method 'getSegundoNombre'
	 * 
	 * @return String
	 */
	public String getSegundoNombre()
	{
		return segundoNombre;
	}

	/**
	 * Method 'setSegundoNombre'
	 * 
	 * @param segundoNombre
	 */
	public void setSegundoNombre(String segundoNombre)
	{
		this.segundoNombre = segundoNombre;
	}

	/**
	 * Method 'getPrimerApellido'
	 * 
	 * @return String
	 */
	public String getPrimerApellido()
	{
		return primerApellido;
	}

	/**
	 * Method 'setPrimerApellido'
	 * 
	 * @param primerApellido
	 */
	public void setPrimerApellido(String primerApellido)
	{
		this.primerApellido = primerApellido;
	}

	/**
	 * Method 'getSegundoApellido'
	 * 
	 * @return String
	 */
	public String getSegundoApellido()
	{
		return segundoApellido;
	}

	/**
	 * Method 'setSegundoApellido'
	 * 
	 * @param segundoApellido
	 */
	public void setSegundoApellido(String segundoApellido)
	{
		this.segundoApellido = segundoApellido;
	}

	/**
	 * Method 'getTipoDocumento'
	 * 
	 * @return String
	 */
	public String getTipoDocumento()
	{
		return tipoDocumento;
	}

	/**
	 * Method 'setTipoDocumento'
	 * 
	 * @param tipoDocumento
	 */
	public void setTipoDocumento(String tipoDocumento)
	{
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * Method 'getNumeroDocumento'
	 * 
	 * @return String
	 */
	public String getNumeroDocumento()
	{
		return numeroDocumento;
	}

	/**
	 * Method 'setNumeroDocumento'
	 * 
	 * @param numeroDocumento
	 */
	public void setNumeroDocumento(String numeroDocumento)
	{
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Method 'getCorreoElectronico'
	 * 
	 * @return String
	 */
	public String getCorreoElectronico()
	{
		return correoElectronico;
	}

	/**
	 * Method 'setCorreoElectronico'
	 * 
	 * @param correoElectronico
	 */
	public void setCorreoElectronico(String correoElectronico)
	{
		this.correoElectronico = correoElectronico;
	}

	/**
	 * Method 'getUsuario'
	 * 
	 * @return String
	 */
	public String getUsuario()
	{
		return usuario;
	}

	/**
	 * Method 'setUsuario'
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	/**
	 * Method 'getUsuarioIdusuario'
	 * 
	 * @return String
	 */
	public String getUsuarioIdusuario()
	{
		return usuarioIdusuario;
	}

	/**
	 * Method 'setUsuarioIdusuario'
	 * 
	 * @param usuarioIdusuario
	 */
	public void setUsuarioIdusuario(String usuarioIdusuario)
	{
		this.usuarioIdusuario = usuarioIdusuario;
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
		
		if (!(_other instanceof Cuenta)) {
			return false;
		}
		
		final Cuenta _cast = (Cuenta) _other;
		if (primerNombre == null ? _cast.primerNombre != primerNombre : !primerNombre.equals( _cast.primerNombre )) {
			return false;
		}
		
		if (segundoNombre == null ? _cast.segundoNombre != segundoNombre : !segundoNombre.equals( _cast.segundoNombre )) {
			return false;
		}
		
		if (primerApellido == null ? _cast.primerApellido != primerApellido : !primerApellido.equals( _cast.primerApellido )) {
			return false;
		}
		
		if (segundoApellido == null ? _cast.segundoApellido != segundoApellido : !segundoApellido.equals( _cast.segundoApellido )) {
			return false;
		}
		
		if (tipoDocumento == null ? _cast.tipoDocumento != tipoDocumento : !tipoDocumento.equals( _cast.tipoDocumento )) {
			return false;
		}
		
		if (numeroDocumento == null ? _cast.numeroDocumento != numeroDocumento : !numeroDocumento.equals( _cast.numeroDocumento )) {
			return false;
		}
		
		if (password == null ? _cast.password != password : !password.equals( _cast.password )) {
			return false;
		}
		
		if (correoElectronico == null ? _cast.correoElectronico != correoElectronico : !correoElectronico.equals( _cast.correoElectronico )) {
			return false;
		}
		
		if (usuario == null ? _cast.usuario != usuario : !usuario.equals( _cast.usuario )) {
			return false;
		}
		
		if (usuarioIdusuario == null ? _cast.usuarioIdusuario != usuarioIdusuario : !usuarioIdusuario.equals( _cast.usuarioIdusuario )) {
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
		if (primerNombre != null) {
			_hashCode = 29 * _hashCode + primerNombre.hashCode();
		}
		
		if (segundoNombre != null) {
			_hashCode = 29 * _hashCode + segundoNombre.hashCode();
		}
		
		if (primerApellido != null) {
			_hashCode = 29 * _hashCode + primerApellido.hashCode();
		}
		
		if (segundoApellido != null) {
			_hashCode = 29 * _hashCode + segundoApellido.hashCode();
		}
		
		if (tipoDocumento != null) {
			_hashCode = 29 * _hashCode + tipoDocumento.hashCode();
		}
		
		if (numeroDocumento != null) {
			_hashCode = 29 * _hashCode + numeroDocumento.hashCode();
		}
		
		if (password != null) {
			_hashCode = 29 * _hashCode + password.hashCode();
		}
		
		if (correoElectronico != null) {
			_hashCode = 29 * _hashCode + correoElectronico.hashCode();
		}
		
		if (usuario != null) {
			_hashCode = 29 * _hashCode + usuario.hashCode();
		}
		
		if (usuarioIdusuario != null) {
			_hashCode = 29 * _hashCode + usuarioIdusuario.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CuentaPk
	 */
	public CuentaPk createPk()
	{
		return new CuentaPk(numeroDocumento, tipoDocumento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.onlineshop.integracion.dto.Cuenta: " );
		ret.append( "primerNombre=" + primerNombre );
		ret.append( ", segundoNombre=" + segundoNombre );
		ret.append( ", primerApellido=" + primerApellido );
		ret.append( ", segundoApellido=" + segundoApellido );
		ret.append( ", tipoDocumento=" + tipoDocumento );
		ret.append( ", numeroDocumento=" + numeroDocumento );
		ret.append( ", password=" + password );
		ret.append( ", correoElectronico=" + correoElectronico );
		ret.append( ", usuario=" + usuario );
		ret.append( ", usuarioIdusuario=" + usuarioIdusuario );
		return ret.toString();
	}

}
