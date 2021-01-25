package com.neuedu.part07;


public interface TestInterface {
	
	final int i=1;
	
	public abstract void  testInterface();
	
	
	public int name() ;
	

}

interface TestInterfacaSon1 extends TestInterface{
	
	public int name1() ;
}


interface TestInterfacaSon2 extends TestInterfacaSon1{
	
	
}

class TestInterfaceC implements  TestInterface,TestInterfacaSon1{

	@Override
	public int name1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void testInterface() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int name() {
		// TODO Auto-generated method stub
		return 0;
	}

}