package no.zare.ispindel;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@ToString
@Entity
public class IspindelData {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer ispindelId;
    private String token;
    private Double angle;
    private Double temperature;
    private String tempUnits;
    private Double battery;
    private Double gravity;
    private Integer dataInterval;
    private Integer RSSI;

    private Date date;


}
