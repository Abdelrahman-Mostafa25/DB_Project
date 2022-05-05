/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.DB_Project;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author 20109
 */
@Entity
public class Project implements Serializable {

    public Project() {
    }
    

    public Project(int id, String projectName, String Projectlocation, Department departmentNumber) {
        this.id = id;
        this.projectName = projectName;
        this.Projectlocation = Projectlocation;
        this.departmentNumber = departmentNumber;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Pnumber")
    private int id;
    
    @Column(name = "Pname")
    private String projectName;
    
    @Column(name = "Plocation")
    private String Projectlocation;
    
    @ManyToOne
    @JoinColumn (name = "Dnum", referencedColumnName = "Dno" )
    private Department departmentNumber;
    

    public int getId() {
        return id;
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
        if (!(object instanceof Project)) {
            return false;
        }
        Project other = (Project) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.DB_Project.Project[ id=" + id + " ]";
    }
    
}
