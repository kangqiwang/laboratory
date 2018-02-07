package model;
/**
 * �û�ʵ����
 * @author LeLe
 *
 */
public class User {

	/**
	 * ���
	 */
	private int id;
	/**
	 * �û���
	 */
	private String userName;
	/**
	 * ����
	 */
	private String passWord;
	
	/**
	 * ������
	 */
	public User() {
		super();
	}
	
	/**
	 * �������Ĺ��캯��
	 * @param userName
	 * @param passWord
	 */
	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	/**
	 * get/set����
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
