/**
 * Copyright 2015 Huawei Technologies Co., Ltd. All rights reserved.
 * eSDK is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   
 * http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huawei.esdk.ivs.test.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.ivs.test.service.impl.autogen.Adapter3;

/**
 * <p>Java class for RecordInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indexRange" type="{esdk_ivs_professional_server}IndexRange"/>
 *         &lt;element name="reserve" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordInfoList" type="{esdk_ivs_professional_server}RecordInfoList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordInfos", propOrder = {
    "total",
    "indexRange",
    "reserve",
    "recordInfoList"
})
public class RecordInfos {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer total;
    @XmlElement(required = true)
    protected IndexRange indexRange;
    @XmlElement(required = true)
    protected String reserve;
    @XmlElement(required = true)
    protected RecordInfoList recordInfoList;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

    /**
     * Gets the value of the indexRange property.
     * 
     * @return
     *     possible object is
     *     {@link IndexRange }
     *     
     */
    public IndexRange getIndexRange() {
        return indexRange;
    }

    /**
     * Sets the value of the indexRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexRange }
     *     
     */
    public void setIndexRange(IndexRange value) {
        this.indexRange = value;
    }

    /**
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserve(String value) {
        this.reserve = value;
    }

    /**
     * Gets the value of the recordInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordInfoList }
     *     
     */
    public RecordInfoList getRecordInfoList() {
        return recordInfoList;
    }

    /**
     * Sets the value of the recordInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordInfoList }
     *     
     */
    public void setRecordInfoList(RecordInfoList value) {
        this.recordInfoList = value;
    }

}
