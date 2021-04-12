package legoset;

import jakarta.xml.bind.JAXBException;
import jaxb.JAXBHelper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        var legoSet = new LegoSet();
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setNumber("75211");
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);

        legoSet.setPackaging(LegoSet.packagingType.BOX);

        Set<String> tags = new HashSet<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");

        legoSet.setTags(tags);

        List<Minifig> minifigs = new LinkedList<>();
        minifigs.add(new Minifig(2,"Imperial Mudtrooper"));
        minifigs.add(new Minifig(1,"Imperial Pilot"));
        minifigs.add(new Minifig(1,"Mimban Stormtrooper"));

        legoSet.setMinifigs(minifigs);

        legoSet.setRatings(new Ratings(468,4.4));

       // JAXBHelper.toXML(legoSet, System.out);

        JAXBHelper.toXML(legoSet, new FileOutputStream("legoset.xml"));


    }
}
