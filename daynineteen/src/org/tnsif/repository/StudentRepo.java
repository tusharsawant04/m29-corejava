package org.tnsif.repository;

import java.sql.*;
import java.sql.ResultSet;

import org.tnsif.entities.Student;

public interface StudentRepo {

	Statement makeStatement();
	PreparedStatement createPrepareStatement(String query);
	public int addQuery(String query, Student student);
	public int updateQuery(String query, Student student);
	public int deleteQuery(String query);
	public ResultSet retrieveQuery(String query);
}
