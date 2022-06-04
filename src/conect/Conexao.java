/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class Conexao {
    
    public static String base = "db_estoque";
    
    private static Connection conexao;
    public Conexao()
    { try
        {
            Class.forName("sun.jdbc.bdbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:myodbc;database="+base+";user=;password=";
            
            conexao = DriverManager.getConnection(url);
            System.out.println("conexao Ok");
        }
        catch(Exception erro) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro de conexão. Verifique a base de Dados indicada !"+"\n"+ erro.getMessage(),"Conexão", 3);
            erro.printStackTrace();
        }
    }
    
    //Mtodos pblicos:
    public Connection getConexao()
    {
        return conexao;
    }
    
    public void getConexaoFechar()
    {
        try{
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
