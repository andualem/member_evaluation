package org.mk.evaluation.entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getIsCurrentDepartement() {
        return isCurrentDepartement;
    }

    public void setIsCurrentDepartement(int isCurrentDepartement) {
        this.isCurrentDepartement = isCurrentDepartement;
    }
}
