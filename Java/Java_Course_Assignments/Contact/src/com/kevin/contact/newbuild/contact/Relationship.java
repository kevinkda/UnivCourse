/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.contact;

import com.kevin.contact.newbuild.connecter.Relation;
import com.kevin.contact.newbuild.connecter.RelationshipType;

import java.io.Serializable;

/**
 * @author Kevin KDA on 2019/10/24 12:45
 * @version 1.1
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.contact
 * @classname Relationship
 * @description TODO 提供好友关系信息
 * @interface/enum Serializable, Relation / RelationshipType
 */
public class Relationship extends PersonalInformation implements Serializable, Relation {
    /**
     * Serializable参数
     */
    private static final long serialVersionUID = 5572849244583892096L;
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

    /**
     * @param [relationshipType, strRelationalValue]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:56
     * @description Relationship / setRelationship TODO
     * @returns void
     */
    @Override
    public void setRelationship(RelationshipType relationshipType, String strRelationalValue) {
        setRelationshipType(relationshipType);
        setStrRelationalValue(strRelationalValue);
    }

    /**
     * @param [relationshipType, strCity, strRelation, strBusinessType]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:56
     * @description Relationship / setRelationship TODO
     * @returns void
     */
    @Override
    public void setRelationship(RelationshipType relationshipType, String strCity, String strRelation, String strBusinessType) {
        setRelationshipType(relationshipType);
        setStrCity(strCity);
        setStrRelation(strRelation);
        setStrBusinessType(strBusinessType);
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 12:56
     * @description Relationship / getRelationshipType TODO
     * @returns com.kevin.contact.newbuild.connecter.RelationshipType
     */
    @Override
    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    /**
     * @param [relationshipType]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:56
     * @description Relationship / setRelationshipType TODO
     * @returns void
     */
    @Override
    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 13:02
     * @description Relationship / getStrRelationalValue TODO
     * @returns java.lang.String
     */
    @Override
    public String getStrRelationalValue() {
        return strRelationalValue;
    }

    /**
     * @param [strRelationalValue]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:57
     * @description Relationship / setStrRelationalValue TODO
     * @returns void
     */
    @Override
    public void setStrRelationalValue(String strRelationalValue) {
        this.strRelationalValue = strRelationalValue;
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 12:57
     * @description Relationship / getStrCity TODO
     * @returns java.lang.String
     */
    @Override
    public String getStrCity() {
        return strCity;
    }

    /**
     * @param [strCity]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:57
     * @description Relationship / setStrCity TODO
     * @returns void
     */
    @Override
    public void setStrCity(String strCity) {
        this.strCity = strCity;
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 12:57
     * @description Relationship / getStrRelation TODO
     * @returns java.lang.String
     */
    @Override
    public String getStrRelation() {
        return strRelation;
    }

    /**
     * @param [strRelation]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:57
     * @description Relationship / setStrRelation TODO
     * @returns void
     */
    @Override
    public void setStrRelation(String strRelation) {
        this.strRelation = strRelation;
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 12:56
     * @description Relationship / getStrBusinessType TODO
     * @returns java.lang.String
     */
    @Override
    public String getStrBusinessType() {
        return strBusinessType;
    }

    /**
     * @param [strBusinessType]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:56
     * @description Relationship / setStrBusinessType TODO
     * @returns void
     */
    @Override
    public void setStrBusinessType(String strBusinessType) {
        this.strBusinessType = strBusinessType;
    }
}
