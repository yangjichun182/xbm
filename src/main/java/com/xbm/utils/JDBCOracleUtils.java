package com.xbm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCOracleUtils {
	public static Connection conn = null;
	public static PreparedStatement ps = null;
	public static ResultSet rs = null;

	/**
	 * 连接数据库的方法
	 * 
	 * @return Connection 返回连接对象
	 */
	public static Connection getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 找到oracle驱动器所在的类
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; // URL地址
			String username = "scott";
			String password = "199128";
			conn = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 关闭连接
	 * 
	 * @param pstmt
	 */
	public static void close(PreparedStatement pstmt) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 关闭数据连接
	 */
	public static void close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
