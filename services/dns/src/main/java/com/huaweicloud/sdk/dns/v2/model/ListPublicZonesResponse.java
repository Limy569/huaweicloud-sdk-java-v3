package com.huaweicloud.sdk.dns.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.Metedata;
import com.huaweicloud.sdk.dns.v2.model.PageLink;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPublicZonesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private PageLink links;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zones")
    
    private String zones;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Metedata metadata;

    public ListPublicZonesResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ListPublicZonesResponse withLinks(Consumer<PageLink> linksSetter) {
        if(this.links == null ){
            this.links = new PageLink();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public PageLink getLinks() {
        return links;
    }

    public void setLinks(PageLink links) {
        this.links = links;
    }

    

    public ListPublicZonesResponse withZones(String zones) {
        this.zones = zones;
        return this;
    }

    


    /**
     * Get zones
     * @return zones
     */
    public String getZones() {
        return zones;
    }

    public void setZones(String zones) {
        this.zones = zones;
    }

    

    public ListPublicZonesResponse withMetadata(Metedata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListPublicZonesResponse withMetadata(Consumer<Metedata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new Metedata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public Metedata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metedata metadata) {
        this.metadata = metadata;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPublicZonesResponse listPublicZonesResponse = (ListPublicZonesResponse) o;
        return Objects.equals(this.links, listPublicZonesResponse.links) &&
            Objects.equals(this.zones, listPublicZonesResponse.zones) &&
            Objects.equals(this.metadata, listPublicZonesResponse.metadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, zones, metadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicZonesResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

