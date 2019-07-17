package com.example.crawler.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class IcdPo implements Serializable {
    @Id
    private String icdId;
    @Column
    private String icdPid;
    @Column
    private String icdCode;
    @Column
    private String icdName;
    @Column
    private String partnum;
    @Column
    private int codelength;
    @Column
    private int isclinical;
    @Column
    private int isusing;
    @Column
    private String remark;
    @Column
    private String initializationState;
    @Column
    private String addUserId;
    @Column
    private String addUserName;
    @Column
    private String addTime;
    @Column
    private String lastUpdateUserId;
    @Column
    private String lastUpdateUserName;
    @Column
    private String lastUpdateTime;
    @Column
    private int level;
    @Column
    private String children;
    @Column
    private String applyExplain;
    @Column
    private String icdAttachment;
    @Column
    private String classCode;
    private String className;
    @Column
    private String diagnoseCode;
    @Column
    private String diagnoseName;
    @Column
    private String open;
    @Column
    private String isParent;
    @Column
    private String mid;
    @Column
    private String subflag;
    @Column
    private String confirmStatus;

    public String getIcdId() {
        return icdId;
    }

    public void setIcdId(String icdId) {
        this.icdId = icdId;
    }

    public String getIcdPid() {
        return icdPid;
    }

    public void setIcdPid(String icdPid) {
        this.icdPid = icdPid;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public String getPartnum() {
        return partnum;
    }

    public void setPartnum(String partnum) {
        this.partnum = partnum;
    }

    public int getCodelength() {
        return codelength;
    }

    public void setCodelength(int codelength) {
        this.codelength = codelength;
    }

    public int getIsclinical() {
        return isclinical;
    }

    public void setIsclinical(int isclinical) {
        this.isclinical = isclinical;
    }

    public int getIsusing() {
        return isusing;
    }

    public void setIsusing(int isusing) {
        this.isusing = isusing;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getInitializationState() {
        return initializationState;
    }

    public void setInitializationState(String initializationState) {
        this.initializationState = initializationState;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public String getAddUserName() {
        return addUserName;
    }

    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public String getLastUpdateUserName() {
        return lastUpdateUserName;
    }

    public void setLastUpdateUserName(String lastUpdateUserName) {
        this.lastUpdateUserName = lastUpdateUserName;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getApplyExplain() {
        return applyExplain;
    }

    public void setApplyExplain(String applyExplain) {
        this.applyExplain = applyExplain;
    }

    public String getIcdAttachment() {
        return icdAttachment;
    }

    public void setIcdAttachment(String icdAttachment) {
        this.icdAttachment = icdAttachment;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDiagnoseCode() {
        return diagnoseCode;
    }

    public void setDiagnoseCode(String diagnoseCode) {
        this.diagnoseCode = diagnoseCode;
    }

    public String getDiagnoseName() {
        return diagnoseName;
    }

    public void setDiagnoseName(String diagnoseName) {
        this.diagnoseName = diagnoseName;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getSubflag() {
        return subflag;
    }

    public void setSubflag(String subflag) {
        this.subflag = subflag;
    }

    public String getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    @Override
    public String toString() {
        return "IcdPo{" +
                "icdId='" + icdId + '\'' +
                ", icdPid='" + icdPid + '\'' +
                ", icdCode='" + icdCode + '\'' +
                ", icdName='" + icdName + '\'' +
                ", partnum='" + partnum + '\'' +
                ", codelength=" + codelength +
                ", isclinical=" + isclinical +
                ", isusing=" + isusing +
                ", remark='" + remark + '\'' +
                ", initializationState='" + initializationState + '\'' +
                ", addUserId='" + addUserId + '\'' +
                ", addUserName='" + addUserName + '\'' +
                ", addTime='" + addTime + '\'' +
                ", lastUpdateUserId='" + lastUpdateUserId + '\'' +
                ", lastUpdateUserName='" + lastUpdateUserName + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", level=" + level +
                ", children='" + children + '\'' +
                ", applyExplain='" + applyExplain + '\'' +
                ", icdAttachment='" + icdAttachment + '\'' +
                ", classCode='" + classCode + '\'' +
                ", className='" + className + '\'' +
                ", diagnoseCode='" + diagnoseCode + '\'' +
                ", diagnoseName='" + diagnoseName + '\'' +
                ", open='" + open + '\'' +
                ", isParent='" + isParent + '\'' +
                ", mid='" + mid + '\'' +
                ", subflag='" + subflag + '\'' +
                ", confirmStatus='" + confirmStatus + '\'' +
                '}';
    }
}
