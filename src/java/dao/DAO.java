/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DatGeko
 */
public class DAO {

    Connection conn = null;//connect với SQLServer
    PreparedStatement ps = null;// ném câu lệnh query bên SQlserver
    ResultSet rs = null;// nhận kq trả về

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select*from Product";
        try {
            conn = new DBContext().getConnection();//mo ket noi  vói sqlserver
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               
            }
        } catch (Exception e) {
        }
        return list;
    }
    public static void main(String[] args) {
        DAO dao=new DAO();
        List<Product> list=dao.getAllProduct();
         for (Product o : list) {
             System.out.print(o);
        }
    }
}
