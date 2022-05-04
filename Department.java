/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.DB_Project;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 20109
 */
@Entity
public class Department implements Serializable {

    public Department() {
    }

    public Department(int id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public Department(int id, String departmentName, Employee mgr_ssn, Date mgrstartdate) {
        this.id = id;
        this.departmentName = departmentName;
        this.mgr_ssn = mgr_ssn;
        this.mgrstartdate = mgrstartdate;
    }
    
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "Dno")
    private int id;

    @Column (name = "Dname")
    private String departmentName;
    
    @OneToOne
    @JoinColumn(name = "Mgr_ssn", referencedColumnName = "Ssn")
    private Employee mgr_ssn;
    
    @Column(name = "Mgr_start_date")
    @Temporal(TemporalType.DATE)
    private Date mgrstartdate;
    
    public int getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getMgr_ssn() {
        return mgr_ssn;
    }

    public Date getMgrstartdate() {
        return mgrstartdate;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setMgr_ssn(Employee mgr_ssn) {
        this.mgr_ssn = mgr_ssn;
    }

    public void setMgrstartdate(Date mgrstartdate) {
        this.mgrstartdate = mgrstartdate;
    }
    

    public void setId(int id) {
        this.id = id;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.DB_Project.Department[ id=" + id + " ]";
    }
    
}
