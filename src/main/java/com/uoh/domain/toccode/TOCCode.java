package com.uoh.domain.toccode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * com.uoh.domain.toccode.TOCCode Class will be used to hold the variety of Train Operating Companies.
 *
 * Company Name is the name of the Train Operating Company
 * Business Code is a two-character code used within the TRUST system. It is used in the names of the individual train movement feeds.
 * Sector Code is the sector code used to represent the TOC in TRUST messages.
 * ATOC Code is a two-character code used to representing the TOC in the SCHEDULE feed. Freight trains are represented by an ATOC code of ZZ.
 *
 * Created by James Millner on 07/10/2016 at 10:16.
 */
@Entity
public class TOCCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String companyName;

    private String businessCode;

    private Integer numericCode;

    private String ATOC_code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public Integer getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
    }

    public String getATOC_code() {
        return ATOC_code;
    }

    public void setATOC_code(String ATOC_code) {
        this.ATOC_code = ATOC_code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TOCCode)) return false;

        TOCCode tocCode = (TOCCode) o;

        if (!id.equals(tocCode.id)) return false;
        if (!companyName.equals(tocCode.companyName)) return false;
        if (!businessCode.equals(tocCode.businessCode)) return false;
        if (!numericCode.equals(tocCode.numericCode)) return false;
        return ATOC_code.equals(tocCode.ATOC_code);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + companyName.hashCode();
        result = 31 * result + businessCode.hashCode();
        result = 31 * result + numericCode.hashCode();
        result = 31 * result + ATOC_code.hashCode();
        return result;
    }
}
