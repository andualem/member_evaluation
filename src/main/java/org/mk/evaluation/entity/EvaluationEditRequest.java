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
    private MemberEvaluation memberEvaluation;

    @ManyToOne
    @JoinColumn(name = "edit_requestor_id")
    private Member editRequestor;

    private long requestDate;

    private String reason;

    private int requestStatus; // requested - 1, rejected - 2, approved - 3

    @CreatedBy
    private long createdBy;
    @LastModifiedDate
    private long lastModifiedDate;
    @LastModifiedBy
    private long lastModifiedBy;

    public Member getEditRequestor() {
        return editRequestor;
    }

    public void setEditRequestor(Member editRequestor) {
        this.editRequestor = editRequestor;
    }

    public MemberEvaluation getMemberEvaluation() {
        return memberEvaluation;
    }

    public void setMemberEvaluation(MemberEvaluation memberEvaluation) {
        this.memberEvaluation = memberEvaluation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(long requestDate) {
        this.requestDate = requestDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(int requestStatus) {
        this.requestStatus = requestStatus;
    }
}
