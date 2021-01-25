package com.neuedu.part09;

public class Student implements Comparable<Student>{
	
	private String stuName;
	
	private int stuAge;
	
	private String stuNO;
	
	private int score;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuNO() {
		return stuNO;
	}

	public void setStuNO(String stuNO) {
		this.stuNO = stuNO;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	public void study(){
		
		System.out.println(this.stuName+"ÕýÔÚÑ§Ï°");
		
	}

	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAge=" + stuAge + ", stuNO=" + stuNO + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		result = prime * result + stuAge;
		result = prime * result + ((stuNO == null) ? 0 : stuNO.hashCode());
		result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (score != other.score)
			return false;
		if (stuAge != other.stuAge)
			return false;
		if (stuNO == null) {
			if (other.stuNO != null)
				return false;
		} else if (!stuNO.equals(other.stuNO))
			return false;
		if (stuName == null) {
			if (other.stuName != null)
				return false;
		} else if (!stuName.equals(other.stuName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return this.getScore()>o.getScore() ? 1 : (this.getScore()==o.getScore()?0:-1);
	}


	/*@Override
	public boolean equals(Object obj) {
			Student s = (Student)obj;
			if(this.getStuName().equals(s.getStuName()) && this.getStuAge()==s.getStuAge()){
				return true;
			}
		return false;
	}*/
	
	

}
