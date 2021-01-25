package demo;

/**
 * java3种注释方式
 * java版本 1.8 和8.0是同一个版本
 * javaSE 标准版：包含了Java的核心类
 * javaEE 企业版：包含了SE的类，企业级应用
 * javaME 微缩版：一般用于手机，嵌入式端开发
 * 
 * java的特点:1.跨平台：程序是由.java文件（源文件）编译成.class字节码文件 然后通过不同版本的虚拟机（JVM）进行解释执行，JVM与操作系统交互
 *          2.半编译半解释：先编译后运行
 *          3.简单：相对于C++少了指针的功能
 *          4.健壮：通过垃圾回收机制对内存进行管理，保证了语言的健壮性
 *          5.安全：封装特性
 *          6.多线程：支持多线程并发处理
 */
/** 这是文件级别注释 */
// 这是行级别注释
/*
 * 这是多行注释
 */
public class HelloWorld {
     
	//写第一个java程序
	//java文件 public 是修饰符   class 代表这个文件是类， 文件名 ｛｝
	//java程序需要入口  叫做main方法 写代码
	// alt+/ 提示
	// ctrl+s保存
	public static void main(String[] args){
		 
		System.out.print("Hello World");
		
		
	}
	
	
}







