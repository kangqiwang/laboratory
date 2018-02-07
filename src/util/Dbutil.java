package util;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * ���ݿ⹤����
 * @author LeLe
 *
 */
public class Dbutil {

	//��ַ
	private String dbUrl = "jdbc:mysql://localhost:3306/db_laboratory";
	//�û���
	private String dbUserName = "root";
	//����
	private String dbPassWord = "123456";
	//��������
	private String jdbcName = "com.mysql.jdbc.Driver";
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() throws Exception{
		//����������
		Class.forName(jdbcName);
		//�õ����Ӷ���
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassWord);
		return con;
	}
	
	/**
	 * �ر����ݿ�����
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		if (con!=null) {
			con.close();
		}
	}
	
	/**
	 * ����
	 * @param args
	 */
	public static void main(String[] args) {
		Dbutil dbutil = new Dbutil();
		try {
			dbutil.getCon();
			System.out.println("���ݿ����ӳɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}
}
