package test;

import java.util.List;

public class Entity {
	
	private String name;
	private Integer age;
	private String sex;
	private List<String>addr;	
	private String aaa;
	private String bbb;
	private String ccc;
	private String aa;
	private String bb;
	private String cc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getAddr() {
		return addr;
	}
	public void setAddr(List<String> addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Entity [name=" + name + ", age=" + age + ", sex=" + sex + ", addr=" + addr + "]";
	}
}
