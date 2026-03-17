package org.mk.evaluation.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "EvaluationEditRequest")
public class EvaluationEditRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_evaluation_id")
    private Evaluation evaluation;

    @ManyToOne
    @JoinColumn(name = "edit_requestor_id")
    private Member editRequestor;

    private Long requestDate;

    private String reason;

    private Integer requestStatus; // requested - 1, rejected - 2, approved - 3

    @CreatedBy
    private Long createdBy;
    @LastModifiedDate
    private Long lastModifiedDate;
    @LastModifiedBy
    private Long lastModifiedBy;

    public Member getEditRequestor() {
        return editRequestor;
    }

    public void setEditRequestor(Member editRequestor) {
        this.editRequestor = editRequestor;
    }

    public Evaluation getMemberEvaluation() {
        return evaluation;
    }

    public void setMemberEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Long requestDate) {
        this.requestDate = requestDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(Integer requestStatus) {
        this.requestStatus = requestStatus;
    }
}
