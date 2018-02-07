package model;
/**
 * �����豸ʵ����
 * @author LeLe
 *
 */
public class Scrap {

	/**
	 * ���
	 */
	private int id;
	/**
	 * �豸��������
	 */
	private String equipmentTypeName;
	/**
	 * �豸����
	 */
	private String equipmentName;
	/**
	 * ��������
	 */
	private String scrapData;
	/**
	 * ������
	 */
	private String dutyPerson;
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
	public String getScrapData() {
		return scrapData;
	}
	public void setScrapData(String scrapData) {
		this.scrapData = scrapData;
	}
	public String getDutyPerson() {
		return dutyPerson;
	}
	public void setDutyPerson(String dutyPerson) {
		this.dutyPerson = dutyPerson;
	}
	/**
	 * ������
	 */
	public Scrap() {
		super();
	}
	/**
	 * �������Ĺ��캯��
	 * @param equipmentTypeName
	 * @param equipmentName
	 * @param scrapData
	 * @param dutyPerson
	 */
	public Scrap(String equipmentTypeName, String equipmentName,
			String scrapData, String dutyPerson) {
		super();
		this.equipmentTypeName = equipmentTypeName;
		this.equipmentName = equipmentName;
		this.scrapData = scrapData;
		this.dutyPerson = dutyPerson;
	}
}
