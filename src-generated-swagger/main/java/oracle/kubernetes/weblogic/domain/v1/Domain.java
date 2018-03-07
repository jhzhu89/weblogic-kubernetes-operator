// Copyright 2017, 2018, Oracle Corporation and/or its affiliates.  All rights reserved.
// Licensed under the Universal Permissive License v 1.0 as shown at http://oss.oracle.com/licenses/upl.

package oracle.kubernetes.weblogic.domain.v1;

import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1ObjectMeta;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Domain represents a WebLogic domain and how it will be realized in the Kubernetes cluster.
 * 
 */
public class Domain {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
     * 
     */
    @SerializedName("apiVersion")
    @Expose
    private String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
     * 
     */
    @SerializedName("kind")
    @Expose
    private String kind;
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    @SerializedName("metadata")
    @Expose
    @Valid
    private V1ObjectMeta metadata;
    /**
     * DomainSpec is a description of a domain.
     * 
     */
    @SerializedName("spec")
    @Expose
    @Valid
    private DomainSpec spec;
    /**
     * DomainStatus represents information about the status of a domain. Status may trail the actual state of a system.
     * 
     */
    @SerializedName("status")
    @Expose
    @Valid
    private DomainStatus status;

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
     * 
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
     * 
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Domain withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
     * 
     */
    public String getKind() {
        return kind;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
     * 
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    public Domain withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    public V1ObjectMeta getMetadata() {
        return metadata;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * 
     */
    public void setMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public Domain withMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * DomainSpec is a description of a domain.
     * 
     */
    public DomainSpec getSpec() {
        return spec;
    }

    /**
     * DomainSpec is a description of a domain.
     * 
     */
    public void setSpec(DomainSpec spec) {
        this.spec = spec;
    }

    public Domain withSpec(DomainSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * DomainStatus represents information about the status of a domain. Status may trail the actual state of a system.
     * 
     */
    public DomainStatus getStatus() {
        return status;
    }

    /**
     * DomainStatus represents information about the status of a domain. Status may trail the actual state of a system.
     * 
     */
    public void setStatus(DomainStatus status) {
        this.status = status;
    }

    public Domain withStatus(DomainStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apiVersion", apiVersion).append("kind", kind).append("metadata", metadata).append("spec", spec).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metadata).append(apiVersion).append(kind).append(spec).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Domain) == false) {
            return false;
        }
        Domain rhs = ((Domain) other);
        return new EqualsBuilder().append(metadata, rhs.metadata).append(apiVersion, rhs.apiVersion).append(kind, rhs.kind).append(spec, rhs.spec).append(status, rhs.status).isEquals();
    }

}
