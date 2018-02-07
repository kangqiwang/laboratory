package model;
/**
 * �����ʵ��
 * @author LeLe
 *
 */
public class Apply {

	/**
	 * ���
	 */
	private int id;
	/**
	 * �豸����
	 */
	private String equipmentName;
	/**
	 * ��������
	 */
	private String applyData;
	/**
	 * ���
	 */
	private String standard;
	/**
	 * ����
	 */
	private int amount;
	/**
	 * ������
	 */
	private String applicant;
	/**
	 * get/set����
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getApplyData() {
		return applyData;
	}
	public void setApplyData(String applyData) {
		this.applyData = applyData;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	/**
	 * ���캯��
	 */
	public Apply() {
		super();
	}
	/**
	 * �������Ĺ��캯��
	 * @param equipmentName
	 * @param applyData
	 * @param standard
	 * @param amount
	 * @param applicant
	 */
	public Apply(String equipmentName, String applyData, String standard,
			int amount, String applicant) {
		super();
		this.equipmentName = equipmentName;
		this.applyData = applyData;
		this.standard = standard;
		this.amount = amount;
		this.applicant = applicant;
	}
	
}
