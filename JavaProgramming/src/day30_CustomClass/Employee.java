package day30_CustomClass;

public class Employee {
    public String name;
    public char  gender;
    public int ID;
    public String jobTitle;
    public boolean isFullTime;
    public double salary;

    public void setInfo(String name, char gender, int ID, String jobTitle, boolean isFullTime,double salary) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.isFullTime = isFullTime;
        this.salary = salary;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", isFullTime=" + isFullTime +
                '}';

    }
    public  void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }
        }
/*
Attributes:
name,id,gender,jobTitle,isFullTime(boolean)
Actions:
toString();
setInfo():
work()...

CapitalOne Class:
1.Create 5 Employee objects
2.store those into an array
3.how many employees are full time employees?
4.What's the min salary?
5.What's the max salary?
 */

