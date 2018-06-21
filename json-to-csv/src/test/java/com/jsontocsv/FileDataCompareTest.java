package com.jsontocsv;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import jxl.read.biff.BiffException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileDataCompareTest {
	
    @Test
    public void compareData() throws BiffException, IOException  {
   	 File actualFile = new File("src/main/resources/CsvFiles/User.csv");
   	    File expectedFile = new File("src/main/resources/CsvFiles/UserList.csv");
   	    assertThat(actualFile).hasSameContentAs(expectedFile);
   	

    }
}
