package com.example.schoolmanagementproject.student;

import com.example.schoolmanagementproject.db.DatabaseConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
@RequiredArgsConstructor
public class DaoStudent {

    private final DatabaseConfig databaseConfig;

    public EntityStudent findById(Long id) {
        try(final Connection connection = this.databaseConfig.getConnection()) {

            final PreparedStatement statement = connection.prepareStatement("SELECT * FROM SCHOOL_MANAGEMENT.STUDENT WHERE id = ?");
            statement.setLong(1, id);

            final ResultSet resultSet = statement.executeQuery();
            // no records found
            if (!resultSet.next()) return null;

            EntityStudent student = new EntityStudent();
            student.setId(resultSet.getLong(1));
            student.setFirstName(resultSet.getString(2));
            student.setLastName(resultSet.getString(3));
            student.setPassword(resultSet.getString(4));

            return student;

        } catch (SQLException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
