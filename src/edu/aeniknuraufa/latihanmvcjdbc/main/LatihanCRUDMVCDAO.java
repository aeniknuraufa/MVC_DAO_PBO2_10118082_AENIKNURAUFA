/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aeniknuraufa.latihanmvcjdbc.main;

import edu.aeniknuraufa.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.aeniknuraufa.latihanmvcjdbc.entity.Pelanggan;
import edu.aeniknuraufa.latihanmvcjdbc.error.PelangganException;
import edu.aeniknuraufa.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aenik Nur Aufa
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        PelangganDao dao = KingBarbershopDatabase.getPelangganDao();
        
        dao.deletePelanggan(1);
            
        }
    }
    

