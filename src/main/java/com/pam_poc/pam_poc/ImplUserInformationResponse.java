package com.pam_poc.pam_poc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ImplUserInformationResponse implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    public String transactionId;
    public boolean anonymouUser;
    public boolean otpUser;
    public int otpExpiredInSeconds;
    public UserDetails userDetails;
    public ClientContext clientContext;
    public MigrationParams migrationParams;
    public ImplUserInformationResponse() {
    }




}