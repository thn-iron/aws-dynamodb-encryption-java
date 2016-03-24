/*
 * Copyright 2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except
 * in compliance with the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.mapper.encryption;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Simple domain class with numeric attributes
 */
@DynamoDBTable(tableName = "aws-java-sdk-util-crypto")
public class NumberAttributeTestClass {

    private String key;
    private int intAttribute;
    private Integer integerAttribute;
    private double doubleAttribute;
    private Double doubleObjectAttribute;
    private float floatAttribute;
    private Float floatObjectAttribute;
    private BigDecimal bigDecimalAttribute;
    private BigInteger bigIntegerAttribute;
    private long longAttribute;
    private Long longObjectAttribute;
    private short shortAttribute;
    private Short shortObjectAttribute;
    private byte byteAttribute;
    private Byte byteObjectAttribute;
    private Date dateAttribute;
    private Calendar calendarAttribute;
    private Boolean booleanObjectAttribute;
    private boolean booleanAttribute;
    private String ignored = "notSent";

    @DynamoDBAutoGeneratedKey
    @DynamoDBHashKey
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getIntAttribute() {
        return intAttribute;
    }

    public void setIntAttribute(int intAttribute) {
        this.intAttribute = intAttribute;
    }

    public Integer getIntegerAttribute() {
        return integerAttribute;
    }

    public void setIntegerAttribute(Integer integerAttribute) {
        this.integerAttribute = integerAttribute;
    }

    public double getDoubleAttribute() {
        return doubleAttribute;
    }

    public void setDoubleAttribute(double doubleAttribute) {
        this.doubleAttribute = doubleAttribute;
    }

    public Double getDoubleObjectAttribute() {
        return doubleObjectAttribute;
    }

    public void setDoubleObjectAttribute(Double doubleObjectAttribute) {
        this.doubleObjectAttribute = doubleObjectAttribute;
    }

    @DynamoDBAttribute
    public float getFloatAttribute() {
        return floatAttribute;
    }

    public void setFloatAttribute(float floatAttribute) {
        this.floatAttribute = floatAttribute;
    }

    public Float getFloatObjectAttribute() {
        return floatObjectAttribute;
    }

    public void setFloatObjectAttribute(Float floatObjectAttribute) {
        this.floatObjectAttribute = floatObjectAttribute;
    }

    public BigDecimal getBigDecimalAttribute() {
        return bigDecimalAttribute;
    }

    public void setBigDecimalAttribute(BigDecimal bigDecimalAttribute) {
        this.bigDecimalAttribute = bigDecimalAttribute;
    }

    public BigInteger getBigIntegerAttribute() {
        return bigIntegerAttribute;
    }

    public void setBigIntegerAttribute(BigInteger bigIntegerAttribute) {
        this.bigIntegerAttribute = bigIntegerAttribute;
    }

    public long getLongAttribute() {
        return longAttribute;
    }

    public void setLongAttribute(long longAttribute) {
        this.longAttribute = longAttribute;
    }

    public Long getLongObjectAttribute() {
        return longObjectAttribute;
    }

    public void setLongObjectAttribute(Long longObjectAttribute) {
        this.longObjectAttribute = longObjectAttribute;
    }

    public byte getByteAttribute() {
        return byteAttribute;
    }

    public void setByteAttribute(byte byteAttribute) {
        this.byteAttribute = byteAttribute;
    }

    public Byte getByteObjectAttribute() {
        return byteObjectAttribute;
    }

    public void setByteObjectAttribute(Byte byteObjectAttribute) {
        this.byteObjectAttribute = byteObjectAttribute;
    }

    public Date getDateAttribute() {
        return dateAttribute;
    }

    public void setDateAttribute(Date dateAttribute) {
        this.dateAttribute = dateAttribute;
    }

    public Calendar getCalendarAttribute() {
        return calendarAttribute;
    }

    public void setCalendarAttribute(Calendar calendarAttribute) {
        this.calendarAttribute = calendarAttribute;
    }

    public Boolean getBooleanObjectAttribute() {
        return booleanObjectAttribute;
    }

    public void setBooleanObjectAttribute(Boolean booleanObjectAttribute) {
        this.booleanObjectAttribute = booleanObjectAttribute;
    }

    public boolean isBooleanAttribute() {
        return booleanAttribute;
    }

    public void setBooleanAttribute(boolean booleanAttribute) {
        this.booleanAttribute = booleanAttribute;
    }

    @DynamoDBIgnore
    public String getIgnored() {
        return ignored;
    }

    public void setIgnored(String ignored) {
        this.ignored = ignored;
    }

    public short getShortAttribute() {
        return shortAttribute;
    }

    public void setShortAttribute(short shortAttribute) {
        this.shortAttribute = shortAttribute;
    }

    public Short getShortObjectAttribute() {
        return shortObjectAttribute;
    }

    public void setShortObjectAttribute(Short shortObjectAttribute) {
        this.shortObjectAttribute = shortObjectAttribute;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bigDecimalAttribute == null) ? 0 : bigDecimalAttribute.hashCode());
        result = prime * result + ((bigIntegerAttribute == null) ? 0 : bigIntegerAttribute.hashCode());
        result = prime * result + (booleanAttribute ? 1231 : 1237);
        result = prime * result + ((booleanObjectAttribute == null) ? 0 : booleanObjectAttribute.hashCode());
        result = prime * result + byteAttribute;
        result = prime * result + ((byteObjectAttribute == null) ? 0 : byteObjectAttribute.hashCode());
        result = prime * result + ((calendarAttribute == null) ? 0 : calendarAttribute.hashCode());
        result = prime * result + ((dateAttribute == null) ? 0 : dateAttribute.hashCode());
        long temp;
        temp = Double.doubleToLongBits(doubleAttribute);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((doubleObjectAttribute == null) ? 0 : doubleObjectAttribute.hashCode());
        result = prime * result + Float.floatToIntBits(floatAttribute);
        result = prime * result + ((floatObjectAttribute == null) ? 0 : floatObjectAttribute.hashCode());
        result = prime * result + ((ignored == null) ? 0 : ignored.hashCode());
        result = prime * result + intAttribute;
        result = prime * result + ((integerAttribute == null) ? 0 : integerAttribute.hashCode());
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + (int) (longAttribute ^ (longAttribute >>> 32));
        result = prime * result + ((longObjectAttribute == null) ? 0 : longObjectAttribute.hashCode());
        result = prime * result + shortAttribute;
        result = prime * result + ((shortObjectAttribute == null) ? 0 : shortObjectAttribute.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        NumberAttributeTestClass other = (NumberAttributeTestClass) obj;
        if ( bigDecimalAttribute == null ) {
            if ( other.bigDecimalAttribute != null )
                return false;
        } else if ( !bigDecimalAttribute.equals(other.bigDecimalAttribute) )
            return false;
        if ( bigIntegerAttribute == null ) {
            if ( other.bigIntegerAttribute != null )
                return false;
        } else if ( !bigIntegerAttribute.equals(other.bigIntegerAttribute) )
            return false;
        if ( booleanAttribute != other.booleanAttribute )
            return false;
        if ( booleanObjectAttribute == null ) {
            if ( other.booleanObjectAttribute != null )
                return false;
        } else if ( !booleanObjectAttribute.equals(other.booleanObjectAttribute) )
            return false;
        if ( byteAttribute != other.byteAttribute )
            return false;
        if ( byteObjectAttribute == null ) {
            if ( other.byteObjectAttribute != null )
                return false;
        } else if ( !byteObjectAttribute.equals(other.byteObjectAttribute) )
            return false;
        if ( calendarAttribute == null ) {
            if ( other.calendarAttribute != null )
                return false;
        } else if ( !calendarAttribute.equals(other.calendarAttribute) )
            return false;
        if ( dateAttribute == null ) {
            if ( other.dateAttribute != null )
                return false;
        } else if ( !dateAttribute.equals(other.dateAttribute) )
            return false;
        if ( Double.doubleToLongBits(doubleAttribute) != Double.doubleToLongBits(other.doubleAttribute) )
            return false;
        if ( doubleObjectAttribute == null ) {
            if ( other.doubleObjectAttribute != null )
                return false;
        } else if ( !doubleObjectAttribute.equals(other.doubleObjectAttribute) )
            return false;
        if ( Float.floatToIntBits(floatAttribute) != Float.floatToIntBits(other.floatAttribute) )
            return false;
        if ( floatObjectAttribute == null ) {
            if ( other.floatObjectAttribute != null )
                return false;
        } else if ( !floatObjectAttribute.equals(other.floatObjectAttribute) )
            return false;
        if ( ignored == null ) {
            if ( other.ignored != null )
                return false;
        } else if ( !ignored.equals(other.ignored) )
            return false;
        if ( intAttribute != other.intAttribute )
            return false;
        if ( integerAttribute == null ) {
            if ( other.integerAttribute != null )
                return false;
        } else if ( !integerAttribute.equals(other.integerAttribute) )
            return false;
        if ( key == null ) {
            if ( other.key != null )
                return false;
        } else if ( !key.equals(other.key) )
            return false;
        if ( longAttribute != other.longAttribute )
            return false;
        if ( longObjectAttribute == null ) {
            if ( other.longObjectAttribute != null )
                return false;
        } else if ( !longObjectAttribute.equals(other.longObjectAttribute) )
            return false;
        if ( shortAttribute != other.shortAttribute )
            return false;
        if ( shortObjectAttribute == null ) {
            if ( other.shortObjectAttribute != null )
                return false;
        } else if ( !shortObjectAttribute.equals(other.shortObjectAttribute) )
            return false;
        return true;
    }

}
