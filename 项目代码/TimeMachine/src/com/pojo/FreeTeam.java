package com.pojo;

public class FreeTeam {
private String  name;
private int no;
private int match1;
private int result1;
private int match2;
private int result2;
private int match3;
private int result3;
private double result;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public void setNo(String no) {
	this.no = Integer.valueOf(no);
}
public int getMatch1() {
	return match1;
}
public void setMatch1(int match1) {
	this.match1 = match1;
}
public void setMatch1(String match1) {
	this.match1 = Integer.valueOf(match1);
}
public int getResult1() {
	return result1;
}
public void setResult1(int result1) {
	this.result1 = result1;
}
public void setResult1(String result1) {
	this.result1 = Integer.valueOf(result1);
}
public int getMatch2() {
	return match2;
}
public void setMatch2(int match2) {
	this.match2 = match2;
}
public void setMatch2(String match2) {
	this.match2 = Integer.valueOf(match1);
}
public int getResult2() {
	return result2;
}
public void setResult2(int result2) {
	this.result2 = result2;
}
public void setResult2(String result3) {
	this.result2 = Integer.valueOf(result2);
}
public int getMatch3() {
	return match3;
}
public void setMatch3(int match3) {
	this.match3 = match3;
}
public void setMatch3(String match3) {
	this.match3 = Integer.valueOf(match3);
}
public int getResult3() {
	return result3;
}
public void setResult3(int result3) {
	this.result3 = result3;
}
public void setResult3(String result3) {
	this.result3 = Integer.valueOf(result3);
}
public double getResult() {
	return result;
}
public void setResult(double result) {
	this.result = result;
}

}
