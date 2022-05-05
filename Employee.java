/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.DB_Project;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author 20109
 */
@Entity
public class Employee implements Serializable {

    public Employee() {
    }

    public Employee(String id, String firstName, char middleName, String lastName, Date birthDate, String address, char sex, float salary, Employee superssn, Department department_number) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.sex = sex;
        this.salary = salary;
        this.superssn = superssn;
        this.department_number = department_number;
    }

    public Employee(String id, String firstName, char middleName, String lastName, Date birthDate, String address, char sex, float salary, Department department_number) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.sex = sex;
        this.salary = salary;
        this.department_number = department_number;
    }

    
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "SSN")
    private String id;

    @Column (name = "Fname")
    private String firstName;
    
    @Column (name = "minit")
    private char middleName;
    
    @Column (name = "Lname")
    private String lastName;
    
    @Column (name = "Bdate")
    private Date birthDate;
    
    @Column (name = "Address")
    private String address;
    
    @Column (name = "Sex")
    private char sex;
    
    @Column (name = "Salary")
    private float salary;
    
    @JoinColumn(name = "Super_ssn", referencedColumnName = "Ssn")
    @ManyToOne
    private Employee superssn;
    
    @ManyToOne
    @JoinColumn (name = "Department_number", referencedColumnName = "Dno" )
    private Department department_number;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.DB_Project.Employee[ id=" + id + " ]";
    }

    public void setId(String string, String a, char c, String a0, java.util.Date date, String a1, char c0, float f, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
