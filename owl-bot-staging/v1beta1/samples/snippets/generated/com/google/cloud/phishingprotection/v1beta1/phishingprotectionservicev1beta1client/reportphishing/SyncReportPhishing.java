/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.phishingprotection.v1beta1.samples;

// [START phishingprotection_v1beta1_generated_phishingprotectionservicev1beta1client_reportphishing_sync]
import com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Client;
import com.google.phishingprotection.v1beta1.ProjectName;
import com.google.phishingprotection.v1beta1.ReportPhishingRequest;
import com.google.phishingprotection.v1beta1.ReportPhishingResponse;

public class SyncReportPhishing {

  public static void main(String[] args) throws Exception {
    syncReportPhishing();
  }

  public static void syncReportPhishing() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (PhishingProtectionServiceV1Beta1Client phishingProtectionServiceV1Beta1Client =
        PhishingProtectionServiceV1Beta1Client.create()) {
      ReportPhishingRequest request =
          ReportPhishingRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setUri("uri116076")
              .build();
      ReportPhishingResponse response =
          phishingProtectionServiceV1Beta1Client.reportPhishing(request);
    }
  }
}
// [END phishingprotection_v1beta1_generated_phishingprotectionservicev1beta1client_reportphishing_sync]
