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
package com.amazonaws.services.route53.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TestDNSAnswerResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestDNSAnswerResultStaxUnmarshaller implements Unmarshaller<TestDNSAnswerResult, StaxUnmarshallerContext> {

    public TestDNSAnswerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        TestDNSAnswerResult testDNSAnswerResult = new TestDNSAnswerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return testDNSAnswerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Nameserver", targetDepth)) {
                    testDNSAnswerResult.setNameserver(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecordName", targetDepth)) {
                    testDNSAnswerResult.setRecordName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecordType", targetDepth)) {
                    testDNSAnswerResult.setRecordType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecordData", targetDepth)) {
                    testDNSAnswerResult.withRecordData(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("RecordData/RecordDataEntry", targetDepth)) {
                    testDNSAnswerResult.withRecordData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResponseCode", targetDepth)) {
                    testDNSAnswerResult.setResponseCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Protocol", targetDepth)) {
                    testDNSAnswerResult.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return testDNSAnswerResult;
                }
            }
        }
    }

    private static TestDNSAnswerResultStaxUnmarshaller instance;

    public static TestDNSAnswerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestDNSAnswerResultStaxUnmarshaller();
        return instance;
    }
}
