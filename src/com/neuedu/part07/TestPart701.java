package com.neuedu.part07;



/**
 * �������ĸ߼����ԣ��̳� ��װ ��̬
 * 1.�̳�
 * ����̳и��࣬���Լ̳и���(����)�����Ժͷ�����һ�����������¹�����չ��һ����ֻ�ܼ̳�һ�����࣬һ����������ж������
 * д��������������  extends д������
 *
 * ����ʵ����ʱ�����ȵ��ø���Ĺ��췽������ʵ�������ٵ��������Լ��Ĺ��췽��
 * 
 * super�ؼ���
 * ����ǰ����ĸ������
 * super()������Ǹ��๹�췽��   ��Ҫ�������๹�캯���ĵ�һ�� ���ܺ�this()ͬʱ����
 * 
 * ���ԣ�����ʵ����˳��
 * 
 * 
 * �������������ȫ����
 * com.neuedu.part07.TestPart701
 * import ����İ���������
 * ע�⣺java.lang���µ��಻��Ҫ���� ����ֱ��ʹ��
 * ������������ʱ��ֻ�ܵ���public���ε���
 * 
 * ����Ȩ�����η�
 * public ��Χ���
 * protected ���ڵ�ǰ���ͬһ���е������ʹ�û������ڲ�ͬ���е�����ʹ�ã������������Ժͷ���
 * default Ĭ�ϵ� ֻ���ڵ�ǰ���ͬһ���е������ʹ�ã���д���η��������
 * private ˽�е� ֻ���ڵ�ǰ��ʹ�ã�ͨ��������������
 * 
 * ��ֻ���� public ���� ���߲�д��Ĭ�ϣ�
 * 
 * ����������
 * �������Ե�˽�л�����Ҫ�ض��ṩ��ȡ�͸�ֵ�ķ�ʽ �������ַ��� ��Ϊ����������
 * ��ȡ getter 
 * public ����ֵ���� get������(){ return ������; }
 * ��ֵsetter
 * public void set������(�������Ͳ���ֵ){ ������ = ����ֵ�� }
 * �Զ������������ķ�ʽ��
 * ��ָ������  �Ҽ� ��� source ѡ�� Generate getters��setters  ѡ����Ҫ���������� Ȼ��ȷ��
 * 
 * 
 * �������ĸ���
 * ������д����ķ��� ��������
 * ���ǵĹ���
 * 1.��Ҫ����ͬ�ķ�����
 * 2.��Ҫ����ȫһ�µĲ���
 * 3.����ֵ������ͬ
 * 4.���౻���Ƿ���Ȩ��С�ڵ������෽��
 * 
 * �����⣺�������غͷ������ǵ�����
 * ������ͬһ��� ˮƽ��ϵ�������Ǹ�����Ĵ�ֱ��ϵ
 * �ֱ����  ���صĹ��� �͸��ǵĹ���
 * 
 * ������������ת��
 * 1.����ת��
 * ����ת���ɸ��� ���Զ�ת��
 * ��Ҫ���Ӹ���̳й�ϵ��ת��֮��ᶪʧ ������չ�����Ժ���Ϊ
 * 2.����ת��
 * ������ʾ��ת�������࣬ǿ��ת��
 * ֻ�о���������ת�ͣ���������ת��
 * 
 * instanceof�ؼ��� 
 * �ж�����ת�ͺ�Ķ��� �����ĸ���
 * 
 * 
 * 
 * 
 */
public class TestPart701 {
	
	public static void main(String[] args) {
		//��������
		Employee employee = new ITWorker();
		//����ת�� 
		ITWorker itWorker = (ITWorker) employee;
	}
	
}

class Employee{
	
	private String name;
	private String birth;
	private double salary;
	
	
	public String getName() {
		return name;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getBirth() {
		return birth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary(){//��ȡ getter����
		return this.salary;
	}
	
	public void setSalary(double salary){//���õ� setter����
		this.salary = salary;
	}
	
	public Employee(){
		System.out.println("���Ǹ���Ĺ��췽��");
	}
	
	public Employee(String name,String birth,double salary){
		this.name = name;
		this.birth = birth;
		this.salary = salary;
	}
	
	public void getAllInfo(){
		System.out.println("�����ǣ�"+salary+"�����ǣ�"+birth+"�����ǣ�"+name);
	}
	
	public double getSal(){
		System.out.println("�����ǣ�"+salary);
		return this.salary;
	}
}

class ITWorker extends Employee{
	
	String lType;//��������
	
	int code;//ÿ��Ĵ�����
	
	public ITWorker(){
		System.out.println("��������Ĺ��췽��");
	}
	
	public ITWorker(String lType,int code,String name,String birth,double salary){
		super(name,birth,salary);
		this.lType = lType;
		this.code = code;
	}
	
	
	public void jiaban(){
		System.out.println(super.getName()+"��ʹ��"+this.lType+"���Խ��й���,�Ӱ����д��"+this.code+"����");
	}
	
	@Override
	public void getAllInfo(){
		System.out.println("�����ǣ�"+getSalary()+"�����ǣ�"+getBirth()+"�����ǣ�"+getName()+"�����ǣ�"+lType+"������"+code);
	}
	
	
}