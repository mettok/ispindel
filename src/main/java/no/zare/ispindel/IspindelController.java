package no.zare.ispindel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedHashMap;

@RestController
@RequestMapping("api")
public class IspindelController {

    @Autowired
    IspindelRepository ispindelRepository;

    @PostMapping("send")
    public void sendData(@RequestBody LinkedHashMap data){
        System.out.println(data);
        IspindelData ispindelData=new IspindelData();

        ispindelData.setName((String) data.get("name"));
        ispindelData.setIspindelId((Integer) data.get("ID"));
        ispindelData.setToken((String) data.get("token"));
        ispindelData.setAngle((Double) data.get("angle"));
        ispindelData.setTemperature((Double) data.get("temperature"));
        ispindelData.setTempUnits((String) data.get("temp_units"));
        ispindelData.setBattery((Double) data.get("battery"));
        ispindelData.setGravity((Double) data.get("gravity"));
        ispindelData.setDataInterval((Integer) data.get("interval"));
        ispindelData.setRSSI((Integer) data.get("RSSI"));
        ispindelData.setDate(new Date());
        ispindelRepository.save(ispindelData);

        System.out.println(ispindelData);

    }
}
