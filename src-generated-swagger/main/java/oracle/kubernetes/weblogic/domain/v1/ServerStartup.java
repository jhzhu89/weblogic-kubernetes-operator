// Copyright 2017, 2018, Oracle Corporation and/or its affiliates.  All rights reserved.
// Licensed under the Universal Permissive License v 1.0 as shown at http://oss.oracle.com/licenses/upl.

package oracle.kubernetes.weblogic.domain.v1;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1EnvVar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * ServerStarup describes the desired startup state and passed environment variables for a specific managed server.
 * 
 */
public class ServerStartup {

    /**
     * Desired startup state.  Legal values are RUNNING or ADMIN.
     * 
     */
    @SerializedName("desiredState")
    @Expose
    private String desiredState;
    /**
     * Managed server name of instance to start.
     * (Required)
     * 
     */
    @SerializedName("serverName")
    @Expose
    @NotNull
    private String serverName;
    /**
     * Managed server NodePort port.  The port on each node on which this managed server will be exposed.  If specified, this value must be an unused port.  By default, the server will not be exposed outside the Kubernetes cluster.
     * 
     */
    @SerializedName("nodePort")
    @Expose
    private Integer nodePort;
    /**
     * Environment variables to pass while starting this managed server.
     * 
     */
    @SerializedName("env")
    @Expose
    @Valid
    private List<V1EnvVar> env = new ArrayList<V1EnvVar>();

    /**
     * Desired startup state.  Legal values are RUNNING or ADMIN.
     * 
     */
    public String getDesiredState() {
        return desiredState;
    }

    /**
     * Desired startup state.  Legal values are RUNNING or ADMIN.
     * 
     */
    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    public ServerStartup withDesiredState(String desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    /**
     * Managed server name of instance to start.
     * (Required)
     * 
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Managed server name of instance to start.
     * (Required)
     * 
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ServerStartup withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Managed server NodePort port.  The port on each node on which this managed server will be exposed.  If specified, this value must be an unused port.  By default, the server will not be exposed outside the Kubernetes cluster.
     * 
     */
    public Integer getNodePort() {
        return nodePort;
    }

    /**
     * Managed server NodePort port.  The port on each node on which this managed server will be exposed.  If specified, this value must be an unused port.  By default, the server will not be exposed outside the Kubernetes cluster.
     * 
     */
    public void setNodePort(Integer nodePort) {
        this.nodePort = nodePort;
    }

    public ServerStartup withNodePort(Integer nodePort) {
        this.nodePort = nodePort;
        return this;
    }

    /**
     * Environment variables to pass while starting this managed server.
     * 
     */
    public List<V1EnvVar> getEnv() {
        return env;
    }

    /**
     * Environment variables to pass while starting this managed server.
     * 
     */
    public void setEnv(List<V1EnvVar> env) {
        this.env = env;
    }

    public ServerStartup withEnv(List<V1EnvVar> env) {
        this.env = env;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("desiredState", desiredState).append("serverName", serverName).append("nodePort", nodePort).append("env", env).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(desiredState).append(serverName).append(env).append(nodePort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServerStartup) == false) {
            return false;
        }
        ServerStartup rhs = ((ServerStartup) other);
        return new EqualsBuilder().append(desiredState, rhs.desiredState).append(serverName, rhs.serverName).append(env, rhs.env).append(nodePort, rhs.nodePort).isEquals();
    }

}
