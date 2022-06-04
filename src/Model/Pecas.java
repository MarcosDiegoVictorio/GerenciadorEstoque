package Model;

import java.sql.Date;

/**
 *
 * @author marco
 */
public class Pecas {
    
    
    private int pec_id;
    private String pec_nome;
    private String pec_mar;
    private String pec_mod;
    private String pec_quant;
    private String pec_valComp;
    private String pec_valRev;
    private String pec_desc;
    private Date pec_dtCadastro;
    private int pec_status;
    

    /**
     * @return the pec_id
     */
    public int getPec_id() {
        return pec_id;
    }

    /**
     * @param pec_id the pec_id to set
     */
    public void setPec_id(int pec_id) {
        this.pec_id = pec_id;
    }

    /**
     * @return the pec_nome
     */
    public String getPec_nome() {
        return pec_nome;
    }

    /**
     * @param pec_nome the pec_nome to set
     */
    public void setPec_nome(String pec_nome) {
        this.pec_nome = pec_nome;
    }

    /**
     * @return the pec_mar
     */
    public String getPec_mar() {
        return pec_mar;
    }

    /**
     * @param pec_mar the pec_mar to set
     */
    public void setPec_mar(String pec_mar) {
        this.pec_mar = pec_mar;
    }

    /**
     * @return the pec_mod
     */
    public String getPec_mod() {
        return pec_mod;
    }

    /**
     * @param pec_mod the pec_mod to set
     */
    public void setPec_mod(String pec_mod) {
        this.pec_mod = pec_mod;
    }

    /**
     * @return the pec_quant
     */
    public String getPec_quant() {
        return pec_quant;
    }

    /**
     * @param pec_quant the pec_quant to set
     */
    public void setPec_quant(String pec_quant) {
        this.pec_quant = pec_quant;
    }

    /**
     * @return the pec_valComp
     */
    public String getPec_valComp() {
        return pec_valComp;
    }

    /**
     * @param pec_valComp the pec_valComp to set
     */
    public void setPec_valComp(String pec_valComp) {
        this.pec_valComp = pec_valComp;
    }

    /**
     * @return the pec_valRev
     */
    public String getPec_valRev() {
        return pec_valRev;
    }

    /**
     * @param pec_valRev the pec_valRev to set
     */
    public void setPec_valRev(String pec_valRev) {
        this.pec_valRev = pec_valRev;
    }

    /**
     * @return the pec_desc
     */
    public String getPec_desc() {
        return pec_desc;
    }

    /**
     * @param pec_desc the pec_desc to set
     */
    public void setPec_desc(String pec_desc) {
        this.pec_desc = pec_desc;
    }

    /**
     * @return the pec_dtCadastro
     */
    public Date getPec_dtCadastro() {
        return pec_dtCadastro;
    }

    /**
     * @param pec_dtCadastro the pec_dtCadastro to set
     */
    public void setPec_dtCadastro(Date pec_dtCadastro) {
        this.pec_dtCadastro = pec_dtCadastro;
    }

    /**
     * @return the pec_status
     */
    public int getPec_status() {
        return pec_status;
    }

    /**
     * @param pec_status the pec_status to set
     */
    public void setPec_status(int pec_status) {
        this.pec_status = pec_status;
    }

    public Pecas() {
    }

    
    
    public Pecas(int pec_id, String pec_nome, String pec_mar, String pec_mod, String pec_quant, String pec_valComp, String pec_valRev, String pec_desc, Date pec_dtCadastro, int pec_status) {
        this.pec_id = pec_id;
        this.pec_nome = pec_nome;
        this.pec_mar = pec_mar;
        this.pec_mod = pec_mod;
        this.pec_quant = pec_quant;
        this.pec_valComp = pec_valComp;
        this.pec_valRev = pec_valRev;
        this.pec_desc = pec_desc;
        this.pec_dtCadastro = pec_dtCadastro;
        this.pec_status = pec_status;
    }
    
    
    

    
    
}
