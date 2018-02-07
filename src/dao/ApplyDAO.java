package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.StringUtil;

import model.Apply;

/**
 * �����DAO��
 * @author LeLe
 *
 */
public class ApplyDAO {

	/**
	 * ������Ϣ���
	 * @param con
	 * @param apply
	 * @return
	 * @throws Exception
	 */
	public int applyAdd(Connection con , Apply apply)throws Exception{
		String sql = "insert into t_apply values(null,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, apply.getEquipmentName());
		pstmt.setString(2, apply.getApplyData());
		pstmt.setString(3, apply.getStandard());
		pstmt.setInt(4, apply.getAmount());
		pstmt.setString(5, apply.getApplicant());
		return pstmt.executeUpdate();
	}
	
	/**
	 * ��ѯ���빺���豸����
	 * @param con
	 * @param apply
	 * @return
	 * @throws Exception
	 */
	public ResultSet list(Connection con, Apply apply)throws Exception{
		StringBuffer sb = new StringBuffer("select * from t_apply");
		if (StringUtil.isNotEmpty(apply.getEquipmentName())) {
			sb.append(" and equipmentName like '%" + apply.getEquipmentName() + "%'");
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
}
