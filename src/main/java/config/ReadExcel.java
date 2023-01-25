package config;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadExcel {
    public static String testDataPath="/Users/dealshare/Downloads/TestVagrant/src/main/java/testData/playerDetails.xlsx";
    private static List<Integer> getIndexListOfColumn(String SheetName,List<String> columnList) throws IOException {
        FileInputStream fis=new FileInputStream(new File(testDataPath));
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        List<Integer> resultList=new ArrayList<>();
        List<String> tempList=new ArrayList<>();
        Sheet sh=wb.getSheet(SheetName);
        int totalColumn=sh.getRow(0).getLastCellNum();
        for(int i=1;i<totalColumn;i++)
            tempList.add(sh.getRow(0).getCell(i).getStringCellValue());
        for(String value:columnList)
            if(tempList.contains(value))
                resultList.add(tempList.indexOf(value)+1);
        return resultList;

    }
    private static List<Integer> getIndexListOfRow(String SheetName,String testCaseName) throws IOException {
        FileInputStream fis=new FileInputStream(new File(testDataPath));
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        List<Integer> resultList=new ArrayList<>();
        Sheet sh=wb.getSheet(SheetName);
        int totalRow=sh.getLastRowNum();
        for(int i=1;i<=totalRow;i++)
            if (sh.getRow(i).getCell(0).getStringCellValue().equals(testCaseName)){
                resultList.add(i);
            }
        return resultList;

    }
    public static Object[][] readTestData(String SheetName,String testCaseName,List<String> columnList) throws IOException {
        {
            FileInputStream fis=new FileInputStream(new File(testDataPath));
            XSSFWorkbook wb=new XSSFWorkbook(fis);
            Sheet sh=wb.getSheet(SheetName);
            List<Integer> rowIndex=getIndexListOfRow(SheetName,testCaseName);
            List<Integer> columnIndex=getIndexListOfColumn(SheetName,columnList);
            Object[][] resultTestData=new Object[rowIndex.size()][columnIndex.size()];
            int counter=0;
            while(counter<rowIndex.size()){
                for(int i=0;i<columnIndex.size();i++)
                    resultTestData[counter][i]=sh.getRow(rowIndex.get(counter)).getCell(columnIndex.get(i)).getStringCellValue();
                counter++;
            }
            return resultTestData;
        }
    }

}
