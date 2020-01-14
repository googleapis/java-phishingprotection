/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.phishingprotection.v1beta1;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.phishingprotection.v1beta1.ProjectName;
import com.google.phishingprotection.v1beta1.ReportPhishingRequest;
import com.google.phishingprotection.v1beta1.ReportPhishingResponse;
import com.google.protobuf.AbstractMessage;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class PhishingProtectionServiceV1Beta1ClientTest {
  private static MockPhishingProtectionServiceV1Beta1 mockPhishingProtectionServiceV1Beta1;
  private static MockServiceHelper serviceHelper;
  private PhishingProtectionServiceV1Beta1Client client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockPhishingProtectionServiceV1Beta1 = new MockPhishingProtectionServiceV1Beta1();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockPhishingProtectionServiceV1Beta1));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    PhishingProtectionServiceV1Beta1Settings settings =
        PhishingProtectionServiceV1Beta1Settings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = PhishingProtectionServiceV1Beta1Client.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void reportPhishingTest() {
    ReportPhishingResponse expectedResponse = ReportPhishingResponse.newBuilder().build();
    mockPhishingProtectionServiceV1Beta1.addResponse(expectedResponse);

    ProjectName parent = ProjectName.of("[PROJECT]");
    String uri = "uri116076";

    ReportPhishingResponse actualResponse = client.reportPhishing(parent, uri);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockPhishingProtectionServiceV1Beta1.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ReportPhishingRequest actualRequest = (ReportPhishingRequest) actualRequests.get(0);

    Assert.assertEquals(parent, ProjectName.parse(actualRequest.getParent()));
    Assert.assertEquals(uri, actualRequest.getUri());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void reportPhishingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockPhishingProtectionServiceV1Beta1.addException(exception);

    try {
      ProjectName parent = ProjectName.of("[PROJECT]");
      String uri = "uri116076";

      client.reportPhishing(parent, uri);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
