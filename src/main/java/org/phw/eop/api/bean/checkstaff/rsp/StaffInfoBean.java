package org.phw.eop.api.bean.checkstaff.rsp;

import java.io.Serializable;

import org.phw.eop.api.internal.mapping.annotation.EopBean;

@EopBean
public class StaffInfoBean implements Serializable {

    private static final long serialVersionUID = -4336099269888902242L;

    private String staffName;

    private String staffNumber;

    private String staffSex;

    private String staffPsptType;

    private String staffPsptId;

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }

    public String getStaffPsptType() {
        return staffPsptType;
    }

    public void setStaffPsptType(String staffPsptType) {
        this.staffPsptType = staffPsptType;
    }

    public String getStaffPsptId() {
        return staffPsptId;
    }

    public void setStaffPsptId(String staffPsptId) {
        this.staffPsptId = staffPsptId;
    }

}
