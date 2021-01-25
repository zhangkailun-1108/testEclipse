package com.neuedu.part06;


/**
 * 面向对象基础
 * 类是一个模版，把相似的一类特定种类的对象归着一个类，可以通过类定义这一类对象的属性 和行为
 * 
 * 类的结构
 * [public][abstract|final]class 类名[extends父类][implements接口列表]
 * {  
 *  属性声明及初始化；
 *  方法声明及方法体；
 * }
 * 写类创建过程
 * 先写属性：定义之后属性名变色，类中的方法里都可以直接使用(属性有默认值) String默认是null，int默认0
 * 属性是全局可用，全局变量，不需要初始化就可以使用
 * 方法中的变量 只在对应作用域内可用，是局部变量，想使用必须初始化
 *
 * 对象：类的实际的个体（实例）
 * 实例化
 * 
 * 垃圾回收机制
 * 程序运行过程中，由一个低优先级的线程（gc）进行处理,人为控制不了
 * 一旦运行该线程，会寻找没有引用的对象，调用该对象的finalize()方法，执行垃圾回收机制进行回收
 * object 类 是所有类默认继承的父类
 * 
 * 构造方法
 * 是一种特殊的方法，用来初始化类的属性，方法名要与类名相同
 * [访问控制符] 类名（[参数列表]）{
 *      //方法体
 * }
 * 作用：
 * 1.可以通过构造方法完成对象的实例化
 * 2.通过有参的构造方法完成对象属性的初始化
 * 
 * 注意：构造方法可以重载，
 * 	         当存在有参的构造方法时候，默认无参的构造方法就不在了，如果需要用无参，则定义出来
 * 
 * 
 * this关键字
 * this代表当前对象,不做区分时可以省略
 * 方法中可以理解为 调用当前方法的对象
 * 
 * this() 可以在构造器中使用，可以调用另一个构造方法
 * 一般用于无参构造调用有参构造 创建默认值
 * 注意：必须放在构造方法的第一句话
 * 
 * 
 * 匿名对象
 * 在创建对象时，不定义对象的引用句柄，只是为了调用方法或属性而创建，这种叫做匿名对象
 * 
 */
public class TestPart601 {

	public static void main(String[] args) {
		// 类名        类对象名                     构造器
		Employee epl = new Employee();//创建一个对象
		//通过 引用 去操作对应对象属性和方法
		System.out.println(epl.showName());
		System.out.println(epl.showAge());
		epl.updateName("smith");
		System.out.println(epl.showName());
		
		Employee epl2 = new Employee("王建宇",26,500);//通过调用有参的构造方法进行初始化
		System.out.println(epl2.showName()+":"+epl2.getSal());
		
		
		Employee epl3 = new Employee("刘健",18);
		System.out.println(epl3.getSal());
		
		//匿名对象的使用
		new Employee("潘远志",18);
		
		/*Employee[] arrEmp  = new Employee[50];
		Employee  employee = null;
		for(int i=0;i<arrEmp.length;i++){
			employee = new Employee();
			arrEmp[i]=employee;
		}
		for(Employee item:arrEmp){
			System.out.println(item);
		}*/

		
		
	}

}
