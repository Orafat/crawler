package com.example.crawler.bo;

public class IcdN {
    private String icdId;
        private String icdPid;
        private String icdCode;
        private String icdName;
        private String partnum;
        private int codelength;
        private int isclinical;
        private int isusing;
        private String remark;
        private String initializationState;
        private String addUserId;
        private String addUserName;
        private String addTime;
        private String lastUpdateUserId;
        private String lastUpdateUserName;
        private String lastUpdateTime;
        private int level;
        private String children;
        private String applyExplain;
        private String icdAttachment;
        private String classCode;
        private String className;
        private String diagnoseCode;
        private String diagnoseName;
        private String open;
        private String isParent;
        private String mid;
        private String subflag;
        private String confirmStatus;
        public void setIcdId(String icdId) {
            this.icdId = icdId;
        }
        public String getIcdId() {
            return icdId;
        }

        public void setIcdPid(String icdPid) {
            this.icdPid = icdPid;
        }
        public String getIcdPid() {
            return icdPid;
        }

        public void setIcdCode(String icdCode) {
            this.icdCode = icdCode;
        }
        public String getIcdCode() {
            return icdCode;
        }

        public void setIcdName(String icdName) {
            this.icdName = icdName;
        }
        public String getIcdName() {
            return icdName;
        }

        public void setPartnum(String partnum) {
            this.partnum = partnum;
        }
        public String getPartnum() {
            return partnum;
        }

        public void setCodelength(int codelength) {
            this.codelength = codelength;
        }
        public int getCodelength() {
            return codelength;
        }

        public void setIsclinical(int isclinical) {
            this.isclinical = isclinical;
        }
        public int getIsclinical() {
            return isclinical;
        }

        public void setIsusing(int isusing) {
            this.isusing = isusing;
        }
        public int getIsusing() {
            return isusing;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
        public String getRemark() {
            return remark;
        }

        public void setInitializationState(String initializationState) {
            this.initializationState = initializationState;
        }
        public String getInitializationState() {
            return initializationState;
        }

        public void setAddUserId(String addUserId) {
            this.addUserId = addUserId;
        }
        public String getAddUserId() {
            return addUserId;
        }

        public void setAddUserName(String addUserName) {
            this.addUserName = addUserName;
        }
        public String getAddUserName() {
            return addUserName;
        }

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }
        public String getAddTime() {
            return addTime;
        }

        public void setLastUpdateUserId(String lastUpdateUserId) {
            this.lastUpdateUserId = lastUpdateUserId;
        }
        public String getLastUpdateUserId() {
            return lastUpdateUserId;
        }

        public void setLastUpdateUserName(String lastUpdateUserName) {
            this.lastUpdateUserName = lastUpdateUserName;
        }
        public String getLastUpdateUserName() {
            return lastUpdateUserName;
        }

        public void setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }
        public String getLastUpdateTime() {
            return lastUpdateTime;
        }

        public void setLevel(int level) {
            this.level = level;
        }
        public int getLevel() {
            return level;
        }

        public void setChildren(String children) {
            this.children = children;
        }
        public String getChildren() {
            return children;
        }

        public void setApplyExplain(String applyExplain) {
            this.applyExplain = applyExplain;
        }
        public String getApplyExplain() {
            return applyExplain;
        }

        public void setIcdAttachment(String icdAttachment) {
            this.icdAttachment = icdAttachment;
        }
        public String getIcdAttachment() {
            return icdAttachment;
        }

        public void setClassCode(String classCode) {
            this.classCode = classCode;
        }
        public String getClassCode() {
            return classCode;
        }

        public void setClassName(String className) {
            this.className = className;
        }
        public String getClassName() {
            return className;
        }

        public void setDiagnoseCode(String diagnoseCode) {
            this.diagnoseCode = diagnoseCode;
        }
        public String getDiagnoseCode() {
            return diagnoseCode;
        }

        public void setDiagnoseName(String diagnoseName) {
            this.diagnoseName = diagnoseName;
        }
        public String getDiagnoseName() {
            return diagnoseName;
        }

        public void setOpen(String open) {
            this.open = open;
        }
        public String getOpen() {
            return open;
        }

        public void setIsParent(String isParent) {
            this.isParent = isParent;
        }
        public String getIsParent() {
            return isParent;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }
        public String getMid() {
            return mid;
        }

        public void setSubflag(String subflag) {
            this.subflag = subflag;
        }
        public String getSubflag() {
            return subflag;
        }

        public void setConfirmStatus(String confirmStatus) {
            this.confirmStatus = confirmStatus;
        }
        public String getConfirmStatus() {
            return confirmStatus;
        }

    @Override
    public String toString() {
        return "IcdN{" +
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
