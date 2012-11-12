
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReplicateFullSocialDataResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "replicateFullSocialDataResult"
})
@XmlRootElement(name = "ReplicateFullSocialDataResponse")
public class ReplicateFullSocialDataResponse {

    @XmlElement(name = "ReplicateFullSocialDataResult")
    protected boolean replicateFullSocialDataResult;

    /**
     * Gets the value of the replicateFullSocialDataResult property.
     * 
     */
    public boolean isReplicateFullSocialDataResult() {
        return replicateFullSocialDataResult;
    }

    /**
     * Sets the value of the replicateFullSocialDataResult property.
     * 
     */
    public void setReplicateFullSocialDataResult(boolean value) {
        this.replicateFullSocialDataResult = value;
    }

}