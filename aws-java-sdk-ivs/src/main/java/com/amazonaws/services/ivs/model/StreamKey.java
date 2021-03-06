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

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying a stream key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StreamKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Stream-key ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Stream-key value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Channel ARN for the stream.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Stream-key ARN.
     * </p>
     * 
     * @param arn
     *        Stream-key ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Stream-key ARN.
     * </p>
     * 
     * @return Stream-key ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Stream-key ARN.
     * </p>
     * 
     * @param arn
     *        Stream-key ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamKey withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Stream-key value.
     * </p>
     * 
     * @param value
     *        Stream-key value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Stream-key value.
     * </p>
     * 
     * @return Stream-key value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Stream-key value.
     * </p>
     * 
     * @param value
     *        Stream-key value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamKey withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Channel ARN for the stream.
     * </p>
     * 
     * @param channelArn
     *        Channel ARN for the stream.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * Channel ARN for the stream.
     * </p>
     * 
     * @return Channel ARN for the stream.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * Channel ARN for the stream.
     * </p>
     * 
     * @param channelArn
     *        Channel ARN for the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamKey withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>
     * </p>
     * 
     * @return Array of 1-50 maps, each of the form <code>string:string (key:value)</code>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamKey withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StreamKey#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StreamKey addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamKey clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamKey == false)
            return false;
        StreamKey other = (StreamKey) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StreamKey clone() {
        try {
            return (StreamKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.StreamKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
