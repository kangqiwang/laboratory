package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

import model.Scrap;

import dao.ScrapDAO;

import util.Dbutil;
import util.StringUtil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
/**
 * �����豸���
 * @author LeLe
 *
 */
public class ScrapAddIntetFrm extends JInternalFrame {
	private JTextField equipmentTypeNameTxt;
	private JTextField equipmentName;
	private JTextField scrapData;
	private JTextField dutyPerson;
	private JButton button;
	private JButton button_1;
	
	private Dbutil dbutil = new Dbutil();
	private ScrapDAO scrapDAO = new ScrapDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrapAddIntetFrm frame = new ScrapAddIntetFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScrapAddIntetFrm() {
		setTitle("\u62A5\u5E9F\u8BBE\u5907\u6DFB\u52A0\u7A97\u53E3");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("\u8BBE\u5907\u7C7B\u578B\u540D\u79F0\uFF1A");
		
		equipmentTypeNameTxt = new JTextField();
		equipmentTypeNameTxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BBE\u5907\u540D\u79F0\uFF1A");
		
		equipmentName = new JTextField();
		equipmentName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u62A5\u5E9F\u65E5\u671F\uFF1A");
		
		scrapData = new JTextField();
		scrapData.setColumns(10);
		
		JLabel label = new JLabel("\u8D23\u4EFB\u4EBA\uFF1A");
		
		dutyPerson = new JTextField();
		dutyPerson.setColumns(10);
		
		button = new JButton("\u63D0\u4EA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrapAddActionPreformed(e);
			}
		});
		button.setIcon(new ImageIcon(ScrapAddIntetFrm.class.getResource("/images/add.png")));
		
		button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				srcapResetValueActionPerformed(e);
			}
		});
		button_1.setIcon(new ImageIcon(ScrapAddIntetFrm.class.getResource("/images/reset.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(66)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel)
								.addComponent(label))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(scrapData)
								.addComponent(dutyPerson)
								.addComponent(equipmentName)
								.addComponent(equipmentTypeNameTxt, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(120)
							.addComponent(button)
							.addGap(27)
							.addComponent(button_1)))
					.addContainerGap(145, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(equipmentTypeNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(equipmentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(scrapData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(dutyPerson, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

	/**
	 * �����豸�ύ�¼�
	 * @param evt
	 */
	private void scrapAddActionPreformed(ActionEvent evt) {
		String equipmentTypeName = this.equipmentTypeNameTxt.getText();
		String equipmentName = this.equipmentName.getText();
		String scrapData = this.scrapData.getText();
		String dutyPerson = this.dutyPerson.getText();
		
		if (StringUtil.isEmpty(equipmentTypeName)) {
			JOptionPane.showMessageDialog(null, "�豸�������Ʋ���Ϊ�գ�");
			return;
		}
		if (StringUtil.isEmpty(equipmentName)) {
			JOptionPane.showMessageDialog(null, "�豸���Ʋ���Ϊ�գ�");
			return;
		}
		if (StringUtil.isEmpty(scrapData)) {
			JOptionPane.showMessageDialog(null, "�������ڲ���Ϊ�գ�");
			return;
		}
		if (StringUtil.isEmpty(dutyPerson)) {
			JOptionPane.showMessageDialog(null, "�����˲���Ϊ�գ�");
			return;
		}
		
		Scrap scrap = new Scrap(equipmentTypeName, equipmentName, scrapData, dutyPerson);
		Connection con =null;
		try {
			con = dbutil.getCon();
			int n = scrapDAO.scrapAdd(con, scrap);
			if (n==1) {
				JOptionPane.showMessageDialog(null, "�豸������Ϣ�ύ�ɹ���");
				resetValue();
			}else {
				JOptionPane.showMessageDialog(null, "�豸������Ϣ�ύʧ�ܣ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				dbutil.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * �����豸�����¼�
	 * @param e
	 */
	private void srcapResetValueActionPerformed(ActionEvent e) {
		this.resetValue();
	}

	/**
	 * ������
	 */
	private void resetValue(){
		this.equipmentTypeNameTxt.setText("");
		this.equipmentName.setText("");
		this.scrapData.setText("");
		this.dutyPerson.setText("");
	}
}
