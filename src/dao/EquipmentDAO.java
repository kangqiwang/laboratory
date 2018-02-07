package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.StringUtil;
import model.Apply;
import model.Equipment;

/**
 * �豸��DAO��
 * @author LeLe
 *
 */
public class EquipmentDAO {

	/**
	 * �豸��Ϣ���
	 * @return
	 * @throws Exception 
	 */
	public int equipmentAdd(Connection con, Equipment equipment) throws Exception{
		String sql = "insert into t_equipment values (null,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, equipment.getEquipmentTypeName());
		pstmt.setString(2, equipment.getEquipmentName());
		pstmt.setString(3, equipment.getStandard());
		pstmt.setFloat(4, equipment.getPrice());
		pstmt.setString(5, equipment.getBuyData());
		pstmt.setString(6, equipment.getProduction());
		pstmt.setInt(7, equipment.getAmount());
		pstmt.setString(8, equipment.getBuyPerson());
		return pstmt.executeUpdate();
		
	}
	
	/**
	 * �豸��ѯ��������
	 * @param con
	 * @param equipment
	 * @return
	 * @throws Exception
	 */
	public ResultSet list(Connection con, Equipment equipment)throws Exception{
		StringBuffer sb = new StringBuffer("select * from t_equipment");
		if (StringUtil.isNotEmpty(equipment.getEquipmentTypeName())) {
			sb.append(" and equipmentTypeName like '%" + equipment.getEquipmentTypeName() + "%'");
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
}
