/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete.build4.contact;

import com.kevin.contact.obsolete.build4.connector.Relation;
import com.kevin.contact.obsolete.build4.connector.RelationshipType;

import java.io.Serializable;

/**
 * @Program
 * @ClassName Relationship
 * @Description TODO 提供关系类型
 * @Author Kevin KDA
 * @Date 2019-10-04 14:12
 * @Interface
 * @Enum
 * @Modified By
 * @Version 1.0
 * @University HBUT
 * @Administrative Class 17GB CST 3
 */
public class Relationship extends PersonalInformation implements Relation, Serializable {
    private RelationshipType relationshipType;
    private String strRelationalValue;
    private String strCity;
    private String strRelation;
    private String strBusinessType;

    public Relationship() {
    }

    public Relationship(String strName) {
        super(strName);
    }

    public Relationship(String strName, int intSex, int intHeight) {
        super(strName, intSex, intHeight);
    }

    public Relationship(String strName, String strPhone) {
        super(strName, strPhone);
    }

    public Relationship(String strName, String strPhone, String strAdd) {
        super(strName, strPhone, strAdd);
    }

    public Relationship(String strName, int intSex, int intHeight, String strPhone, String strAdd) {
        super(strName, intSex, intHeight, strPhone, strAdd);
    }

    public Relationship(String strName, int intSex, int intHeight, String strPhone, String strAdd, RelationshipType relationshipType, String strRelationalValue) {
        super(strName, intSex, intHeight, strPhone, strAdd);
        this.relationshipType = relationshipType;
        this.strRelationalValue = strRelationalValue;
    }

    public Relationship(String strName, int intSex, int intHeight, String strPhone, String strAdd, RelationshipType relationshipType, String strRelationalValue, String strCity, String strRelation, String strBusinessType) {
        super(strName, intSex, intHeight, strPhone, strAdd);
        this.relationshipType = relationshipType;
        this.strRelationalValue = strRelationalValue;
        this.strCity = strCity;
        this.strRelation = strRelation;
        this.strBusinessType = strBusinessType;
    }

    @Override
    public void setRelationship(RelationshipType relationshipType, String strRelationalValue) {
        setRelationshipType(relationshipType);
        setStrRelationalValue(strRelationalValue);
    }

    @Override
    public void setRelationship(RelationshipType relationshipType, String strCity, String strRelation, String strBusinessType) {
        setRelationshipType(relationshipType);
        setStrCity(strCity);
        setStrRelation(strRelation);
        setStrBusinessType(strBusinessType);
    }

    @Override
    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    @Override
    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    @Override
    public String getStrRelationalValue() {
        return strRelationalValue;
    }

    @Override
    public void setStrRelationalValue(String strRelationalValue) {
        this.strRelationalValue = strRelationalValue;
    }

    @Override
    public String getStrCity() {
        return strCity;
    }

    @Override
    public void setStrCity(String strCity) {
        this.strCity = strCity;
    }

    @Override
    public String getStrRelation() {
        return strRelation;
    }

    @Override
    public void setStrRelation(String strRelation) {
        this.strRelation = strRelation;
    }

    @Override
    public String getStrBusinessType() {
        return strBusinessType;
    }

    @Override
    public void setStrBusinessType(String strBusinessType) {
        this.strBusinessType = strBusinessType;
    }
}
