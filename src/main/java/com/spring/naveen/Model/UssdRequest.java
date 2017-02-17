package com.spring.naveen.Model;

import java.util.Date;

/**
 * Created by naveen on 1/24/17.
 */
public class UssdRequest {

    private String sourceAddress;
    private String requestId;
    private int encoding;
    private String applicationId;
    private String message;
    private float version;

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getEncoding() {
        return encoding;
    }

    public void setEncoding(int encoding) {
        this.encoding = encoding;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "UssdRequest{" +
                "sourceAddress='" + sourceAddress + '\'' +
                ", requestId=" + requestId +
                ", encoding=" + encoding +
                ", applicationId='" + applicationId + '\'' +
                ", message='" + message + '\'' +
                ", version=" + version +
                '}';
    }
}
