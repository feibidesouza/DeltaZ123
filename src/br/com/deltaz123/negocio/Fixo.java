/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deltaz123.negocio;

/**
 *
 * @author Vinicius
 */
public class Fixo extends Equipamento{
  public Fixo (String codEquipamento, String codPatrimonial,
			String tipo, String acesorio, String tipoUso, String tipoRede) {
		super();
		this.setCodEquipamento(codEquipamento);
		this.setCodPatrimonial(codPatrimonial);
		this.setTipo (tipo);
		this.setAcesorio(acesorio);
		this.setTipoUso(tipoUso);
		this.setTipoRede (tipoRede);
	}
	public Fixo() {
		super();
	}
}
