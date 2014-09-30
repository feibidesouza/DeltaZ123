package br.com.deltaz123.negocio;


import java.util.Date;



/**
 * 
 */

/**
 * @author Vinicius
 *
 */
public class Software {
	private int codSequencial;
	private String nomeSoftware ;
	private String fabricante ;
	private String versao;
	private String nota_fiscal ;
	private Date dataNota ;
	private String chaveLicenca;
	private Date dataEspiracao;
	private String classificacao;
	
        //Construtor padrão
	public Software() {
		super();
	}
        
	public Software(int codSequencial, String nomeSoftware, String fabricante, String versao,
	String nota_fiscal, Date dataNota, String chaveLicenca,Date dataEspiracao, String classificacao) {
            super();
            this.codSequencial = codSequencial;
            this.nomeSoftware = nomeSoftware;
            this.fabricante = fabricante;
            this.versao = versao;
            this.nota_fiscal = nota_fiscal;
            this.dataNota = dataNota;
            this.chaveLicenca = chaveLicenca;
            this.dataEspiracao = dataEspiracao;
            this.classificacao = classificacao;
	}
        		
	public int getCodSequencial() {
		return codSequencial;
	}
	public void setCodSequenciale(int codSequencial) {
		this.codSequencial = codSequencial;
	}	

	public String getNomSoftware() {
		return nomeSoftware;
	}
	
	public void setNomeSoftware(String nomSoftware) {
		this.nomeSoftware = nomSoftware;

	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getNota_fiscal() {
		return nota_fiscal;
	}
	public void setNota_fiscal(String nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}
	public Date getDataNota() {
		return dataNota;
	}
	public void setDataNota(Date dataNota) {
		this.dataNota = dataNota;
	}
	public String getChaveLicenca() {
		return chaveLicenca;
	}
	public void setChaveLicenca(String chaveLicenca) {
		this.chaveLicenca = chaveLicenca;
	}
	public Date getDataEspiracao() {
		return dataEspiracao;
	}
	public void setDataEspiracao(Date dataEspiracao) {
		this.dataEspiracao = dataEspiracao;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public void backUp(){
		
	}
    public boolean verificaValidade(){  
		//falsepara fora da validade e true para dentro da validade        
		boolean valido;  
		Date data = new Date(System.currentTimeMillis()); // pega data atual
		if (data.before(this.getDataEspiracao())){  
			valido = true;  
		} else if (data.after(this.getDataEspiracao()))  
		        valido = false;  
		  else  
		    	valido = true;  	      
		  return valido;  
		}  
	
	
}
