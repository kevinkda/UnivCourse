/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete.build4.connector;

/**
 * Title
 *
 * @Author Kevin KDA
 * @Date 2019-10-04 14:02
 * @Description //TODO
 * @Params
 * @Return
 */
public interface Relation {
    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:47
     * @Description //TODO
     * @Params [relationshipType, strRelationalValue]
     * @Return void
     */
    public void setRelationship(RelationshipType relationshipType, String strRelationalValue);

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:48
     * @Description //TODO
     * @Params [relationshipType, strCity, strRelation, strBusinessType]
     * @Return void
     */
    public void setRelationship(RelationshipType relationshipType, String strCity, String strRelation, String strBusinessType);

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:48
     * @Description //TODO
     * @Params []
     * @Return com.kevin.contact.newbuild.connector.RelationshipType
     */
    public RelationshipType getRelationshipType();

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:48
     * @Description //TODO
     * @Params [relationshipType]
     * @Return void
     */
    public void setRelationshipType(RelationshipType relationshipType);

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:48
     * @Description //TODO
     * @Params []
     * @Return java.lang.String
     */
    public String getStrRelationalValue();

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:48
     * @Description //TODO
     * @Params [strRelationalValue]
     * @Return void
     */
    public void setStrRelationalValue(String strRelationalValue);

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:48
     * @Description //TODO
     * @Params []
     * @Return java.lang.String
     */
    public String getStrCity();

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:48
     * @Description //TODO
     * @Params [strCity]
     * @Return void
     */
    public void setStrCity(String strCity);

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:48
     * @Description //TODO
     * @Params []
     * @Return java.lang.String
     */
    public String getStrRelation();

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:49
     * @Description //TODO
     * @Params [strRelation]
     * @Return void
     */
    public void setStrRelation(String strRelation);

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 15:49
     * @Description //TODO
     * @Params []
     * @Return java.lang.String
     */
    public String getStrBusinessType();

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 16:00
     * @Description //TODO
     * @Params [strBusinessType]
     * @Return void
     */
    public void setStrBusinessType(String strBusinessType);
}
