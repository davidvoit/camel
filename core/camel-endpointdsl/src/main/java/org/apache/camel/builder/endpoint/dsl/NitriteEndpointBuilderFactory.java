/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Used for integrating Camel with Nitrite databases.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NitriteEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Nitrite component.
     */
    public interface NitriteEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedNitriteEndpointConsumerBuilder advanced() {
            return (AdvancedNitriteEndpointConsumerBuilder) this;
        }
        /**
         * Name of Nitrite collection. Cannot be used in combination with
         * repositoryClass option.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NitriteEndpointConsumerBuilder collection(String collection) {
            doSetProperty("collection", collection);
            return this;
        }
        /**
         * Class of Nitrite ObjectRepository. Cannot be used in combination with
         * collection option.
         * 
         * The option is a: <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default NitriteEndpointConsumerBuilder repositoryClass(
                Class<Object> repositoryClass) {
            doSetProperty("repositoryClass", repositoryClass);
            return this;
        }
        /**
         * Class of Nitrite ObjectRepository. Cannot be used in combination with
         * collection option.
         * 
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default NitriteEndpointConsumerBuilder repositoryClass(
                String repositoryClass) {
            doSetProperty("repositoryClass", repositoryClass);
            return this;
        }
        /**
         * Optional name of ObjectRepository. Can be only used in combination
         * with repositoryClass, otherwise have no effect.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NitriteEndpointConsumerBuilder repositoryName(
                String repositoryName) {
            doSetProperty("repositoryName", repositoryName);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default NitriteEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default NitriteEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Password for Nitrite database. Required, if option username
         * specified.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default NitriteEndpointConsumerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username for Nitrite database. Database is not secured if option not
         * specified.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default NitriteEndpointConsumerBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Nitrite component.
     */
    public interface AdvancedNitriteEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default NitriteEndpointConsumerBuilder basic() {
            return (NitriteEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedNitriteEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedNitriteEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedNitriteEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedNitriteEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Nitrite component.
     */
    public interface NitriteEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedNitriteEndpointProducerBuilder advanced() {
            return (AdvancedNitriteEndpointProducerBuilder) this;
        }
        /**
         * Name of Nitrite collection. Cannot be used in combination with
         * repositoryClass option.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NitriteEndpointProducerBuilder collection(String collection) {
            doSetProperty("collection", collection);
            return this;
        }
        /**
         * Class of Nitrite ObjectRepository. Cannot be used in combination with
         * collection option.
         * 
         * The option is a: <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default NitriteEndpointProducerBuilder repositoryClass(
                Class<Object> repositoryClass) {
            doSetProperty("repositoryClass", repositoryClass);
            return this;
        }
        /**
         * Class of Nitrite ObjectRepository. Cannot be used in combination with
         * collection option.
         * 
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default NitriteEndpointProducerBuilder repositoryClass(
                String repositoryClass) {
            doSetProperty("repositoryClass", repositoryClass);
            return this;
        }
        /**
         * Optional name of ObjectRepository. Can be only used in combination
         * with repositoryClass, otherwise have no effect.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NitriteEndpointProducerBuilder repositoryName(
                String repositoryName) {
            doSetProperty("repositoryName", repositoryName);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NitriteEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default NitriteEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Password for Nitrite database. Required, if option username
         * specified.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default NitriteEndpointProducerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username for Nitrite database. Database is not secured if option not
         * specified.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default NitriteEndpointProducerBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Nitrite component.
     */
    public interface AdvancedNitriteEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default NitriteEndpointProducerBuilder basic() {
            return (NitriteEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Nitrite component.
     */
    public interface NitriteEndpointBuilder
            extends
                NitriteEndpointConsumerBuilder, NitriteEndpointProducerBuilder {
        default AdvancedNitriteEndpointBuilder advanced() {
            return (AdvancedNitriteEndpointBuilder) this;
        }
        /**
         * Name of Nitrite collection. Cannot be used in combination with
         * repositoryClass option.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NitriteEndpointBuilder collection(String collection) {
            doSetProperty("collection", collection);
            return this;
        }
        /**
         * Class of Nitrite ObjectRepository. Cannot be used in combination with
         * collection option.
         * 
         * The option is a: <code>java.lang.Class&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: common
         */
        default NitriteEndpointBuilder repositoryClass(
                Class<Object> repositoryClass) {
            doSetProperty("repositoryClass", repositoryClass);
            return this;
        }
        /**
         * Class of Nitrite ObjectRepository. Cannot be used in combination with
         * collection option.
         * 
         * The option will be converted to a
         * <code>java.lang.Class&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: common
         */
        default NitriteEndpointBuilder repositoryClass(String repositoryClass) {
            doSetProperty("repositoryClass", repositoryClass);
            return this;
        }
        /**
         * Optional name of ObjectRepository. Can be only used in combination
         * with repositoryClass, otherwise have no effect.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default NitriteEndpointBuilder repositoryName(String repositoryName) {
            doSetProperty("repositoryName", repositoryName);
            return this;
        }
        /**
         * Password for Nitrite database. Required, if option username
         * specified.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default NitriteEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username for Nitrite database. Database is not secured if option not
         * specified.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default NitriteEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Nitrite component.
     */
    public interface AdvancedNitriteEndpointBuilder
            extends
                AdvancedNitriteEndpointConsumerBuilder, AdvancedNitriteEndpointProducerBuilder {
        default NitriteEndpointBuilder basic() {
            return (NitriteEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedNitriteEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Nitrite (camel-nitrite)
     * Used for integrating Camel with Nitrite databases.
     * 
     * Category: database,nosql
     * Available as of version: 3.0
     * Maven coordinates: org.apache.camel:camel-nitrite
     * 
     * Syntax: <code>nitrite:database</code>
     * 
     * Path parameter: database (required)
     * Path to database file. Will be created if not exists.
     */
    default NitriteEndpointBuilder nitrite(String path) {
        class NitriteEndpointBuilderImpl extends AbstractEndpointBuilder implements NitriteEndpointBuilder, AdvancedNitriteEndpointBuilder {
            public NitriteEndpointBuilderImpl(String path) {
                super("nitrite", path);
            }
        }
        return new NitriteEndpointBuilderImpl(path);
    }
}