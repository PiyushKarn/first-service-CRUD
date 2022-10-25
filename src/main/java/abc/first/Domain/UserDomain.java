package abc.first.Domain;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate
@Table(name="users")
public class UserDomain {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String phoneNumber;
    @Column
    private String address;
    @Column(columnDefinition = "TEXT")
    private String additionalDetails;

    public UserDomain()
    {}

    public UserDomain(Long id, String name, String phoneNumber, String address, String additionalDetails) {
        this.id=id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.additionalDetails = additionalDetails;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getAdditionalDetails(){
        return additionalDetails;
    }
    public void setAdditionalDetails(String additionalDetails){
        this.additionalDetails=additionalDetails;
    }

}
