package com.ppumting.pm80.trainer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ppumting.pm80.trainer.data.DataSource;
import com.ppumting.pm80.trainer.data.NamingService;
import com.ppumting.pm80.trainer.domain.Trainer;

public class TrainerDao {
	private static TrainerDao instance = new TrainerDao();

	public static TrainerDao getInstance() {
		return instance;
	}
	
	static NamingService namingService = NamingService.getInstance();
	static DataSource datasource = (DataSource)namingService.getAttribute("dataSource");
   
	public TrainerDao() {
		
	}
	
     public void addTrainer(Trainer trainer) {
         String sql = "INSERT INTO Trainer(trainerId, name, ssn, phone, pw, addr)"
                  + "VALUES(?, ?, ?, ?, ?, ?)";
         
         try {
            Connection con = null;
            PreparedStatement  pstmt = null;
            try {
               con = datasource.getConnection();
               pstmt = con.prepareStatement(sql);
               pstmt.setString(1, trainer.getName());
               pstmt.setString(2, trainer.getSsn());
               pstmt.setString(3, trainer.getTrainerId());
               pstmt.setString(4, trainer.getPasswd());
               pstmt.setString(5, trainer.getAddr());
               pstmt.executeUpdate();
            } finally{
            	datasource.close(pstmt,con);
            }

            System.out.println("NEW Trainer in Trainer");
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

     public List<Trainer> findAllTrainers() {
         String sql = "SELECT * FROM Trainer";
         
         List<Trainer> trainerList = new ArrayList<>();
         
         try {
            Connection con = null;
            PreparedStatement  pstmt = null;
            ResultSet rs = null;
            try {
               con = datasource.getConnection();
               pstmt = con.prepareStatement(sql);
               rs = pstmt.executeQuery();
               while(rs.next()) {
            	   Trainer t = new Trainer();
            	   t.setTrainerId(rs.getString("tid"));
            	   t.setName(rs.getString("trainername"));
            	   t.setPasswd(rs.getString("passwd"));
            	   t.setSsn(rs.getString("ssn"));
            	   trainerList.add(t);
               }
            } finally{
            	datasource.close(rs, pstmt,con);
            }

            System.out.println("NEW Trainer in Trainer");
         } catch (Exception e) {
            e.printStackTrace();
         }
		return trainerList;
      }

	public boolean isValidTrainers(String trainerId, String passwd) {
	    String sql = "SELECT trainerId, passwd FROM Trainer WHERE trainerId = ?";
        
        try {
           Connection con = null;
           PreparedStatement  pstmt = null;
           ResultSet rs = null;
           try {
              con = datasource.getConnection();
              pstmt = con.prepareStatement(sql);
              pstmt.setString(1, trainerId);
              rs = pstmt.executeQuery();
              
              Trainer trainerInfo = new Trainer();
              while(rs.next()) {
           	   trainerInfo.setTrainerId(rs.getString("trainerId"));
           	   trainerInfo.setPasswd(rs.getString("passwd"));
              }
              if(trainerId.equals(trainerInfo.getTrainerId()) && passwd.equals(trainerInfo.getPasswd())) {
            	  return true;
              }else {
            	  return false;
              }
           } finally{
           	datasource.close(rs, pstmt,con);
           }
        } catch (Exception e) {
           e.printStackTrace();
        }
		return false;
	}

     
   }
