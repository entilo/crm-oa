package com.crm.www.utils;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

import jxl.CellView;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.DateFormat;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.NumberFormat;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
/**
 * Excel设置对象字段与单元格的映射
 * Date:2016年12月13日21:33:35
 * @author lz
 */
public class ExcelUtil {
	private  WritableCellFormat wcf1=null;
	private  WritableCellFormat wcf2=null;
	private  WritableCellFormat wcf3=null;
	private  WritableCellFormat wcfDate=null;
	private  CellView dateCellView = new CellView();	 
	
	{
		try {
			NumberFormat nf1=new NumberFormat("0");
			wcf1 = new WritableCellFormat(nf1);
			wcf1.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf1.setBackground(Colour.YELLOW);
			
			NumberFormat nf2=new NumberFormat("0.0");
			wcf2 = new WritableCellFormat(nf2);
			wcf2.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf2.setBackground(Colour.YELLOW);
			
			NumberFormat nf3=new NumberFormat("0.00");
			wcf3 = new WritableCellFormat(nf3);
			wcf3.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf3.setBackground(Colour.YELLOW);
			
			DateFormat df=new DateFormat("yyyy-MM-dd");
			wcfDate=new WritableCellFormat(df);
			wcfDate.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcfDate.setAlignment(Alignment.CENTRE);
			wcfDate.setBackground(Colour.YELLOW);
			
			dateCellView.setSize(3000);
			
			
		} catch (WriteException e) {
			e.printStackTrace();
		}
	}
	
	public  <T> void setData(WritableSheet sheet,int beginRow,int beginCell,List<T> list,WritableCellFormat cloumnFormat){
		int endRow =beginRow+list.size();
		if(list.size()>0){
			Field[] fields = list.get(0).getClass().getDeclaredFields();
			int endCell=beginCell+fields.length;
			for(int i=beginRow;i<endRow;i++){
				T t = list.get(i-beginRow);
				for(int j=beginCell;j<endCell;j++){
					Field field=fields[j-beginCell];
					try {
						if(field.isAccessible()==false){
							field.setAccessible(true);
							setCellValue(sheet,j,i,t,field,cloumnFormat);
							field.setAccessible(false);
						}else{
							setCellValue(sheet,j,i,t,field,cloumnFormat);
						}
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (RowsExceededException e) {
						e.printStackTrace();
					} catch (WriteException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	private  <T> void setCellValue(WritableSheet sheet,int cell,int row,T t,Field field,WritableCellFormat cloumnFormat) throws RowsExceededException, WriteException, NumberFormatException, IllegalArgumentException, IllegalAccessException{
		if(field.getType()==byte.class){
			if(field.get(t)!=null){
				jxl.write.Number number=new jxl.write.Number(cell,row,Byte.parseByte(field.get(t).toString()),wcf1);
				sheet.addCell(number);
			}else{
				sheet.addCell(new Label(cell,row,"",cloumnFormat));
			}
		}else if(field.getType()==short.class){
			if(field.get(t)!=null){
				jxl.write.Number number=new jxl.write.Number(cell,row,Short.parseShort(field.get(t).toString()),wcf1);
				sheet.addCell(number);
			}else{
				sheet.addCell(new Label(cell,row,"",cloumnFormat));
			}
		}else if(field.getType()==int.class){			
			if(field.get(t)!=null){
				jxl.write.Number number=new jxl.write.Number(cell,row,Integer.parseInt(field.get(t).toString()),wcf1);
				sheet.addCell(number);
			}else{
				sheet.addCell(new Label(cell,row,"",cloumnFormat));
			}
		}else if(field.getType()==float.class){
			if(field.get(t)!=null){
				jxl.write.Number number=new jxl.write.Number(cell,row,Float.parseFloat(field.get(t).toString()),wcf2);
				sheet.addCell(number);
			}else{
				sheet.addCell(new Label(cell,row,"",cloumnFormat));
			}
		}else if(field.getType()==double.class){
			sheet.setColumnView(cell, dateCellView);
			if(field.get(t)!=null){
				jxl.write.Number number=new jxl.write.Number(cell,row,Double.parseDouble(field.get(t).toString()),wcf3);
				sheet.addCell(number);
			}else{
				sheet.addCell(new Label(cell,row,"",cloumnFormat));
			}
		}else if(field.getType()==long.class){
			if(field.get(t)!=null){
				jxl.write.Number number=new jxl.write.Number(cell,row,Long.parseLong(field.get(t).toString()),wcf1);
				sheet.addCell(number);
			}else{
				sheet.addCell(new Label(cell,row,"",cloumnFormat));
			}
		}else if(field.getType()==boolean.class){
			if(field.get(t)!=null){
				sheet.addCell(new Label(cell,row,field.get(t).toString(),cloumnFormat));
			}else{
				sheet.addCell(new Label(cell,row,"",cloumnFormat));
			}
		}else if(field.getType()==java.util.Date.class){
			sheet.setColumnView(cell, dateCellView);
			if(field.get(t)!=null){
				Date d=(Date) field.get(t);
				/*if(d.getTime()<System.currentTimeMillis()&&"deadline".equals(field.getName())){
					WritableFont font = new WritableFont(WritableFont.createFont("宋体")); 
					font.setColour(Colour.RED);
					wcfDate.setFont(font);
				}*/
				DateTime date=new DateTime(cell,row,d,wcfDate);
				sheet.addCell(date);  
			}else{
				sheet.addCell(new Label(cell,row,"",wcfDate));
			}
		}else{
			if(field.getName().equals("phone")){
				sheet.setColumnView(cell, dateCellView);
			}
			if(field.get(t)!=null){
				sheet.addCell(new Label(cell,row,field.get(t).toString(),cloumnFormat));
			}else{
				sheet.addCell(new Label(cell,row,"",cloumnFormat));
			}
		}
	}
	
	
}
