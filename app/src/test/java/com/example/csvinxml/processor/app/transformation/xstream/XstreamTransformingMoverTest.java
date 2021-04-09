//package com.example.csvinxml.processor.app.transformation.xstream;
//
//import com.example.csvinxml.processor.app.CamelFileBasedTestCase;
//import com.example.csvinxml.processor.app.transformation.Person;
//import com.thoughtworks.xstream.XStream;
//import com.example.csvinxml.processor.app.FileUtil;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//import static junit.framework.Assert.assertEquals;
//
//public class XstreamTransformingMoverTest extends CamelFileBasedTestCase {
//    @Value("${csvinxml.processor.app.transform.source}")
//    private File inputDirectory;
//
//    @Value("${csvinxml.processor.app.transform.destination}")
//    private File destination;
//
//    @Autowired
//    private XStream xStream;
//
//    @Before
//    public void setup() {
//        FileUtil.makeOrCleanDirectory(inputDirectory);
//        FileUtil.makeOrCleanDirectory(destination);
//    }
//
//    @Test
//    public void route() throws FileNotFoundException {
//        loadFileToProcess("test.csv", "john,smith\nronald,mcdonald");
//        runCamelAndWaitForItToFinish();
//        File[] files = destination.listFiles();
//        assertEquals(2, files.length);
//
//        List<Person> results = new ArrayList<Person>();
//
//        for (File file : files) {
//            results.add((Person) xStream.fromXML(new FileReader(file)));
//        }
//
//        sortByLastName(results);
//
//        assertEquals(results.get(0).getLastName(), "mcdonald");
//        assertEquals(results.get(1).getLastName(), "smith");
//    }
//
//    private void sortByLastName(List<Person> results) {
//        Collections.sort(results, new Comparator<Person>() {
//            @Override
//            public int compare(Person current, Person next) {
//                return current.getLastName().compareToIgnoreCase(next.getLastName());
//            }
//        });
//    }
//
//    @Override
//    protected File getInputDirectory() {
//        return inputDirectory;
//    }
//}