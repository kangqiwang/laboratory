package model;
/**
 * �豸ά��ʵ����
 * @author LeLe
 *
 */
public class RepairEquipment {

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
	 * ά������
	 */
	private String repairData;
	/**
	 * ά�޳���
	 */
	private String repairManufacturers;
	/**
	 * ά�޷���
	 */
	private float repairCost;
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
	public String getRepairData() {
		return repairData;
	}
	public void setRepairData(String repairData) {
		this.repairData = repairData;
	}
	public String getRepairManufacturers() {
		return repairManufacturers;
	}
	public void setRepairManufacturers(String repairManufacturers) {
		this.repairManufacturers = repairManufacturers;
	}
	public float getRepairCost() {
		return repairCost;
	}
	public void setRepairCost(float repairCost) {
		this.repairCost = repairCost;
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
	public RepairEquipment() {
		super();
	}
	
	/**
	 * �������Ĺ��캯��
	 * @param equipmentTypeName
	 * @param equipmentName
	 * @param repairData
	 * @param repairManufacturers
	 * @param repairCost
	 * @param dutyPerson
	 */
	public RepairEquipment(String equipmentTypeName, String equipmentName,
			String repairData, String repairManufacturers, float repairCost,
			String dutyPerson) {
		super();
		this.equipmentTypeName = equipmentTypeName;
		this.equipmentName = equipmentName;
		this.repairData = repairData;
		this.repairManufacturers = repairManufacturers;
		this.repairCost = repairCost;
		this.dutyPerson = dutyPerson;
	}
	
}
