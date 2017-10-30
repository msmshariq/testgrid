/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.testgrid.reporting;

import org.wso2.carbon.testgrid.common.TestReport;
import org.wso2.carbon.testgrid.common.TestScenario;

/**
 * This class is responsible for generating the test reports.
 *
 * @since 1.0.0
 */
public class TestReportEngine {

    /**
     * Generates a test report based on a given test scenario.
     *
     * @param scenario scenario for which the test report should be generated
     * @return generated test report
     * @throws ReportingException thrown when an error occurs in generating the test report
     */
    public TestReport generateReport(TestScenario scenario) throws ReportingException {
        return null;
    }
}
