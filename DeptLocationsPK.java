/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.DB_Project;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author 3bdo Mostafa
 */
@Embeddable
class DeptLocationsPK {
    
    @Basic(optional = false)
    @Column(name = "Dnumber")
    private int Dnumber;
    @Basic(optional = false)
    @Column(name = "Dlocation")
    private String dlocation;

    public DeptLocationsPK() {
    }

    public DeptLocationsPK(int Dnumber, String dlocation) {
        this.Dnumber = Dnumber;
        this.dlocation = dlocation;
    }

    public int getDnumber() {
        return Dnumber;
    }

    public void setDnumber(int Dnumber) {
        this.Dnumber = Dnumber;
    }

    public String getDlocation() {
        return dlocation;
    }

    public void setDlocation(String dlocation) {
        this.dlocation = dlocation;
    }

}
