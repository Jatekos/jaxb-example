package legoset;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import movie.YearAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {

    private String name;
    private String theme;
    private String subtheme;
    @XmlAttribute
    private String number;
    @XmlAttribute
    private String url;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private java.time.Year year;
    private int pieces;
    public    enum  packagingType{ BOX,PLYBAG};
    private packagingType packaging;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private java.util.Set<String> tags;
    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private java.util.List<Minifig> minifigs;
    private  Ratings ratings;



}
