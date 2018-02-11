/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBBaglantilari;

import Modeller.CSPostgreSQL;

/**
 *
 * @author rbarka
 */
public class staticValues {
    //Bu Hangi veritabanına bağlanacağımızı belirler
    //0-> PostgreSQL
    //1-> Oracle
    //2-> MySQL
    //3-> MsSQL
    public static int isDB = 0;

   
    
    private static CSPostgreSQL pgSQL = new CSPostgreSQL();
   
    public static CSPostgreSQL getPgSQL() {
        pgSQL.setDriverName("org.postgresql.Driver");
        pgSQL.setIpAdress("127.0.0.1");
        pgSQL.setPort("5432");
        pgSQL.setDateBase("HastaneOtomasyonu");
        pgSQL.setUserName("postgres");
        pgSQL.setPassword("root");        
        return pgSQL;
    }
}
