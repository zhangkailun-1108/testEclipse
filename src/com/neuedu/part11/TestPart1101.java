package com.neuedu.part11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件与流
 * java.io包
 * 1.文件
 * File类  提供一个指定文件全路径的构造方法，用来创建对应文件引用，用来操作文件内容
 * new  File(String pathname)  全路径
 * new  File(URI url) 文件url
 * new  File(String parent,String child)  根据路径的关系定义
 * createNewFile()创建文件
 * exists()判断文件是否存在
 * delete()删除文件
 * mkdirs()创建文件夹
 * \反斜杠 和 / 的区别？
 * \ windows系统的文件路径
 * / linux系统的文件路径 
 * 
 * 不同系统的斜杠适配问题
 * 
 * 
 * 流
 * 根据传输方向的不同 分为：输入流，输出流
 * 根据传输类型的不同 分为：字符流，字节流
 * 根据传输功能的不同 分为：节点流，处理流
 * 
 * 类型→功能→方向
 * 
 * 字节流
 *     节点流
 *         输入流  FileInputStream in   available()获取文件的大小
 *         read()一次读一个字节，没有东西可读返回-1   
 *         read(byte[])一次读多个字节  
 *         read(byte[in.available()])一次读全部内容
 *         输出流  FileOutputStream out
 *         write()一次写一个字节
 *         write(byte[])一次写多个
 *     处理流   (是基于节点流使用的，构造函数中需要传入一个节点流对应的对象)
 *        新增了一个缓冲区的功能 需要把内容调用flush()方法 写入文件
 * 		         输入流  BufferedInputStream
 *         输出流  BufferedOutputStream
 * 字符流 (不能读图)
 *     节点流
 *         输入流   FileReader
 *         输出流   FileWriter (字符流需要刷flush())
 *     处理流
 * 		         输入流  BufferedReader  readLine()
 *         输出流  BufferedWriter  
 * 输入流输出需要转型成char才能输出内容，不然是输出Unicode 
 * 流在使用完毕后必须关       
 * 通常输入流，输出流用于文件复制
 * 对象序列化
 *     objectInputStream
 *     objectOutputStream
 */
public class TestPart1101 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    File file = new File("F:"+File.separator+"workspace"+File.separator+"aaa.txt");
	    File file2 = new File("F:"+File.separator+"workspace"+File.separator+"Servers","ccc.txt");
	    //studyStream(file,file2);
	    FileReader fileReader = null;
	    FileWriter fileWriter = null;
	    BufferedReader bufferedReader = null;
	    BufferedWriter bufferedWriter = null;
	    try {
	    	if(!file.exists()){
				file.createNewFile();
	    	}
	    	if(!file2.exists()){
				file2.createNewFile();
	    	}
	    	
		    fileReader = new FileReader(file);
		    fileWriter = new FileWriter(file2);
		    bufferedReader = new BufferedReader(fileReader);
		    bufferedWriter = new BufferedWriter(fileWriter);
			char[] cbuf =  new char[1024];
			
			String read = bufferedReader.readLine();//一次读一行
			while(read !=null){
				bufferedWriter.write(read);
				read = bufferedReader.readLine();
			}
			fileWriter.flush();
			/*while (read != -1) {
				System.out.print(cbuf);
				read = fileReader.read(cbuf);
			}*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	
	public static void studyStream(File file,File file2){
		
		FileInputStream fileInputStream = null;
	    FileOutputStream fileOutputStream = null;
	    BufferedInputStream bufferedInputStream = null;
	    BufferedOutputStream bufferedOutputStream = null;
	    try {
	    	if(!file.exists()){
				file.createNewFile();
	    	}
	    	if(!file2.exists()){
				file2.createNewFile();
	    	}
	    	fileInputStream = new FileInputStream(file);
	    	fileOutputStream = new FileOutputStream(file2);
	    	bufferedInputStream = new BufferedInputStream(fileInputStream);
	        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
	    	
	    	int available = fileInputStream.available();
	    	byte[] bt = new byte[available];
	    	int read = fileInputStream.read(bt);//一次读全部内容
	    	bufferedOutputStream.write(bt);
	    	while(read != -1){
	    		for(byte item:bt){
	    			System.out.print((char)item);
	    		}
	    		//需要转型成char才能输出内容，不然是输出Unicode
	    		read = fileInputStream.read(bt);
	    	}
	    	bufferedOutputStream.flush();
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedInputStream.close();
				bufferedOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
