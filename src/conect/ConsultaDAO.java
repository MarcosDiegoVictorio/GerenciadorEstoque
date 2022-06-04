/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class ConsultaDAO {
    
    public static ResultSet carregaTabelaForn() throws SQLException
    {
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("SELECT * FROM fornecedores ");
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }///End method carregaTabelaForn
    
    ///Pesquisa com Argumento
    
    public static ResultSet carregaTabelaForn(String tipo, String arg) throws SQLException
    {
        String argumento = tipo+""+"like '"+arg+"%'";
        
        Conexao conexao = new Conexao();
        
        PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("SELECT * FROM fornecedores "+argumento+"");
        
        ResultSet rs = pstmt.executeQuery();
        
        return rs;
    }///end method carregaTabelaForn com arg
    
    
    
    
    
    public static ResultSet carregaTabelaPec() throws SQLException
    {
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("SELECT * FROM pecas ");
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }///End method CarregaTabelaPec
    
    ///Pesquisa com Argumento
    
    public static ResultSet carregaTabelaPec (String tipo, String arg) throws SQLException
    {
        String argumento = tipo+""+"like '"+arg+"%'";
        
        Conexao conexao = new Conexao();
        
        PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("SELECT * FROM pecas "+argumento+"");
        
        ResultSet rs = pstmt.executeQuery();
        
        return rs;
    }/// End method carregaTabelaPec com arg
    
}///End ConsultaDAO
