/**
 * 
 */
package com.bhuwan.chatapp;

import java.util.HashSet;
import java.util.Set;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;

/**
 * @author bhuwan
 *
 */
public class EchoEndpointConfig implements ServerApplicationConfig {

    @Override
    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> set) {
        return null;
    }

    @Override
    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> set) {
        Set<ServerEndpointConfig> result = new HashSet<>();

        if (set.contains(EchoEndPoint.class)) {
            result.add(ServerEndpointConfig.Builder.create(EchoEndPoint.class, "/websocket/echo").build());
        }
        return result;
    }

}
