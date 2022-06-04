/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conect;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class ExcluirDAO {
    
    public boolean ExcluirFor(int cod) throws SQLException {
        Conexao conexao = new Conexao();
        
        int registro;
        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("delete from fornecedores where for_id = ?")) {
            pstmt.setInt(1, cod);
            registro = pstmt.executeUpdate();
        }
        if (registro == 1){
            return true; 
        }else {
            return false;
        }
    }///end ExcluirFor
    
   public boolean ExcluirPec(int cod) throws SQLException {
       Conexao conexao = new Conexao();
       
       int registro;
       try (PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("Delete from pecas where pec_id = ?")) {
           pstmt.setInt(1, cod);
           registro = pstmt.executeUpdate();
       }
       if (registro == 1){
           return true;
       }else {
           return false;
       }
   }///End EcluirPec
    
}
