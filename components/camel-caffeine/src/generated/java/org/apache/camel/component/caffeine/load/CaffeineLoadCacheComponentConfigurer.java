/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.caffeine.load;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CaffeineLoadCacheComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.caffeine.CaffeineConfiguration getOrCreateConfiguration(CaffeineLoadCacheComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.caffeine.CaffeineConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CaffeineLoadCacheComponent target = (CaffeineLoadCacheComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": getOrCreateConfiguration(target).setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "cacheloader":
        case "cacheLoader": getOrCreateConfiguration(target).setCacheLoader(property(camelContext, com.github.benmanes.caffeine.cache.CacheLoader.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.caffeine.CaffeineConfiguration.class, value)); return true;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": getOrCreateConfiguration(target).setCreateCacheIfNotExist(property(camelContext, boolean.class, value)); return true;
        case "evictiontype":
        case "evictionType": getOrCreateConfiguration(target).setEvictionType(property(camelContext, org.apache.camel.component.caffeine.EvictionType.class, value)); return true;
        case "expireafteraccesstime":
        case "expireAfterAccessTime": getOrCreateConfiguration(target).setExpireAfterAccessTime(property(camelContext, int.class, value)); return true;
        case "expireafterwritetime":
        case "expireAfterWriteTime": getOrCreateConfiguration(target).setExpireAfterWriteTime(property(camelContext, int.class, value)); return true;
        case "initialcapacity":
        case "initialCapacity": getOrCreateConfiguration(target).setInitialCapacity(property(camelContext, java.lang.Integer.class, value)); return true;
        case "key": getOrCreateConfiguration(target).setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "keytype":
        case "keyType": getOrCreateConfiguration(target).setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maximumsize":
        case "maximumSize": getOrCreateConfiguration(target).setMaximumSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "removallistener":
        case "removalListener": getOrCreateConfiguration(target).setRemovalListener(property(camelContext, com.github.benmanes.caffeine.cache.RemovalListener.class, value)); return true;
        case "statscounter":
        case "statsCounter": getOrCreateConfiguration(target).setStatsCounter(property(camelContext, com.github.benmanes.caffeine.cache.stats.StatsCounter.class, value)); return true;
        case "statsenabled":
        case "statsEnabled": getOrCreateConfiguration(target).setStatsEnabled(property(camelContext, boolean.class, value)); return true;
        case "valuetype":
        case "valueType": getOrCreateConfiguration(target).setValueType(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "cacheloader":
        case "cacheLoader": return com.github.benmanes.caffeine.cache.CacheLoader.class;
        case "configuration": return org.apache.camel.component.caffeine.CaffeineConfiguration.class;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": return boolean.class;
        case "evictiontype":
        case "evictionType": return org.apache.camel.component.caffeine.EvictionType.class;
        case "expireafteraccesstime":
        case "expireAfterAccessTime": return int.class;
        case "expireafterwritetime":
        case "expireAfterWriteTime": return int.class;
        case "initialcapacity":
        case "initialCapacity": return java.lang.Integer.class;
        case "key": return java.lang.Object.class;
        case "keytype":
        case "keyType": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maximumsize":
        case "maximumSize": return java.lang.Integer.class;
        case "removallistener":
        case "removalListener": return com.github.benmanes.caffeine.cache.RemovalListener.class;
        case "statscounter":
        case "statsCounter": return com.github.benmanes.caffeine.cache.stats.StatsCounter.class;
        case "statsenabled":
        case "statsEnabled": return boolean.class;
        case "valuetype":
        case "valueType": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CaffeineLoadCacheComponent target = (CaffeineLoadCacheComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return getOrCreateConfiguration(target).getAction();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "cacheloader":
        case "cacheLoader": return getOrCreateConfiguration(target).getCacheLoader();
        case "configuration": return target.getConfiguration();
        case "createcacheifnotexist":
        case "createCacheIfNotExist": return getOrCreateConfiguration(target).isCreateCacheIfNotExist();
        case "evictiontype":
        case "evictionType": return getOrCreateConfiguration(target).getEvictionType();
        case "expireafteraccesstime":
        case "expireAfterAccessTime": return getOrCreateConfiguration(target).getExpireAfterAccessTime();
        case "expireafterwritetime":
        case "expireAfterWriteTime": return getOrCreateConfiguration(target).getExpireAfterWriteTime();
        case "initialcapacity":
        case "initialCapacity": return getOrCreateConfiguration(target).getInitialCapacity();
        case "key": return getOrCreateConfiguration(target).getKey();
        case "keytype":
        case "keyType": return getOrCreateConfiguration(target).getKeyType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maximumsize":
        case "maximumSize": return getOrCreateConfiguration(target).getMaximumSize();
        case "removallistener":
        case "removalListener": return getOrCreateConfiguration(target).getRemovalListener();
        case "statscounter":
        case "statsCounter": return getOrCreateConfiguration(target).getStatsCounter();
        case "statsenabled":
        case "statsEnabled": return getOrCreateConfiguration(target).isStatsEnabled();
        case "valuetype":
        case "valueType": return getOrCreateConfiguration(target).getValueType();
        default: return null;
        }
    }
}

