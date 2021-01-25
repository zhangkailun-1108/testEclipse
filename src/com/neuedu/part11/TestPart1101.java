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
 * �ļ�����
 * java.io��
 * 1.�ļ�
 * File��  �ṩһ��ָ���ļ�ȫ·���Ĺ��췽��������������Ӧ�ļ����ã����������ļ�����
 * new  File(String pathname)  ȫ·��
 * new  File(URI url) �ļ�url
 * new  File(String parent,String child)  ����·���Ĺ�ϵ����
 * createNewFile()�����ļ�
 * exists()�ж��ļ��Ƿ����
 * delete()ɾ���ļ�
 * mkdirs()�����ļ���
 * \��б�� �� / ������
 * \ windowsϵͳ���ļ�·��
 * / linuxϵͳ���ļ�·�� 
 * 
 * ��ͬϵͳ��б����������
 * 
 * 
 * ��
 * ���ݴ��䷽��Ĳ�ͬ ��Ϊ���������������
 * ���ݴ������͵Ĳ�ͬ ��Ϊ���ַ������ֽ���
 * ���ݴ��书�ܵĲ�ͬ ��Ϊ���ڵ�����������
 * 
 * ���͡����ܡ�����
 * 
 * �ֽ���
 *     �ڵ���
 *         ������  FileInputStream in   available()��ȡ�ļ��Ĵ�С
 *         read()һ�ζ�һ���ֽڣ�û�ж����ɶ�����-1   
 *         read(byte[])һ�ζ�����ֽ�  
 *         read(byte[in.available()])һ�ζ�ȫ������
 *         �����  FileOutputStream out
 *         write()һ��дһ���ֽ�
 *         write(byte[])һ��д���
 *     ������   (�ǻ��ڽڵ���ʹ�õģ����캯������Ҫ����һ���ڵ�����Ӧ�Ķ���)
 *        ������һ���������Ĺ��� ��Ҫ�����ݵ���flush()���� д���ļ�
 * 		         ������  BufferedInputStream
 *         �����  BufferedOutputStream
 * �ַ��� (���ܶ�ͼ)
 *     �ڵ���
 *         ������   FileReader
 *         �����   FileWriter (�ַ�����Ҫˢflush())
 *     ������
 * 		         ������  BufferedReader  readLine()
 *         �����  BufferedWriter  
 * �����������Ҫת�ͳ�char����������ݣ���Ȼ�����Unicode 
 * ����ʹ����Ϻ�����       
 * ͨ��������������������ļ�����
 * �������л�
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
			
			String read = bufferedReader.readLine();//һ�ζ�һ��
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
	    	int read = fileInputStream.read(bt);//һ�ζ�ȫ������
	    	bufferedOutputStream.write(bt);
	    	while(read != -1){
	    		for(byte item:bt){
	    			System.out.print((char)item);
	    		}
	    		//��Ҫת�ͳ�char����������ݣ���Ȼ�����Unicode
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
