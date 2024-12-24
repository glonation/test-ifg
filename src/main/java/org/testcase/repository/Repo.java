package org.testcase.repository;


import org.testcase.entity.Data;

import javax.enterprise.context.ApplicationScoped;
        import javax.inject.Inject;
import java.sql.Array;
import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;
import java.util.ArrayList;

@ApplicationScoped
public class Repo {

    @Inject
    io.agroal.api.AgroalDataSource dataSource;

    public void storeData(ArrayList<Data> dataList) {
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO data (name, test, desc_test) VALUES (?, ?, ?)");
            for (Data data : dataList) {
                ps.setString(1, data.getName());
                ps.setString(2,data.getTest());
                ps.setString(3, data.getDesc_test());
            }


            ps.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}