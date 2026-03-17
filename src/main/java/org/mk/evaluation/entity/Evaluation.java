package org.mk.evaluation.entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "Evaluation")
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "evaluation_round_id")
    private EvaluationRound evaluationRound;

    @ManyToOne
    @JoinColumn(name = "evaluator_id")
    private Member evaluator;

    //Participation related
    private Boolean prayerParticipation;
    private Boolean mainCenterParticipation;
    private Boolean mainDepartmentParticipation;
    private Boolean woredaCenterParticipation;
    private Boolean subCenterParticipation;
    private Boolean departmentParticipation;

    //Responsibility related
    private Boolean mainCenterResponsibility;
    private Boolean mainDepartmentResponsibility;
    private Boolean woredaCenterResponsibility;
    private Boolean subCenterResponsibility;
    private Boolean departmentResponsibility;

    //Committee Responsibility related
    private Boolean mainCenterCommitteeResponsibility;
    private Boolean mainDepartmentCommitteeResponsibility;
    private Boolean woredaCenterCommitteeResponsibility;
    private Boolean subCenterCommitteeResponsibility;
    private Boolean departmentCommitteeResponsibility;

    //Self motivation
    private Boolean VoluntaryInOtherDepartment;
    private Boolean VoluntaryInSelfDepartment;

    //Attendance
    private Boolean mainCenterAttendance;
    private Boolean mainDepartmentAttendance;
    private Boolean woredaCenterAttendance;
    private Boolean subCenterAttendance;
    private Boolean departmentAttendance;

    //General Assembly Meeting attendance
    private Boolean mainCenterGAAttendance;
    private Boolean woredaCenterGAAttendance;

    //Contribution
    private Boolean contributeMonthly;

    @CreatedBy
    private long createdBy;
    @LastModifiedDate
    private long lastModifiedDate;
    @LastModifiedBy
    private long lastModifiedBy;

    public Member getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(Member evaluator) {
        this.evaluator = evaluator;
    }

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

    public Boolean isPrayerParticipation() {
        return prayerParticipation;
    }

    public void setPrayerParticipation(Boolean prayerParticipation) {
        this.prayerParticipation = prayerParticipation;
    }

    public Boolean isMainCenterParticipation() {
        return mainCenterParticipation;
    }

    public void setMainCenterParticipation(Boolean mainCenterParticipation) {
        this.mainCenterParticipation = mainCenterParticipation;
    }

    public Boolean isMainDepartmentParticipation() {
        return mainDepartmentParticipation;
    }

    public void setMainDepartmentParticipation(Boolean mainDepartmentParticipation) {
        this.mainDepartmentParticipation = mainDepartmentParticipation;
    }

    public Boolean isWoredaCenterParticipation() {
        return woredaCenterParticipation;
    }

    public void setWoredaCenterParticipation(Boolean woredaCenterParticipation) {
        this.woredaCenterParticipation = woredaCenterParticipation;
    }

    public Boolean isSubCenterParticipation() {
        return subCenterParticipation;
    }

    public void setSubCenterParticipation(Boolean subCenterParticipation) {
        this.subCenterParticipation = subCenterParticipation;
    }

    public Boolean isDepartmentParticipation() {
        return departmentParticipation;
    }

    public void setDepartmentParticipation(Boolean departmentParticipation) {
        this.departmentParticipation = departmentParticipation;
    }

    public Boolean isMainCenterResponsibility() {
        return mainCenterResponsibility;
    }

    public void setMainCenterResponsibility(Boolean mainCenterResponsibility) {
        this.mainCenterResponsibility = mainCenterResponsibility;
    }

    public Boolean isMainDepartmentResponsibility() {
        return mainDepartmentResponsibility;
    }

    public void setMainDepartmentResponsibility(Boolean mainDepartmentResponsibility) {
        this.mainDepartmentResponsibility = mainDepartmentResponsibility;
    }

    public Boolean isWoredaCenterResponsibility() {
        return woredaCenterResponsibility;
    }

    public void setWoredaCenterResponsibility(Boolean woredaCenterResponsibility) {
        this.woredaCenterResponsibility = woredaCenterResponsibility;
    }

    public Boolean isSubCenterResponsibility() {
        return subCenterResponsibility;
    }

    public void setSubCenterResponsibility(Boolean subCenterResponsibility) {
        this.subCenterResponsibility = subCenterResponsibility;
    }

    public Boolean isDepartmentResponsibility() {
        return departmentResponsibility;
    }

    public void setDepartmentResponsibility(Boolean departmentResponsibility) {
        this.departmentResponsibility = departmentResponsibility;
    }

    public Boolean isMainCenterCommitteeResponsibility() {
        return mainCenterCommitteeResponsibility;
    }

    public void setMainCenterCommitteeResponsibility(Boolean mainCenterCommitteeResponsibility) {
        this.mainCenterCommitteeResponsibility = mainCenterCommitteeResponsibility;
    }

    public Boolean isMainDepartmentCommitteeResponsibility() {
        return mainDepartmentCommitteeResponsibility;
    }

    public void setMainDepartmentCommitteeResponsibility(Boolean mainDepartmentCommitteeResponsibility) {
        this.mainDepartmentCommitteeResponsibility = mainDepartmentCommitteeResponsibility;
    }

    public Boolean isWoredaCenterCommitteeResponsibility() {
        return woredaCenterCommitteeResponsibility;
    }

    public void setWoredaCenterCommitteeResponsibility(Boolean woredaCenterCommitteeResponsibility) {
        this.woredaCenterCommitteeResponsibility = woredaCenterCommitteeResponsibility;
    }

    public Boolean isSubCenterCommitteeResponsibility() {
        return subCenterCommitteeResponsibility;
    }

    public void setSubCenterCommitteeResponsibility(Boolean subCenterCommitteeResponsibility) {
        this.subCenterCommitteeResponsibility = subCenterCommitteeResponsibility;
    }

    public Boolean isDepartmentCommitteeResponsibility() {
        return departmentCommitteeResponsibility;
    }

    public void setDepartmentCommitteeResponsibility(Boolean departmentCommitteeResponsibility) {
        this.departmentCommitteeResponsibility = departmentCommitteeResponsibility;
    }

    public Boolean isVoluntaryInOtherDepartment() {
        return VoluntaryInOtherDepartment;
    }

    public void setVoluntaryInOtherDepartment(Boolean voluntaryInOtherDepartment) {
        VoluntaryInOtherDepartment = voluntaryInOtherDepartment;
    }

    public Boolean isVoluntaryInSelfDepartment() {
        return VoluntaryInSelfDepartment;
    }

    public void setVoluntaryInSelfDepartment(Boolean voluntaryInSelfDepartment) {
        VoluntaryInSelfDepartment = voluntaryInSelfDepartment;
    }

    public Boolean isMainCenterAttendance() {
        return mainCenterAttendance;
    }

    public void setMainCenterAttendance(Boolean mainCenterAttendance) {
        this.mainCenterAttendance = mainCenterAttendance;
    }

    public Boolean isMainDepartmentAttendance() {
        return mainDepartmentAttendance;
    }

    public void setMainDepartmentAttendance(Boolean mainDepartmentAttendance) {
        this.mainDepartmentAttendance = mainDepartmentAttendance;
    }

    public Boolean isWoredaCenterAttendance() {
        return woredaCenterAttendance;
    }

    public void setWoredaCenterAttendance(Boolean woredaCenterAttendance) {
        this.woredaCenterAttendance = woredaCenterAttendance;
    }

    public Boolean isSubCenterAttendance() {
        return subCenterAttendance;
    }

    public void setSubCenterAttendance(Boolean subCenterAttendance) {
        this.subCenterAttendance = subCenterAttendance;
    }

    public Boolean isDepartmentAttendance() {
        return departmentAttendance;
    }

    public void setDepartmentAttendance(Boolean departmentAttendance) {
        this.departmentAttendance = departmentAttendance;
    }

    public Boolean isMainCenterGAAttendance() {
        return mainCenterGAAttendance;
    }

    public void setMainCenterGAAttendance(Boolean mainCenterGAAttendance) {
        this.mainCenterGAAttendance = mainCenterGAAttendance;
    }

    public Boolean isWoredaCenterGAAttendance() {
        return woredaCenterGAAttendance;
    }

    public void setWoredaCenterGAAttendance(Boolean woredaCenterGAAttendance) {
        this.woredaCenterGAAttendance = woredaCenterGAAttendance;
    }

    public Boolean isContributeMonthly() {
        return contributeMonthly;
    }

    public void setContributeMonthly(Boolean contributeMonthly) {
        this.contributeMonthly = contributeMonthly;
    }
}
