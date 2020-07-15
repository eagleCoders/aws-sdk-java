/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ivs.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.ivs.model.AmazonIVSException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Updating or deleting a resource can cause an inconsistent state.
     * </p>
     */
    private String exceptionMessage;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * Updating or deleting a resource can cause an inconsistent state.
     * </p>
     * 
     * @param exceptionMessage
     *        Updating or deleting a resource can cause an inconsistent state.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("exceptionMessage")
    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    /**
     * <p>
     * Updating or deleting a resource can cause an inconsistent state.
     * </p>
     * 
     * @return Updating or deleting a resource can cause an inconsistent state.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("exceptionMessage")
    public String getExceptionMessage() {
        return this.exceptionMessage;
    }

    /**
     * <p>
     * Updating or deleting a resource can cause an inconsistent state.
     * </p>
     * 
     * @param exceptionMessage
     *        Updating or deleting a resource can cause an inconsistent state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withExceptionMessage(String exceptionMessage) {
        setExceptionMessage(exceptionMessage);
        return this;
    }

}
