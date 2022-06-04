package Model;

import java.sql.Date;

/**
 *
 * @author marco
 */
public class Fornecedores {

    private int for_id;
    private String for_razaoSocial;
    private String for_cnpj;
    private String for_email;
    private String for_tel;
    private String for_end;
    private Date for_dtCadastro;
    private int for_status;
    
    /**
     * @return the for_id
     */
    public int getFor_id() {
        return for_id;
    }

    /**
     * @param for_id the for_id to set
     */
    public void setFor_id(int for_id) {
        this.for_id = for_id;
    }

    /**
     * @return the for_razaoSocial
     */
    public String getFor_razaoSocial() {
        return for_razaoSocial;
    }

    /**
     * @param for_razaoSocial the for_razaoSocial to set
     */
    public void setFor_razaoSocial(String for_razaoSocial) {
        this.for_razaoSocial = for_razaoSocial;
    }

    /**
     * @return the for_cnpj
     */
    public String getFor_cnpj() {
        return for_cnpj;
    }

    /**
     * @param for_cnpj the for_cnpj to set
     */
    public void setFor_cnpj(String for_cnpj) {
        this.for_cnpj = for_cnpj;
    }

    /**
     * @return the for_email
     */
    public String getFor_email() {
        return for_email;
    }

    /**
     * @param for_email the for_email to set
     */
    public void setFor_email(String for_email) {
        this.for_email = for_email;
    }

    /**
     * @return the for_tel
     */
    public String getFor_tel() {
        return for_tel;
    }

    /**
     * @param for_tel the for_tel to set
     */
    public void setFor_tel(String for_tel) {
        this.for_tel = for_tel;
    }

    /**
     * @return the for_end
     */
    public String getFor_end() {
        return for_end;
    }

    /**
     * @param for_end the for_end to set
     */
    public void setFor_end(String for_end) {
        this.for_end = for_end;
    }

    /**
     * @return the for_dtCadastro
     */
    public Date getFor_dtCadastro() {
        return for_dtCadastro;
    }

    /**
     * @param for_dtCadastro the for_dtCadastro to set
     */
    public void setFor_dtCadastro(Date for_dtCadastro) {
        this.for_dtCadastro = for_dtCadastro;
    }

    /**
     * @return the for_status
     */
    public int getFor_status() {
        return for_status;
    }

    /**
     * @param for_status the for_status to set
     */
    public void setFor_status(int for_status) {
        this.for_status = for_status;
    }

    public Fornecedores() {
    }

    
    
    public Fornecedores(int for_id, String for_razaoSocial, String for_cnpj, String for_email, String for_tel, String for_end, Date for_dtCadastro, int for_status) {
        this.for_id = for_id;
        this.for_razaoSocial = for_razaoSocial;
        this.for_cnpj = for_cnpj;
        this.for_email = for_email;
        this.for_tel = for_tel;
        this.for_end = for_end;
        this.for_dtCadastro = for_dtCadastro;
        this.for_status = for_status;
    }

    
    

    
}
