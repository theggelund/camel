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
 * The caffeine-loadcache component is used for integration with Caffeine Load
 * Cache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CaffeineLoadCacheEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Caffeine LoadCache component.
     */
    public interface CaffeineLoadCacheEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder advanced() {
            return (AdvancedCaffeineLoadCacheEndpointConsumerBuilder) this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default CaffeineLoadCacheEndpointConsumerBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default CaffeineLoadCacheEndpointConsumerBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
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
        default CaffeineLoadCacheEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default CaffeineLoadCacheEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Caffeine LoadCache
     * component.
     */
    public interface AdvancedCaffeineLoadCacheEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default CaffeineLoadCacheEndpointConsumerBuilder basic() {
            return (CaffeineLoadCacheEndpointConsumerBuilder) this;
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
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
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
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
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
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
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
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder keyType(
                String keyType) {
            setProperty("keyType", keyType);
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
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
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
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointConsumerBuilder valueType(
                String valueType) {
            setProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Caffeine LoadCache component.
     */
    public interface CaffeineLoadCacheEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedCaffeineLoadCacheEndpointProducerBuilder advanced() {
            return (AdvancedCaffeineLoadCacheEndpointProducerBuilder) this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default CaffeineLoadCacheEndpointProducerBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default CaffeineLoadCacheEndpointProducerBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder action(String action) {
            setProperty("action", action);
            return this;
        }
        /**
         * To configure an already instantiated cache to be used.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.LoadingCache</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder cache(Object cache) {
            setProperty("cache", cache);
            return this;
        }
        /**
         * To configure an already instantiated cache to be used.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.LoadingCache</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder cache(String cache) {
            setProperty("cache", cache);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder cacheLoader(
                Object cacheLoader) {
            setProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder cacheLoader(
                String cacheLoader) {
            setProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * 
         * The option is a:
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder evictionType(
                EvictionType evictionType) {
            setProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder evictionType(
                String evictionType) {
            setProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder expireAfterAccessTime(
                int expireAfterAccessTime) {
            setProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder expireAfterAccessTime(
                String expireAfterAccessTime) {
            setProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder expireAfterWriteTime(
                int expireAfterWriteTime) {
            setProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder expireAfterWriteTime(
                String expireAfterWriteTime) {
            setProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Set the initial Capacity for the cache.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder initialCapacity(
                int initialCapacity) {
            setProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * Set the initial Capacity for the cache.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder initialCapacity(
                String initialCapacity) {
            setProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder key(Object key) {
            setProperty("key", key);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option will be converted to a <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder key(String key) {
            setProperty("key", key);
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
        default CaffeineLoadCacheEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
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
        default CaffeineLoadCacheEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set the maximum size for the cache.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder maximumSize(
                int maximumSize) {
            setProperty("maximumSize", maximumSize);
            return this;
        }
        /**
         * Set the maximum size for the cache.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder maximumSize(
                String maximumSize) {
            setProperty("maximumSize", maximumSize);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder removalListener(
                Object removalListener) {
            setProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder removalListener(
                String removalListener) {
            setProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder statsCounter(
                Object statsCounter) {
            setProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * 
         * The option will be converted to a
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder statsCounter(
                String statsCounter) {
            setProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * To enable stats on the cache.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder statsEnabled(
                boolean statsEnabled) {
            setProperty("statsEnabled", statsEnabled);
            return this;
        }
        /**
         * To enable stats on the cache.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default CaffeineLoadCacheEndpointProducerBuilder statsEnabled(
                String statsEnabled) {
            setProperty("statsEnabled", statsEnabled);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Caffeine LoadCache
     * component.
     */
    public interface AdvancedCaffeineLoadCacheEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default CaffeineLoadCacheEndpointProducerBuilder basic() {
            return (CaffeineLoadCacheEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedCaffeineLoadCacheEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointProducerBuilder keyType(
                String keyType) {
            setProperty("keyType", keyType);
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
        default AdvancedCaffeineLoadCacheEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
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
        default AdvancedCaffeineLoadCacheEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointProducerBuilder valueType(
                String valueType) {
            setProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Caffeine LoadCache component.
     */
    public interface CaffeineLoadCacheEndpointBuilder
            extends
                CaffeineLoadCacheEndpointConsumerBuilder, CaffeineLoadCacheEndpointProducerBuilder {
        default AdvancedCaffeineLoadCacheEndpointBuilder advanced() {
            return (AdvancedCaffeineLoadCacheEndpointBuilder) this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default CaffeineLoadCacheEndpointBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default CaffeineLoadCacheEndpointBuilder createCacheIfNotExist(
                String createCacheIfNotExist) {
            setProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Caffeine LoadCache component.
     */
    public interface AdvancedCaffeineLoadCacheEndpointBuilder
            extends
                AdvancedCaffeineLoadCacheEndpointConsumerBuilder, AdvancedCaffeineLoadCacheEndpointProducerBuilder {
        default CaffeineLoadCacheEndpointBuilder basic() {
            return (CaffeineLoadCacheEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedCaffeineLoadCacheEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder keyType(String keyType) {
            setProperty("keyType", keyType);
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
        default AdvancedCaffeineLoadCacheEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
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
        default AdvancedCaffeineLoadCacheEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedCaffeineLoadCacheEndpointBuilder valueType(
                String valueType) {
            setProperty("valueType", valueType);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.caffeine.EvictionType</code> enum.
     */
    enum EvictionType {
        size_based,
        time_based;
    }
    /**
     * Caffeine LoadCache (camel-caffeine)
     * The caffeine-loadcache component is used for integration with Caffeine
     * Load Cache.
     * 
     * Category: cache,datagrid,clustering
     * Available as of version: 2.20
     * Maven coordinates: org.apache.camel:camel-caffeine
     * 
     * Syntax: <code>caffeine-loadcache:cacheName</code>
     * 
     * Path parameter: cacheName (required)
     * the cache name
     */
    default CaffeineLoadCacheEndpointBuilder caffeineLoadCache(String path) {
        class CaffeineLoadCacheEndpointBuilderImpl extends AbstractEndpointBuilder implements CaffeineLoadCacheEndpointBuilder, AdvancedCaffeineLoadCacheEndpointBuilder {
            public CaffeineLoadCacheEndpointBuilderImpl(String path) {
                super("caffeine-loadcache", path);
            }
        }
        return new CaffeineLoadCacheEndpointBuilderImpl(path);
    }
}