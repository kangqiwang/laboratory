package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;

/**
 * �û�Dao��
 * @author LeLe
 *
 */
public class UserDAO {

	/**
	 * ��¼��֤
	 * @param con
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User login(Connection con , User user)throws Exception{
		User resultUser = null;
		String sql = "select * from t_administrator where userName = ? and passWord = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);//������������
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassWord());
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			resultUser = new User();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassWord(rs.getString("passWord"));
		}
		return resultUser;
	}
}
