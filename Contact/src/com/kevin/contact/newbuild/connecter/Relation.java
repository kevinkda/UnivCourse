/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.connecter;

/**
 * @author Kevin KDA on 2019/10/24 12:46
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.connecter
 * @classname Relation
 * @description TODO
 * @interface/enum
 */
public interface Relation {
    /**
     * @param [relationshipType, strRelationalValue]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:51
     * @description Relation / setRelationship TODO
     * @returns void
     */
    public void setRelationship(RelationshipType relationshipType, String strRelationalValue);

    /**
     * @param [relationshipType, strCity, strRelation, strBusinessType]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:51
     * @description Relation / setRelationship TODO
     * @returns void
     */
    public void setRelationship(RelationshipType relationshipType, String strCity, String strRelation, String strBusinessType);

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 12:51
     * @description Relation / getRelationshipType TODO
     * @returns com.kevin.contact.newbuild.connecter.RelationshipType
     */
    public RelationshipType getRelationshipType();

    /**
     * @param [relationshipType]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:51
     * @description Relation / setRelationshipType TODO
     * @returns void
     */
    public void setRelationshipType(RelationshipType relationshipType);

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 12:51
     * @description Relation / getStrRelationalValue TODO
     * @returns java.lang.String
     */
    public String getStrRelationalValue();

    /**
     * @param [strRelationalValue]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:52
     * @description Relation / setStrRelationalValue TODO
     * @returns void
     */
    public void setStrRelationalValue(String strRelationalValue);

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 12:52
     * @description Relation / getStrCity TODO
     * @returns java.lang.String
     */
    public String getStrCity();

    /**
     * @param [strCity]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:52
     * @description Relation / setStrCity TODO
     * @returns void
     */
    public void setStrCity(String strCity);

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 12:52
     * @description Relation / getStrRelation TODO
     * @returns java.lang.String
     */
    public String getStrRelation();

    /**
     * @param [strRelation]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:52
     * @description Relation / setStrRelation TODO
     * @returns void
     */
    public void setStrRelation(String strRelation);

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 12:52
     * @description Relation / getStrBusinessType TODO
     * @returns java.lang.String
     */
    public String getStrBusinessType();

    /**
     * @param [strBusinessType]
     * @throws
     * @author Kevin KDA on 2019/10/24 12:52
     * @description Relation / setStrBusinessType TODO
     * @returns void
     */
    public void setStrBusinessType(String strBusinessType);

}
