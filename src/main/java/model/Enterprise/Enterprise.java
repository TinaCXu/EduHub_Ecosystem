/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import java.util.ArrayList;
import java.util.List;
import model.Country.Country;
import model.Org.Organization;
import model.UserAccount.UserAccount;

/**
 *
 * @author aprilyz
 */
public class Enterprise {
     private String name;
     private Country country;
     private Enterprise.EtprType etprType;
     private UserAccount enterpriseAdmin;
     public List<Organization> orgList;
     
     public enum EtprType{
        School,
        Charity,
        Company,
        UnitedEduOrg;
    }

    public Enterprise() {
        orgList = new ArrayList();
    }
     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public EtprType getEtprType() {
        return etprType;
    }

    public void setEtprType(EtprType etprType) {
        this.etprType = etprType;
    }

    public UserAccount getEnterpriseAdmin() {
        return enterpriseAdmin;
    }

    public void setEnterpriseAdmin(UserAccount enterpriseAdmin) {
        this.enterpriseAdmin = enterpriseAdmin;
    }
    
    
    public static Enterprise.EtprType getEtprTypeByName(String name) {
        return Enum.valueOf(Enterprise.EtprType.class, name);
    }
     
    @Override
    public String toString() {
        return name;
    }
    
}
