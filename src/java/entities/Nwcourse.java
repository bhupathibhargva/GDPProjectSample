/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author s519458
 */
@Entity
@Table(name = "nwcourse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nwcourse.findAll", query = "SELECT n FROM Nwcourse n"),
    @NamedQuery(name = "Nwcourse.findByCourseNum", query = "SELECT n FROM Nwcourse n WHERE n.courseNum = :courseNum"),
    @NamedQuery(name = "Nwcourse.findByCourseName", query = "SELECT n FROM Nwcourse n WHERE n.courseName = :courseName")})
public class Nwcourse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "courseNum")
    private Integer courseNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "courseName")
    private String courseName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nwcourse")
    private Collection<StuRecord> stuRecordCollection;

    public Nwcourse() {
    }

    public Nwcourse(Integer courseNum) {
        this.courseNum = courseNum;
    }

    public Nwcourse(Integer courseNum, String courseName) {
        this.courseNum = courseNum;
        this.courseName = courseName;
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @XmlTransient
    public Collection<StuRecord> getStuRecordCollection() {
        return stuRecordCollection;
    }

    public void setStuRecordCollection(Collection<StuRecord> stuRecordCollection) {
        this.stuRecordCollection = stuRecordCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseNum != null ? courseNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nwcourse)) {
            return false;
        }
        Nwcourse other = (Nwcourse) object;
        if ((this.courseNum == null && other.courseNum != null) || (this.courseNum != null && !this.courseNum.equals(other.courseNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
       // return "entities.Nwcourse[ courseNum=" + courseNum + " ]";
        return courseNum.toString()+" "+courseName.toString();
    }
    
}
