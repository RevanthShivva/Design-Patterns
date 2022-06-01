package com.company.proxydesignPatterm;

public class AdminProxy extends Admin{
    Admin admin;
    public AdminProxy(String username, String pwd) throws Exception {
        if("Admin".equals(username) && "8888".equals(pwd)){
            admin = new Admin();
        }
        else{
            throw new Exception("User invalid.....");
        }
    }
    public void getListStudents(){
        admin.getListStudents();
    }
    public void modifyStudentAttendance(){
       admin.modifyStudentAttendance();
    }
    public void updateMarks(){
        admin.updateMarks();
    }
}
