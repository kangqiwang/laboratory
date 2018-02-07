package model;
/**
 * �豸ʵ��
 * @author LeLe
 *
 */
public class Equipment {

	/**
	 * ID��
	 */
	private int id;
	/**
	 * �豸�ͺ�
	 */
	private String equipmentTypeName;
	/**
	 * �豸����
	 */
	private String equipmentName;
	/**
	 * ���
	 */
	private String standard;
	/**
	 * �۸�
	 */
	private float price;
	/**
	 * ����ʱ��
	 */
	private String buyData;
	/**
	 * ��������
	 */
	private String production;
	/**
	 * ����
	 */
	private int amount;
	/**
	 * ������
	 */
	private String buyPerson;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEquipmentTypeName() {
		return equipmentTypeName;
	}
	public void setEquipmentTypeName(String equipmentTypeName) {
		this.equipmentTypeName = equipmentTypeName;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBuyData() {
		return buyData;
	}
	public void setBuyData(String buyData) {
		this.buyData = buyData;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBuyPerson() {
		return buyPerson;
	}
	public void setBuyPerson(String buyPerson) {
		this.buyPerson = buyPerson;
	}
	
	/**
	 * �������Ĺ��캯��
	 * @param equipmentTypeName
	 * @param equipmentName
	 * @param standard
	 * @param price
	 * @param buyData
	 * @param production
	 * @param amount
	 * @param buyPerson
	 */
	public Equipment(String equipmentTypeName, String equipmentName,
			String standard, float price, String buyData, String production,
			int amount, String buyPerson) {
		super();
		this.equipmentTypeName = equipmentTypeName;
		this.equipmentName = equipmentName;
		this.standard = standard;
		this.price = price;
		this.buyData = buyData;
		this.production = production;
		this.amount = amount;
		this.buyPerson = buyPerson;
	}
	/**
	 * ������
	 */
	public Equipment() {
		super();
	}
}
