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
public class PesquisaDAO {
    
    Fornecedores objFor = new Fornecedores();
    Pecas objPec = new Pecas();
    
    public boolean PesquisarForn (Fornecedores objFor) throws SQLException
    {
        int cod = objFor.getFor_id();
        
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("SELECT * FROM fornecedor where for_id = ?");
        pstmt.setInt(1, cod);
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            objFor.setFor_razaoSocial(rs.getString("for_razaosoci"));
            objFor.setFor_cnpj(rs.getString("for_cnpj"));
            objFor.setFor_email(rs.getString("for_email"));
            objFor.setFor_tel(rs.getString("for_tel"));
            objFor.setFor_end(rs.getString("for_end"));
            objFor.setFor_dtCadastro(rs.getDate("for_dtcadastro"));
            objFor.setFor_status(rs.getInt("for_status"));
        }
        
        return true;
    }///End PesquisarForn
    
    public boolean PesquisarPec (Pecas objPec) throws SQLException 
    {
        int cod = objFor.getFor_id();
        
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("SELECT * FROM pecas where pec_id = ?");
        pstmt.setInt(1, cod);
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            objPec.setPec_nome(rs.getString("pec_nome"));
            objPec.setPec_mar(rs.getString("pec_mar"));
            objPec.setPec_mod(rs.getString("pec_mod"));
            objPec.setPec_quant(rs.getString("pec_quant"));
            objPec.setPec_valComp(rs.getString("pec_valcomp"));
            objPec.setPec_valRev(rs.getString("pec_valrev"));
            objPec.setPec_desc(rs.getString("pec_desc"));
            objPec.setPec_dtCadastro(rs.getDate("pec_dtcadastro"));
        }
        return true;
    }///End PesquisarPec
}
