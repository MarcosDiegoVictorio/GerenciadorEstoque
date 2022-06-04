/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conect;

import Model.Fornecedores;
import Model.Pecas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class IncluirEditarDAO {
    
    Fornecedores objFor = new Fornecedores();
    Pecas objPec = new Pecas();
    
    public int IncluirFor(Fornecedores objFor) throws SQLException
    {
        Conexao conexao = new Conexao();
        int registro;
        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("INSERT INTO fornecedores (for_razaosoci,for_cnpj,for_email,for_tel,for_end,for_dtcadastro,for_status"
                + "VALUES(?,?,?,?,?,sysdate,?)")){
            pstmt.setString(1,objFor.getFor_razaoSocial().toUpperCase().trim());
            pstmt.setString(2,objFor.getFor_cnpj().trim());
            pstmt.setString(3,objFor.getFor_email().trim());
            pstmt.setString(4,objFor.getFor_tel().trim());
            pstmt.setString(5,objFor.getFor_end().trim());
            pstmt.setTimestamp(6,new java.sql.Timestamp(objFor.getFor_dtCadastro().getTime()));
            pstmt.setInt(7,objFor.getFor_status());
            
            registro = pstmt.executeUpdate();
        }
        
        PreparedStatement pstmAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmAux.executeQuery();
        int codigo = 0;
        
        if((registro == 1) && (rs != null)){
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        }else {
            return codigo;
        }
    } ///end IncluirFor
    
    public boolean EditarFor(Fornecedores objFor) throws SQLException
    {
        Conexao conexao = new Conexao();
        int registro;
        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("update fornecedores set for_razaosocial=?, for_cnpj=?, for_email=?, for_tel=?, for_end=?, for_dtcadastro=?, for_status=? where for_id = ?")){
            
      
            
        pstmt.setString(1,objFor.getFor_razaoSocial().toUpperCase().trim());
        pstmt.setString(2,objFor.getFor_cnpj().trim());
        pstmt.setString(3,objFor.getFor_email().trim());
        pstmt.setString(4,objFor.getFor_tel().trim());
        pstmt.setString(5,objFor.getFor_end().trim());
        pstmt.setTimestamp(6,new java.sql.Timestamp(objFor.getFor_dtCadastro().getTime()));
        pstmt.setInt(7,objFor.getFor_status());
        pstmt.setInt(8, objFor.getFor_id());
        
        registro = pstmt.executeUpdate();
        }
        if (registro == 1) {
            return true; 
        }else {
            return false;
        }
    }///end EditarFor
    
    
    public int IncluirPec (Pecas objPec) throws SQLException
    {
        Conexao conexao = new Conexao();
        int registro;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("INSERT INTO pecas (pec_nome,pec_mar,pec_mod,pec_quant,pec_valcomp,pec_valrev,pec_desc,pec_dtcadastro"
                + "VALUES(?,?,?,?,?,?,?,?)")) {
            pstmt.setString(1,objPec.getPec_nome().toUpperCase().trim());
            pstmt.setString(2,objPec.getPec_mar().trim());
            pstmt.setString(3,objPec.getPec_mod().trim());
            pstmt.setString(4,objPec.getPec_quant().trim());
            pstmt.setString(5,objPec.getPec_valComp().trim());
            pstmt.setString(6,objPec.getPec_valRev().trim());
            pstmt.setString(7,objPec.getPec_desc().trim());
            pstmt.setTimestamp(8, new java.sql.Timestamp(objPec.getPec_dtCadastro().getTime()));
            
            registro = pstmt.executeUpdate();
        }
        
        PreparedStatement pstmAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmAux.executeQuery();
        int codigo = 0;
        
        if((registro == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }
    }///End IncluirPec
    
    public boolean EditarPec(Fornecedores objFor) throws SQLException
    {
        Conexao conexao = new Conexao();
        int registro;
        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("update fornecedores set pec_nome=?, pec_mar=?, pec_mod=?, pec_quant=?, pec_valcomp=?, pec_valrev=?, pec_desc=?, pec_dtcadastro=? where pec_id = ?")){
            
      
            
        pstmt.setString(1,objPec.getPec_nome().toUpperCase().trim());
        pstmt.setString(2,objPec.getPec_mar().trim());
        pstmt.setString(3,objPec.getPec_mod().trim());
        pstmt.setString(4,objPec.getPec_quant().trim());
        pstmt.setString(5,objPec.getPec_valComp().trim());
        pstmt.setString(6,objPec.getPec_valRev().trim());
        pstmt.setString(7,objPec.getPec_desc().trim());
        pstmt.setTimestamp(8,new java.sql.Timestamp(objPec.getPec_dtCadastro().getTime()));
        pstmt.setInt(9, objFor.getFor_id());
        
        registro = pstmt.executeUpdate();
        }
        if (registro == 1) {
            return true; 
        }else {
            return false;}
    }    
    
}///end class incluirEditar
