/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamysql;

public class JavaMySQL {

    private static MySQLManager mySql;
    public static void main(String[] args) {
        // TODO code application logic here
        mySql = new MySQLManager();
        mySql.getConexion();
        

    }

    

}
