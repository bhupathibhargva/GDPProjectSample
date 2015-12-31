/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author s519458
 */
@Embeddable
public class StuRecordPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "studentKey")
    private int studentKey;
    @Basic(optional = false)
    @NotNull
    @Column(name = "courseNum")
    private int courseNum;

    public StuRecordPK() {
    }

    public StuRecordPK(int studentKey, int courseNum) {
        this.studentKey = studentKey;
        this.courseNum = courseNum;
    }

    public int getStudentKey() {
        return studentKey;
    }

    public void setStudentKey(int studentKey) {
        this.studentKey = studentKey;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) studentKey;
        hash += (int) courseNum;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StuRecordPK)) {
            return false;
        }
        StuRecordPK other = (StuRecordPK) object;
        if (this.studentKey != other.studentKey) {
            return false;
        }
        if (this.courseNum != other.courseNum) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentKey=" + studentKey + ", courseNum=" + courseNum;
    }
    
}
