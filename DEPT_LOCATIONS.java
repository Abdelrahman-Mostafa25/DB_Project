/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.DB_Project;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author 3bdo Mostafa
 */
@Entity
public class DEPT_LOCATIONS implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DeptLocationsPK deptLocationsPK;
    @JoinColumn(name = "Dnumber", referencedColumnName = "Dno", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Department department;
    
    
    public DEPT_LOCATIONS() {
    }

    public DEPT_LOCATIONS(int dno, String dlocation) {
        this.deptLocationsPK = new DeptLocationsPK(dno, dlocation);
    }
    
     public DEPT_LOCATIONS(DeptLocationsPK deptLocationsPK) {
        this.deptLocationsPK = deptLocationsPK;
    }

    public DeptLocationsPK getDeptLocationsPK() {
        return deptLocationsPK;
    }

    public void setDeptLocationsPK(DeptLocationsPK deptLocationsPK) {
        this.deptLocationsPK = deptLocationsPK;
    }

    public Department getDepartment() {
        return department;
    }

      public void setDepartment(Department department) {
        this.department = department;
    }
   
    
    
}
