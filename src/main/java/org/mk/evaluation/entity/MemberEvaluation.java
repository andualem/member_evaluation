package org.mk.evaluation.entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "MemberEvaluation")
public class MemberEvaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "evaluation_round_id")
    private EvaluationRound evaluationRound;

    //Participation related
    private boolean prayerParticipation;
    private boolean mainCenterParticipation;
    private boolean mainDepartmentParticipation;
    private boolean woredaCenterParticipation;
    private boolean subCenterParticipation;
    private boolean departmentParticipation;

    //Responsibility related
    private boolean mainCenterResponsibility;
    private boolean mainDepartmentResponsibility;
    private boolean woredaCenterResponsibility;
    private boolean subCenterResponsibility;
    private boolean departmentResponsibility;

    //Committee Responsibility related
    private boolean mainCenterCommitteeResponsibility;
    private boolean mainDepartmentCommitteeResponsibility;
    private boolean woredaCenterCommitteeResponsibility;
    private boolean subCenterCommitteeResponsibility;
    private boolean departmentCommitteeResponsibility;

    //Self motivation
    private boolean VoluntaryInOtherDepartment;
    private boolean VoluntaryInSelfDepartment;

    //Attendance
    private boolean mainCenterAttendance;
    private boolean mainDepartmentAttendance;
    private boolean woredaCenterAttendance;
    private boolean subCenterAttendance;
    private boolean departmentAttendance;

    //General Assembly Meeting attendance
    private boolean mainCenterGAAttendance;
    private boolean woredaCenterGAAttendance;

    //Contribution
    private boolean contributeMonthly;

    @CreatedBy
    private long createdBy;
    @LastModifiedDate
    private long lastModifiedDate;
    @LastModifiedBy
    private long lastModifiedBy;

    public EvaluationRound getEvaluationRound() {
        return evaluationRound;
    }

    public void setEvaluationRound(EvaluationRound evaluationRound) {
        this.evaluationRound = evaluationRound;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPrayerParticipation() {
        return prayerParticipation;
    }

    public void setPrayerParticipation(boolean prayerParticipation) {
        this.prayerParticipation = prayerParticipation;
    }

    public boolean isMainCenterParticipation() {
        return mainCenterParticipation;
    }

    public void setMainCenterParticipation(boolean mainCenterParticipation) {
        this.mainCenterParticipation = mainCenterParticipation;
    }

    public boolean isMainDepartmentParticipation() {
        return mainDepartmentParticipation;
    }

    public void setMainDepartmentParticipation(boolean mainDepartmentParticipation) {
        this.mainDepartmentParticipation = mainDepartmentParticipation;
    }

    public boolean isWoredaCenterParticipation() {
        return woredaCenterParticipation;
    }

    public void setWoredaCenterParticipation(boolean woredaCenterParticipation) {
        this.woredaCenterParticipation = woredaCenterParticipation;
    }

    public boolean isSubCenterParticipation() {
        return subCenterParticipation;
    }

    public void setSubCenterParticipation(boolean subCenterParticipation) {
        this.subCenterParticipation = subCenterParticipation;
    }

    public boolean isDepartmentParticipation() {
        return departmentParticipation;
    }

    public void setDepartmentParticipation(boolean departmentParticipation) {
        this.departmentParticipation = departmentParticipation;
    }

    public boolean isMainCenterResponsibility() {
        return mainCenterResponsibility;
    }

    public void setMainCenterResponsibility(boolean mainCenterResponsibility) {
        this.mainCenterResponsibility = mainCenterResponsibility;
    }

    public boolean isMainDepartmentResponsibility() {
        return mainDepartmentResponsibility;
    }

    public void setMainDepartmentResponsibility(boolean mainDepartmentResponsibility) {
        this.mainDepartmentResponsibility = mainDepartmentResponsibility;
    }

    public boolean isWoredaCenterResponsibility() {
        return woredaCenterResponsibility;
    }

    public void setWoredaCenterResponsibility(boolean woredaCenterResponsibility) {
        this.woredaCenterResponsibility = woredaCenterResponsibility;
    }

    public boolean isSubCenterResponsibility() {
        return subCenterResponsibility;
    }

    public void setSubCenterResponsibility(boolean subCenterResponsibility) {
        this.subCenterResponsibility = subCenterResponsibility;
    }

    public boolean isDepartmentResponsibility() {
        return departmentResponsibility;
    }

    public void setDepartmentResponsibility(boolean departmentResponsibility) {
        this.departmentResponsibility = departmentResponsibility;
    }

    public boolean isMainCenterCommitteeResponsibility() {
        return mainCenterCommitteeResponsibility;
    }

    public void setMainCenterCommitteeResponsibility(boolean mainCenterCommitteeResponsibility) {
        this.mainCenterCommitteeResponsibility = mainCenterCommitteeResponsibility;
    }

    public boolean isMainDepartmentCommitteeResponsibility() {
        return mainDepartmentCommitteeResponsibility;
    }

    public void setMainDepartmentCommitteeResponsibility(boolean mainDepartmentCommitteeResponsibility) {
        this.mainDepartmentCommitteeResponsibility = mainDepartmentCommitteeResponsibility;
    }

    public boolean isWoredaCenterCommitteeResponsibility() {
        return woredaCenterCommitteeResponsibility;
    }

    public void setWoredaCenterCommitteeResponsibility(boolean woredaCenterCommitteeResponsibility) {
        this.woredaCenterCommitteeResponsibility = woredaCenterCommitteeResponsibility;
    }

    public boolean isSubCenterCommitteeResponsibility() {
        return subCenterCommitteeResponsibility;
    }

    public void setSubCenterCommitteeResponsibility(boolean subCenterCommitteeResponsibility) {
        this.subCenterCommitteeResponsibility = subCenterCommitteeResponsibility;
    }

    public boolean isDepartmentCommitteeResponsibility() {
        return departmentCommitteeResponsibility;
    }

    public void setDepartmentCommitteeResponsibility(boolean departmentCommitteeResponsibility) {
        this.departmentCommitteeResponsibility = departmentCommitteeResponsibility;
    }

    public boolean isVoluntaryInOtherDepartment() {
        return VoluntaryInOtherDepartment;
    }

    public void setVoluntaryInOtherDepartment(boolean voluntaryInOtherDepartment) {
        VoluntaryInOtherDepartment = voluntaryInOtherDepartment;
    }

    public boolean isVoluntaryInSelfDepartment() {
        return VoluntaryInSelfDepartment;
    }

    public void setVoluntaryInSelfDepartment(boolean voluntaryInSelfDepartment) {
        VoluntaryInSelfDepartment = voluntaryInSelfDepartment;
    }

    public boolean isMainCenterAttendance() {
        return mainCenterAttendance;
    }

    public void setMainCenterAttendance(boolean mainCenterAttendance) {
        this.mainCenterAttendance = mainCenterAttendance;
    }

    public boolean isMainDepartmentAttendance() {
        return mainDepartmentAttendance;
    }

    public void setMainDepartmentAttendance(boolean mainDepartmentAttendance) {
        this.mainDepartmentAttendance = mainDepartmentAttendance;
    }

    public boolean isWoredaCenterAttendance() {
        return woredaCenterAttendance;
    }

    public void setWoredaCenterAttendance(boolean woredaCenterAttendance) {
        this.woredaCenterAttendance = woredaCenterAttendance;
    }

    public boolean isSubCenterAttendance() {
        return subCenterAttendance;
    }

    public void setSubCenterAttendance(boolean subCenterAttendance) {
        this.subCenterAttendance = subCenterAttendance;
    }

    public boolean isDepartmentAttendance() {
        return departmentAttendance;
    }

    public void setDepartmentAttendance(boolean departmentAttendance) {
        this.departmentAttendance = departmentAttendance;
    }

    public boolean isMainCenterGAAttendance() {
        return mainCenterGAAttendance;
    }

    public void setMainCenterGAAttendance(boolean mainCenterGAAttendance) {
        this.mainCenterGAAttendance = mainCenterGAAttendance;
    }

    public boolean isWoredaCenterGAAttendance() {
        return woredaCenterGAAttendance;
    }

    public void setWoredaCenterGAAttendance(boolean woredaCenterGAAttendance) {
        this.woredaCenterGAAttendance = woredaCenterGAAttendance;
    }

    public boolean isContributeMonthly() {
        return contributeMonthly;
    }

    public void setContributeMonthly(boolean contributeMonthly) {
        this.contributeMonthly = contributeMonthly;
    }
}
