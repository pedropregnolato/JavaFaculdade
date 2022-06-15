/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servico.reservas;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author pedro
 */
@WebService(
 name = "ReservasAereas",
 serviceName = "ReservasAereasService")

public class ReservasAereas {
 
 private static final String banco = "jdbc:derby://localhost:1527/reservar";
 private static final String usuario = "storion";
 private static final String senha = "storion";
 private Connection conexao;
 private PreparedStatement localizar;
 private PreparedStatement reservarpoltrona;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "reservarassento")
 public boolean reservarassento(@WebParam(name = "localizacao") String localizacao, 
@WebParam(name = "classe") String classe) {
 try {
 conexao = DriverManager.getConnection(banco,usuario,senha);
 localizar = conexao.prepareStatement("select numero from assento where verificador = 0 and localizacao = ? and classe = ?");
 
 localizar.setString(1, localizacao);
 localizar.setString(2, classe);
 ResultSet resultado = localizar.executeQuery();
 
 if (resultado.next())
 {
 int poltrona = resultado.getInt(1);
 reservarpoltrona = conexao.prepareStatement("update assento set verificador = 1 where numero=? ");
 reservarpoltrona.setInt(1, poltrona);
 reservarpoltrona.executeUpdate();
 return true;
 }
 return false;
 }
 catch(SQLException e)
{
 e.printStackTrace();
 return false;
 }
 }
}

