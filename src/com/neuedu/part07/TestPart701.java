package com.neuedu.part07;



/**
 * 面向对象的高级特性：继承 封装 多态
 * 1.继承
 * 子类继承父类，可以继承父类(超类)的属性和方法，一般用于子类新功能扩展，一个类只能继承一个父类，一个父类可以有多个子类
 * 写法：在子类名后  extends 写父类名
 *
 * 子类实例化时，会先调用父类的构造方法进行实例化，再调用子类自己的构造方法
 * 
 * super关键字
 * 代表当前对象的父类对象
 * super()代表的是父类构造方法   需要放在子类构造函数的第一句 不能和this()同时存在
 * 
 * 面试：子类实例化顺序？
 * 
 * 
 * 包名和类名组成全类名
 * com.neuedu.part07.TestPart701
 * import 导入的包名和类名
 * 注意：java.lang包下的类不需要导入 可以直接使用
 * 导入其他包类时，只能导入public修饰的类
 * 
 * 访问权限修饰符
 * public 范围最大
 * protected 能在当前类和同一包中的类进行使用还可以在不同包中的子类使用，可以修饰属性和方法
 * default 默认的 只能在当前类和同一包中的类进行使用（不写修饰符的情况）
 * private 私有的 只能在当前类使用，通常用来修饰属性
 * 
 * 类只能用 public 修饰 或者不写（默认）
 * 
 * 构造器方法
 * 由于属性的私有化，需要特定提供读取和赋值的方式 ，把这种方法 称为构造器方法
 * 读取 getter 
 * public 返回值类型 get属性名(){ return 属性名; }
 * 赋值setter
 * public void set属性名(数据类型参数值){ 属性名 = 参数值； }
 * 自动创建构造器的方式：
 * 在指定的类  右键 点击 source 选中 Generate getters，setters  选中需要创建的属性 然后确认
 * 
 * 
 * ※方法的覆盖
 * 子类重写父类的方法 叫做覆盖
 * 覆盖的规则：
 * 1.需要有相同的方法名
 * 2.需要有完全一致的参数
 * 3.返回值类型相同
 * 4.父类被覆盖方法权限小于等于子类方法
 * 
 * 面试题：方法重载和方法覆盖的区别？
 * 重载是同一类的 水平关系，覆盖是父子类的垂直关系
 * 分别介绍  重载的规则 和覆盖的规则
 * 
 * 引用数据类型转换
 * 1.向上转型
 * 子类转换成父类 ，自动转换
 * 需要有子父类继承关系，转换之后会丢失 子类扩展的属性和行为
 * 2.向下转型
 * 父类显示的转换成子类，强制转换
 * 只有经历过向上转型，才能向下转型
 * 
 * instanceof关键字 
 * 判断向上转型后的对象 属于哪个类
 * 
 * 
 * 
 * 
 */
public class TestPart701 {
	
	public static void main(String[] args) {
		//向上造型
		Employee employee = new ITWorker();
		//向下转型 
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

	public double getSalary(){//读取 getter方法
		return this.salary;
	}
	
	public void setSalary(double salary){//设置的 setter方法
		this.salary = salary;
	}
	
	public Employee(){
		System.out.println("这是父类的构造方法");
	}
	
	public Employee(String name,String birth,double salary){
		this.name = name;
		this.birth = birth;
		this.salary = salary;
	}
	
	public void getAllInfo(){
		System.out.println("工资是："+salary+"生日是："+birth+"姓名是："+name);
	}
	
	public double getSal(){
		System.out.println("工资是："+salary);
		return this.salary;
	}
}

class ITWorker extends Employee{
	
	String lType;//语言种类
	
	int code;//每天的代码数
	
	public ITWorker(){
		System.out.println("这是子类的构造方法");
	}
	
	public ITWorker(String lType,int code,String name,String birth,double salary){
		super(name,birth,salary);
		this.lType = lType;
		this.code = code;
	}
	
	
	public void jiaban(){
		System.out.println(super.getName()+"是使用"+this.lType+"语言进行工作,加班可以写行"+this.code+"代码");
	}
	
	@Override
	public void getAllInfo(){
		System.out.println("工资是："+getSalary()+"生日是："+getBirth()+"姓名是："+getName()+"语言是："+lType+"代码数"+code);
	}
	
	
}