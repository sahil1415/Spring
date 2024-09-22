package com.sahil.SpringJDBCFirst.repository;

import com.sahil.SpringJDBCFirst.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s1) {
        String sql = "insert into student (id, name, marks) values (?, ?, ?)";
        int rowsAffected = jdbc.update(sql, s1.getId(), s1.getName(), s1.getMarks());
        System.out.println("Student Added " + "Rows Affected "+ rowsAffected);
    }

    public List<Student> findAll() {
        String sql = "Select * from student";
//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student st = new Student();
//                st.setId(rs.getInt("id"));
//                st.setName(rs.getString("name"));
//                st.setMarks(rs.getInt("marks"));
//                return st;
//            }
//        };
//        return jdbc.query(sql, mapper);   // same as execute query which we use to retrieve data
        //using row mapper we can fetch data from the result set execute query gives us the result set

        return jdbc.query(sql,(rs, rowNum) ->{
            Student st = new Student();
                st.setId(rs.getInt("id"));
                st.setName(rs.getString("name"));
                st.setMarks(rs.getInt("marks"));
                return st;
        });
    }
}
