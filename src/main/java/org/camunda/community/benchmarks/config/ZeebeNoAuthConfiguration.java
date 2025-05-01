package org.camunda.community.benchmarks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.camunda.zeebe.client.CredentialsProvider;
import io.camunda.zeebe.client.impl.NoopCredentialsProvider;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("no-auth")
public class ZeebeNoAuthConfiguration {
    /**
     * Replace the SDK’s OAuth provider with a no-op.
     * The bean name *must* match what the starter expects.
     */
    @Bean(name = "camundaClientCredentialsProvider")
    public CredentialsProvider camundaClientCredentialsProvider() {
        return new NoopCredentialsProvider();
    }
}