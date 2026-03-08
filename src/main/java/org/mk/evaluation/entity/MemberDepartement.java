package org.mk.evaluation.entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "MemberDepartement")
public class MemberDepartement {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;
    private long startDate;
    private long endDate;
    private int isCurrentDepartement;


    @CreatedBy
    private long createdBy;
    @LastModifiedDate
    private long lastModifiedDate;
    @LastModifiedBy
    private long lastModifiedBy;


    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
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

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public int getIsCurrentDepartement() {
        return isCurrentDepartement;
    }

    public void setIsCurrentDepartement(int isCurrentDepartement) {
        this.isCurrentDepartement = isCurrentDepartement;
    }
}
