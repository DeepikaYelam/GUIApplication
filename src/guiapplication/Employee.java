/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapplication;

import java.io.Serializable;

/**
 *
 * @author YelamD
 */
public class Employee implements Serializable{
    private String firstName;
    private String lastName;
    private Job job;
    private Integer empNum;

    public Employee(String firstName, String lastName, Job job, Integer empNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.empNum = empNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Integer getEmpNum() {
        return empNum;
    }

    public void setEmpNum(Integer empNum) {
        this.empNum = empNum;
    }
    
    
    
}
