package com.example.connaction1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetData {
    Connection connect;
    String ConnectionResult = "";
    Boolean isSucces=false;

    public List<Map<String,String>> getdata(){
        List<Map<String,String>> data = null;
        data = new ArrayList<Map<String,String>>();
        try {
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.connections();
            if (connect==null){
                ConnectionResult="Check Your Internet Access!";
            }
            else{
                String query = "select * from TBLManager";
                Statement stat = connect.createStatement();
                ResultSet rs = stat.executeQuery(query);
                while (rs.next()){
                    Map<String,String> datanum = new HashMap<String,String>();
                    datanum.put("ID",rs.getString("MID"));
                    datanum.put("Name",rs.getString("MName"));
                    datanum.put("Email",rs.getString("MEmail"));
                    datanum.put("Password",rs.getString("MPassword"));
                    datanum.put("Discription",rs.getString("MDiscription"));
                    datanum.put("Birthday",rs.getString("MBirthday"));
                    datanum.put("CheckEmail",rs.getString("MCheckEmail"));
                    datanum.put("Level",rs.getString("MLevel"));
                    data.add(datanum);
                }
                ConnectionResult= "Successfull";
                isSucces=true;
                connect.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            isSucces = false;
            ConnectionResult=throwables.getMessage();
        }
        return data;
    }

}
