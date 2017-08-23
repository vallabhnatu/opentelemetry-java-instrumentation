package com.datadoghq.trace.agent.integration;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

public class ApacheHTTPClientTest {

  @Test
  public void test() throws Exception {

    final HttpClientBuilder builder = HttpClientBuilder.create();
    assertThat(builder.getClass().getSimpleName()).isEqualTo("TracingHttpClientBuilder");
  }
}
