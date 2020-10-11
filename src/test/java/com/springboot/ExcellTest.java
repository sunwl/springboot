package com.springboot;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcellTest {
    private static final Logger logger = LogManager.getLogger(ExcellTest.class);
    private byte[] abe=new byte[102400];

    @Test
    public void excell() throws  Exception{
        List<List<String>> list=new ArrayList<List<String>>();
        for(int j=11;j<=13;j++) {
            List<String> li = new ArrayList<String>();
            for (int i = 0; i <3; i++) {
                if(i==0){li.add("20200706");}else{
                li.add("" + (i*j+j));}
            }
            list.add(li);
        }
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("测试合并单元格");
        HSSFRow row0 = sheet.createRow(0);
        HSSFRow row = sheet.createRow(1);
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        style.setAlignment(HSSFCellStyle.VERTICAL_CENTER);

        //声明列对象
//        HSSFCell cell = null;
//        CellRangeAddress callRangeAddress = new CellRangeAddress(1,3,0,0);//起始行,结束行,起始列,结束列
//        sheet.addMergedRegion(callRangeAddress);
//        cell = row.createCell(0);
//        cell.setCellStyle(style);
//        cell.setCellValue("20200723");
        int i=0;
        for(List<String> l:list){
            row = sheet.createRow(i);
            i=i+1;
            int j=0;
           for(String sa:l) {

               HSSFCell ce=row.createCell(j);
               ce.setCellStyle(style);
               ce. setCellValue(sa);
               j=j+1;
           }

        }

        //声明列对象
        CellRangeAddress callRangeAddress = new CellRangeAddress(0,2,0,0);//起始行,结束行,起始列,结束列
        sheet.addMergedRegion(callRangeAddress);




        File file=new File("F:/测试单元格.xls");
        file.createNewFile();


        OutputStream os = new FileOutputStream(file);
        wb.write(os);
        os.flush();
        os.close();
    }
}
