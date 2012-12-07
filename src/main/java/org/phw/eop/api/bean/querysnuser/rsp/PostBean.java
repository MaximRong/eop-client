package org.phw.eop.api.bean.querysnuser.rsp;

import org.phw.eop.api.internal.mapping.annotation.RspField;

public class PostBean {
    
    @RspField(tagName = "ID_TYPE")
    private String idType;
    
    @RspField(tagName = "POST_NAME")
    private String postName;
    
    @RspField(tagName = "POST_TAG")
    private String postTag;
    
    @RspField(tagName = "POST_CONTENT")
    private String postContent;
    
    @RspField(tagName = "POST_TYPESET")
    private String postTypeset;
    
    @RspField(tagName = "POST_CYC")
    private String postCyc;
    
    @RspField(tagName = "POST_ADDRESS")
    private String postAddress;
    
    @RspField(tagName = "POST_CODE")
    private String postCode;
    
    @RspField(tagName = "EMAIL")
    private String email;
    
    @RspField(tagName = "FAX_NBR")
    private String faxNbr;

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostTag() {
        return postTag;
    }

    public void setPostTag(String postTag) {
        this.postTag = postTag;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostTypeset() {
        return postTypeset;
    }

    public void setPostTypeset(String postTypeset) {
        this.postTypeset = postTypeset;
    }

    public String getPostCyc() {
        return postCyc;
    }

    public void setPostCyc(String postCyc) {
        this.postCyc = postCyc;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaxNbr() {
        return faxNbr;
    }

    public void setFaxNbr(String faxNbr) {
        this.faxNbr = faxNbr;
    }

}
