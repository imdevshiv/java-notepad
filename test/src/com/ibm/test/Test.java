package com.ibm.test;

public class Test
{
    int empId;
    String empName;
    String empPhone;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }


    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();


        t1.setEmpId(1);
        t1.setEmpName("Abhi");
        t1.setEmpPhone("8987564581");

        t2.setEmpId(2);
        t2.setEmpName("Shiv");
        t2.setEmpPhone("9692913336");

        t3.setEmpId(3);
        t3.setEmpName("Ashish");
        t3.setEmpPhone("9685479555");

        System.out.println(t1.getEmpId());
        System.out.println(t1.getEmpName());
        System.out.println(t1.getEmpPhone());

        System.out.println(t2.getEmpId());
        System.out.println(t2.getEmpName());
        System.out.println(t2.getEmpPhone());

        System.out.println(t3.getEmpId());
        System.out.println(t3.getEmpName());
        System.out.println(t3.getEmpPhone());

    }
}
