/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.util;

/**
 *
 * @author Dell India
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

import java.io.OutputStream;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import java.util.Base64;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author amanpreet.singh
 */
public class UtilityFile extends org.apache.struts.actions.DispatchAction {

    private OutputStream fout = null;
    private InputStream fin = null;
    private byte[] keyVal = null;
    private byte[] saltVal = null;
    private String testValue = null;

    public String getTestValue() {
        return testValue;
    }

    public void setTestValue(String testValue) {
        this.testValue = testValue;
    }

    public byte[] getKeyVal() {
        return keyVal;
    }

    public void setKeyVal(byte[] keyVal) {
        this.keyVal = keyVal;
    }

    public byte[] getSaltVal() {
        return saltVal;
    }

    public void setSaltVal(byte[] saltVal) {
        this.saltVal = saltVal;
    }

    public String CheckNull(String input) {
        String out = "";
        if (input != null) {
            out = input.trim();
        }
        return out;
    }

    public String getNewPassword(int clientId, String dummy) {
        String keywords = "nfgngfjklfgg@dkdd_67877625433_8723443256534rtytz@_malo_tesgd";
        String msg = "";
        int random1 = 0;
        try {
            for (int i = 0; i < 9; i++) {
                random1 = (int) (Math.random() * 50 + 1);
                System.out.println("random:" + random1);
                msg += String.valueOf(keywords.charAt(random1));
            }
            System.out.println("msg:" + msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    public int getNewOTP(int clientId, String dummy) {
        int OTP = 0;
        Random rnd = new Random();
        try {
            OTP = (100000 + rnd.nextInt(900000));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rnd = null;
        }
        return OTP;
    }

    public String getPropertyFromAR(HttpServletRequest request, String key) {
        String msg = "";
        try {
            msg = this.getResources(request).getMessage(this.getLocale(request), key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    public String getFileCommonPath(HttpServletRequest request, String key) {
        String msg = "";
        try {            
            msg = this.getPropertyFromAR(request, "sl.uploadFilePath") + "\\AppLoadedFiles";

        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    public String getEncodedString(HttpServletRequest request, String input) {
        String msg = "";
        try {
            int random1 = (int) (Math.random() * 5000 + 1);
            int random2 = (int) (Math.random() * 5000 + 1);
            int random3 = (int) (Math.random() * 5000 + 1);
            msg = "wdfjsdnasab" + random1 + "," + random2 + "," + input + "," + random3 + ",sdvhsdavhdasvh";
            msg = Base64.getEncoder().encodeToString(msg.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return msg;
    }

    public String getDecodedString(HttpServletRequest request, String input) {
        String msg = "";
        try {
            byte[] base64decodedBytes = Base64.getDecoder().decode(input);
            input = new String(base64decodedBytes, "utf-8");
            String arr[] = input.split(",");
            msg = arr[2].trim();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return msg;
    }

    public boolean isStringChanged(String input, String output) {
        boolean flag = true;
        try {
            if (input == null && output == null) {
                flag = false;
            } else if (input != null && output != null && input.equalsIgnoreCase(output)) {
                flag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean isIntegerChanged(Integer input, Integer output) {
        boolean flag = true;
        try {
            if (input == null && output == null) {
                flag = false;
            } else if (input != null && output != null && input.equals(output)) {
                flag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean isIntChanged(int input, int output) {
        boolean flag = true;
        try {
            if (input == output) {
                flag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    
    public boolean isValidIntValue(String input) {
        boolean flag = false;
        try {
            if (input != null) {
                double db = Double.parseDouble(input.trim());
//                for (char c : input.toCharArray()) {
//                    if (!Character.isDigit(c)) {
//                        return false;
//                    }
//                }
                return true;
            }
        } catch (NumberFormatException e) {
//            e.printStackTrace();
        }
        return false;
    }

    public boolean isValidDateValue(String input, int dateProperty) {
        boolean flag = false;
        String format = "";
        try {
            switch (dateProperty) {
                case 0:
                case 1:
                    format = "yyyy-MM-dd";
                    break;
                case 2:
                    format = "MM-dd-yyyy";
                    break;
                case 3:
                    format = "dd-MM-yyyy";
                    break;
                default:
                    break;
            }
            if (input != null && input.length() == 10) {
                SimpleDateFormat df = new SimpleDateFormat(format);
                df.parse(input);
                flag = true;
                df = null;
            }
        } catch (ParseException e) {
        }
        return flag;
    }

    public String GetDateFormat(int dateProperty) {
        String format = "";
        try {
            switch (dateProperty) {
                case 0:
                case 1:
                    format = "yyyy-MM-dd";
                    break;
                case 2:
                    format = "MM-dd-yyyy";
                    break;
                case 3:
                    format = "dd-MM-yyyy";
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
        }
        return format;
    }

    public Timestamp getDate(String input, int property) {//here property is not used. Only used for yyyy-mm-dd date to timestamp convert
        Timestamp ts = null;
        Calendar calendar = Calendar.getInstance();
        String arr[] = null;
        int year = 0;
        int month = 0;
        int day = 0;
        try {
            if (input != null && input.length() > 0) {
                arr = input.split("-");
                year = Integer.parseInt(arr[0]);
                month = Integer.parseInt(arr[1]);
                day = Integer.parseInt(arr[2]);
//                ts = new Timestamp(year - 1900, month - 1, day, 0, 0, 0, 0);
                calendar.clear();
                calendar.set(year, month - 1, day, 0, 0, 0);
                ts = new Timestamp(calendar.getTimeInMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ts;
    }

    public Timestamp getTimestampToSave(String input, int property) {
        Timestamp ts = null;
        Calendar calendar = Calendar.getInstance();
        String arr[] = null;
        int year = 0;
        int month = 0;
        int day = 0;
        try {
            if (input != null && input.length() > 0) {
                arr = input.split("-");
                if(arr!=null && arr.length>2){
                    switch (property) {
                        case 0:
                        case 1:
                            year = Integer.parseInt(arr[0]);
                            month = Integer.parseInt(arr[1]);
                            day = Integer.parseInt(arr[2]);
                            break;
                        case 2:
                            year = Integer.parseInt(arr[2]);
                            month = Integer.parseInt(arr[0]);
                            day = Integer.parseInt(arr[1]);
                            break;
                        case 3:
                            year = Integer.parseInt(arr[2]);
                            month = Integer.parseInt(arr[1]);
                            day = Integer.parseInt(arr[0]);
                            break;
                        default:
                            break;
                    }
                }
//                ts = new Timestamp(year - 1900, month - 1, day, 0, 0, 0, 0);
                calendar.clear();
                calendar.set(year, month - 1, day, 0, 0, 0);
                ts = new Timestamp(calendar.getTimeInMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ts;
    }
    public Calendar getCalendarToSave(String input, int property) {
        Calendar calendar = Calendar.getInstance();
        String arr[] = null;
        int year = 0;
        int month = 0;
        int day = 0;
        try {
            if (input != null && input.length() > 0) {
                arr = input.split("-");
                switch (property) {
                    case 0:
                    case 1:
                        year = Integer.parseInt(arr[0]);
                        month = Integer.parseInt(arr[1]);
                        day = Integer.parseInt(arr[2]);
                        break;
                    case 2:
                        year = Integer.parseInt(arr[2]);
                        month = Integer.parseInt(arr[0]);
                        day = Integer.parseInt(arr[1]);
                        break;
                    case 3:
                        year = Integer.parseInt(arr[2]);
                        month = Integer.parseInt(arr[1]);
                        day = Integer.parseInt(arr[0]);
                        break;
                    default:
                        break;
                }
//                ts = new Timestamp(year - 1900, month - 1, day, 0, 0, 0, 0);
                calendar.clear();
                calendar.set(year, month - 1, day, 0, 0, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return calendar;
    }
    public String getDateToCompare(String input, int property) {
        String ts = "";
        String arr[] = null;
        int year = 0;
        int month = 0;
        int day = 0;
        try {
            if (input != null && input.length() > 0) {
                arr = input.split("-");
                switch (property) {
                    case 0:
                    case 1:
                        year = Integer.parseInt(arr[0]);
                        month = Integer.parseInt(arr[1]);
                        day = Integer.parseInt(arr[2]);
                        break;
                    case 2:
                        year = Integer.parseInt(arr[2]);
                        month = Integer.parseInt(arr[0]);
                        day = Integer.parseInt(arr[1]);
                        break;
                    case 3:
                        year = Integer.parseInt(arr[2]);
                        month = Integer.parseInt(arr[1]);
                        day = Integer.parseInt(arr[0]);
                        break;
                    default:
                        break;
                }
                ts = year+"-";
                if(month<10){
                    ts += "0"+month+"-";
                }else{
                    ts += ""+month+"-";
                }
                if(day<10){
                    ts += "0"+day;
                }else{
                    ts += ""+day;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ts;
    }

    public String getDateToViewFull(String input, int property) {
        String arr[] = null;
        int year = 0;
        int month = 0;
        int day = 0;
        String dayVal = "";
        String monthVal = "";
        String time = "";
        String date = "";
        try {
            if (input != null && input.length() > 10) {
                String abc[] = input.split(" ");
//                time = input.substring(10);
//                input = input.substring(0, 10);
                time = " " + abc[1];
                if (time != null && time.length() > 6) {
                    time = time.substring(0, 6);
                }
                input = abc[0];
            }
            if (input != null && input.length() > 0 && !input.equalsIgnoreCase("null") && !input.equalsIgnoreCase("NA") && !input.equalsIgnoreCase("")) {
                arr = input.split("-");
                year = Integer.parseInt(arr[0]);
                month = Integer.parseInt(arr[1]);
                day = Integer.parseInt(arr[2]);
                if (month < 10) {
                    monthVal = "0" + month;
                } else {
                    monthVal = "" + month;
                }
                if (day < 10) {
                    dayVal = "0" + day;
                } else {
                    dayVal = "" + day;
                }
                switch (property) {
                    case 0:
                    case 1:
                        //yyyy-MM-dd time
                        date = year + "-" + monthVal + "-" + dayVal + time;
                        break;
                    case 2:
                        //MM-dd-yyyy time
                        date = monthVal + "-" + dayVal + "-" + year + time;
                        break;
                    case 3:
                        //dd-mm-yyyy time
                        date = dayVal + "-" + monthVal + "-" + year + time;
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            arr = null;
            time = null;
            monthVal = null;
            dayVal = null;
        }
        return date;
    }

    public String getDateToView(String input, int property) {
        String arr[] = null;
        int year = 0;
        int month = 0;
        int day = 0;
        String dayVal = "";
        String monthVal = "";
        String date = "";
        try {
            if (input != null && !input.equalsIgnoreCase("null") && !input.equalsIgnoreCase("NA") && !input.equalsIgnoreCase("")) {
                if (input != null && input.length() > 10) {
                    input = input.substring(0, 10);
                }
                if (input != null && input.length() > 0) {
                    arr = input.split("-");
                    year = Integer.parseInt(arr[0]);
                    month = Integer.parseInt(arr[1]);
                    day = Integer.parseInt(arr[2]);
                    if (month < 10) {
                        monthVal = "0" + month;
                    } else {
                        monthVal = "" + month;
                    }
                    if (day < 10) {
                        dayVal = "0" + day;
                    } else {
                        dayVal = "" + day;
                    }
                    switch (property) {
                        case 0:
                        case 1:
                            //yyyy-MM-dd time
                            date = year + "-" + monthVal + "-" + dayVal;
                            break;
                        case 2:
                            //MM-dd-yyyy time
                            date = monthVal + "-" + dayVal + "-" + year;
                            break;
                        case 3:
                            //dd-mm-yyyy time
                            date = dayVal + "-" + monthVal + "-" + year;
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            arr = null;
            monthVal = null;
            dayVal = null;
        }
        return date;
    }

    public String getDateToViewString(String input, int property) {
        String date = "";
        DateFormat inputFormat = null;
        DateFormat outputFormat = null;
        Date inputD = null;
        try {
            if (input != null && !input.equalsIgnoreCase("null") && !input.equalsIgnoreCase("NA") && !input.equalsIgnoreCase("")) {
                if (property == 0 || property == 1 || property == -0 || property == -1) {
                    inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                    inputD = inputFormat.parse(input);
                    outputFormat = new SimpleDateFormat("MMM dd, yyyy");
                    date = outputFormat.format(inputD);
                } else if (property == 2 || property == 3) {
                    inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                    inputD = inputFormat.parse(input);
                    outputFormat = new SimpleDateFormat("dd MMM, yyyy");
                    date = outputFormat.format(inputD);
                } else if (property == -2) {
                    inputFormat = new SimpleDateFormat("MM-dd-yyyy");
                    inputD = inputFormat.parse(input);
                    outputFormat = new SimpleDateFormat("dd MMM, yyyy");
                    date = outputFormat.format(inputD);
                } else if (property == -3) {
                    inputFormat = new SimpleDateFormat("dd-MM-yyyy");
                    inputD = inputFormat.parse(input);
                    outputFormat = new SimpleDateFormat("dd MMM, yyyy");
                    date = outputFormat.format(inputD);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            inputFormat = null;
            inputD = null;
            outputFormat = null;
        }
        return date;
    }
    private int fileAllowed = 0;
    private double fileSizeLimit = 0;
    private String fileAllowedFormats = "";
    private HashMap<String,Integer> fileMap = null;

    public int getFileAllowed() {
        return fileAllowed;
    }

    public void setFileAllowed(int fileAllowed) {
        this.fileAllowed = fileAllowed;
    }

    public double getFileSizeLimit() {
        return fileSizeLimit;
    }

    public void setFileSizeLimit(double fileSizeLimit) {
        this.fileSizeLimit = fileSizeLimit;
    }

    public String getFileAllowedFormats() {
        return fileAllowedFormats;
    }

    public void setFileAllowedFormats(String fileAllowedFormats) {
        this.fileAllowedFormats = fileAllowedFormats;
    }

    public HashMap<String, Integer> getFileMap() {
        return fileMap;
    }

    public void setFileMap(HashMap<String, Integer> fileMap) {
        this.fileMap = fileMap;
    }
      
    public String getSearchableKeywords(int userId, String keywords, String dummy) {
        String out = "";
        try {
            if (keywords != null && keywords.length() > 0) {
                String arr[] = keywords.trim().split(" ");
                if (arr != null && arr.length > 0) {
                    for (String arr1 : arr) {
                        out += "%" + arr1 + "%";
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }    

    public String readTextFromFile(String path) {
        String txt = "";
        File file = null;
        try {
            if (path != null && path.length() > 0) {
                path = this.getPathToUse(path);
                file = new File(path);
                if (file.exists()) {
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                    ByteArrayOutputStream buf = new ByteArrayOutputStream();
                    int result = bis.read();
                    while (result != -1) {
                        byte b = (byte) result;
                        buf.write(b);
                        result = bis.read();
                    }
                    txt = buf.toString();
                } else {
                    System.out.println("File not exists: " + path);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            file = null;
        }
        return txt;
    }

    public String WriteTextIntoFile(String path, String desc) {
        boolean flag = false;
        File file = null;
        String pathRet = "";
        try {
            if (path != null && path.length() > 0 && desc != null) {
                InputStream initialStream = new ByteArrayInputStream(desc.getBytes(StandardCharsets.UTF_8));
                path = this.getPathToUse(path);
                System.out.println("Path 1:"+path);
                file = new File(path);
                if (file != null && !file.exists()) {//create new folder if not exists
                    file.mkdirs();
                }
                path = path + "\\1.txt";
                path = this.getPathToUse(path);
                System.out.println("Path 2:"+path);
                file = new File(path);
                if (file != null && !file.exists()) {//create new file if not exists
                    file.createNewFile();
                }
                OutputStream outStream = new FileOutputStream(file);

                byte[] buffer = new byte[8 * 1024];
                int bytesRead;
                while ((bytesRead = initialStream.read(buffer)) != -1) {
                    outStream.write(buffer, 0, bytesRead);
                }
                IOUtils.closeQuietly(initialStream);
                IOUtils.closeQuietly(outStream);
                flag = true;
                pathRet = path;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file = null;
        }
        return pathRet;
    }

    public String getNumberInWords(Object input, String type) {
        String out = "";
        int p1 = 0;
        int p2 = 0;
        String temp = "";
        String tempp2 = "";
        String arr[] = null;
        try {
            temp = new BigDecimal(input.toString()).toPlainString();
            arr = temp.split("\\.");
            p1 = Integer.parseInt(arr[0]);
            if (arr.length > 1) {
                p2 = Integer.parseInt(arr[1]);
            }
            if (p1 > 0) {
                out += this.printWord((p1 / 1000000000), " Hundred",type);
                out += this.printWord((p1 / 10000000) % 100, " Crore",type);
                out += this.printWord(((p1 / 100000) % 100), " Lakh",type);
                out += this.printWord(((p1 / 1000) % 100), " Thousand",type);
                out += this.printWord(((p1 / 100) % 10), " Hundred",type);
                out += this.printWord((p1 % 100), "",type);
            }
            if (p2 > 0) {
                tempp2 = p2 + "";
                out += " Point";
                int aa = 0;
                for (int i = 0; i < tempp2.length(); i++) {
                    aa = Integer.parseInt(tempp2.toCharArray()[i] + "");
                    if (aa == 0) {
                        out += " Zero";
                    } else {
                        out += this.printWord((aa), "",type);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.trim();
    }

    public String printWord(int num, String ch,String type) {
        String str = "";
        try {
            String one[];
            String ten[];
            if(type!=null && type.equalsIgnoreCase("Suffix")){
                one = new String[]{"", " First", " Second", " Third", " Forth", " Fifth", " Sixth", " Seventh", " Eighth", " Ninth", " Tenth", " Eleventh", " Twelveth", " Thirteenth", " Fourteenth", "Fifteenth", " Sixteenth", " Seventeenth", " Eighteenth", " Nineteenth"};
                ten = new String[]{"", "", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
            }else{
                one = new String[]{"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
                ten = new String[]{"", "", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
            }
            if (num > 19) {
                str += ten[num / 10] + "" + one[num % 10];
            } else {
                str += one[num];
            }
            if (num > 0) {
                str += ch;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return str;
    }
    
    public int isTransEditAllowed(String authStatus, String transStatus) {
        int allowed = 0;
        try {
            if (transStatus == null || transStatus.length() == 0 || transStatus.equalsIgnoreCase("open")) {
                allowed = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allowed;
    }

    public int isFunderDocsAllowed(int userTypeId, String designation) {
        int allowed = 0;
        String dout = "";
        try {
            dout = this.GetDesignationsByTypeStr("SALES", "");
            if (designation != null && (!(dout.contains(designation)))) {
                allowed = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allowed;
    }

    public String GetDesignationsByTypeStr(String designation, String dummy) {
        String dout = "";
        try {
            if (designation != null && designation.equalsIgnoreCase("BDM")) {
                dout = "'BSE','BUSINESS SUPPORT EXECUTIVE','BDM'";
            } else if (designation != null && designation.equalsIgnoreCase("ACCOUNT MANAGER")) {
                dout = "'ACCOUNT MANAGER'";
            } else if (designation != null && designation.equalsIgnoreCase("TECHNICAL")) {
                dout = "'ACCOUNT MANAGER'";
            } else if (designation != null && designation.equalsIgnoreCase("SALES")) {
                dout = "'BSE','BUSINESS SUPPORT EXECUTIVE','BDM','ACCOUNT MANAGER','INSIDE SALES','TECHNOLOGY EVANGELIST','NETWORK ENGINEER', 'PRACTICE LEAD - SAM SERVICES', 'SAM ANALYST'";
            } else {
                dout = designation;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dout;
    }
    public List GetDesignationsByType(String designation, String dummy) {
        String dout = "";
        List idlist = new ArrayList();
        try {
            dout = this.GetDesignationsByTypeStr(designation, "");
            dout = dout.replaceAll("'","");
            String abc[] = dout.split(",");
            if (abc != null && abc.length > 0) {
                for (int i = 0; i < abc.length; i++) {
                    idlist.add(abc[i]);
                }
            }
            abc = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idlist;
    }

    public String CustomerAccessQuery(int userId) {
        String sql = "";
        try {
            sql = "(SELECT C11.CUSTOMER_ID FROM CM_CUSTOMERS C11 LEFT JOIN CM_CUST_SITE_MANAGER_DETAILS CM11  "
                    + "  ON (C11.CUSTOMER_ID=CM11.CUSTOMER_ID "
                    + "  AND CM11.STATUS=1 AND (CM11.ACCOUNT_MANAGER=:userId OR CM11.BDM=:userId) "
                    + "  AND CM11.CLIENT_ID=C11.CLIENT_ID "
//                    + "  AND CM11.ACCESS_TYPE IN ('Primary','Secondary') "
                    + "  AND IF (CM11.END_DATE IS NULL,(DATE(SYSDATE()) BETWEEN DATE(CM11.START_DATE) AND DATE(SYSDATE())), "
                    + "  (DATE(SYSDATE()) BETWEEN DATE(CM11.START_DATE) AND DATE(CM11.END_DATE)))), "
                    + "  USER_REG REG11 WHERE 1=1 "
//                    + "  AND C11.STATUS=1 "
                    + "  AND REG11.CLIENT_ID=C11.CLIENT_ID "
                    + "  AND IF(UPPER(REG11.DESIGNATION) IN ("+this.GetDesignationsByTypeStr("SALES","")+"),CM11.CUSTOMER_ID IS NOT NULL,1=1) "
                    + "  AND REG11.UID=:userId) ";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sql;
    }

    public String CustomerSiteAccessQuery(int userId) {
        String sql = "";
        try {
            sql = "(SELECT CS11.CUST_SITE_ID FROM CM_CUSTOMERS C11, "
                    + "  CM_CUST_SITES_ALL CS11 LEFT JOIN CM_CUST_SITE_MANAGER_DETAILS CM11  "
                    + "  ON (CS11.CUSTOMER_ID=CM11.CUSTOMER_ID AND CS11.CUST_SITE_ID=CM11.CUST_SITE_ID "
                    + "  AND CM11.STATUS=1 AND (CM11.ACCOUNT_MANAGER=:userId OR CM11.BDM=:userId) "
                    + "  AND CM11.CLIENT_ID=CS11.CLIENT_ID "
//                    + "  AND CM11.ACCESS_TYPE IN ('Primary','Secondary') "
                    + "  AND IF (CM11.END_DATE IS NULL,(DATE(SYSDATE()) BETWEEN DATE(CM11.START_DATE) AND DATE(SYSDATE())), "
                    + "  (DATE(SYSDATE()) BETWEEN DATE(CM11.START_DATE) AND DATE(CM11.END_DATE)))), "
                    + "  USER_REG REG11 WHERE 1=1 "//CS11.STATUS=1 AND C11.STATUS=1
                    + "  AND C11.CUSTOMER_ID=CS11.CUSTOMER_ID "
                    + "  AND REG11.CLIENT_ID=C11.CLIENT_ID "
                    + "  AND IF(REG11.UTYPEID=4 AND UPPER(REG11.DESIGNATION) IN ("+this.GetDesignationsByTypeStr("SALES","")+"),CM11.CUSTOMER_ID IS NOT NULL,1=1) "
                    + "  AND REG11.UID=:userId) ";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sql;
    }
    public String CustomerAccessQuery(String userIdColumn,String dummy) {
        String sql = "";
        try {
            sql = "(SELECT C11.CUSTOMER_ID FROM CM_CUSTOMERS C11,USER_REG REG11 WHERE 1=1 "
//                    + "  AND C11.STATUS=1 "
                    + "  AND REG11.CLIENT_ID=C11.CLIENT_ID "
                    + "  AND IF(UPPER(TRIM(IFNULL(REG11.DESIGNATION,''))) IN ("+this.GetDesignationsByTypeStr("SALES","")+"),"
                    + "  (SELECT COUNT(*) FROM CM_CUST_SITE_MANAGER_DETAILS CM11 WHERE C11.CUSTOMER_ID=CM11.CUSTOMER_ID "
                    + "  AND CM11.STATUS=1 "
                    + "  AND (CM11.ACCOUNT_MANAGER=REG11.UID OR CM11.BDM=REG11.UID) "
                    + "  AND CM11.CLIENT_ID=C11.CLIENT_ID "
//                    + "  AND CM11.ACCESS_TYPE IN ('Primary','Secondary') "
                    + "  AND IF (CM11.END_DATE IS NULL,(DATE(SYSDATE()) BETWEEN DATE(CM11.START_DATE) AND DATE(SYSDATE())), "
                    + "  (DATE(SYSDATE()) BETWEEN DATE(CM11.START_DATE) AND DATE(CM11.END_DATE))))>0 "
                    + "  ,1=1) "
                    + "  AND FIND_IN_SET(REG11.UID,REPLACE("+userIdColumn+",' ',''))) ";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sql;
    }

    public String CustomerSiteAccessQuery(String userIdColumn,String dummy) {
        String sql = "";
        try {
            sql = "(SELECT CS11.CUST_SITE_ID FROM CM_CUSTOMERS C11, "
                    + "  CM_CUST_SITES_ALL CS11,USER_REG REG11 WHERE 1=1 "//CS11.STATUS=1 AND C11.STATUS=1
                    + "  AND C11.CUSTOMER_ID=CS11.CUSTOMER_ID "
                    + "  AND REG11.CLIENT_ID=C11.CLIENT_ID "
                    + "  AND IF(REG11.UTYPEID=4 AND UPPER(TRIM(IFNULL(REG11.DESIGNATION,''))) IN ("+this.GetDesignationsByTypeStr("SALES","")+"),"
                    + "  (SELECT COUNT(*) FROM CM_CUST_SITE_MANAGER_DETAILS CM11 WHERE CS11.CUSTOMER_ID=CM11.CUSTOMER_ID AND CS11.CUST_SITE_ID=CM11.CUST_SITE_ID "
                    + "  AND CM11.STATUS=1 "
                    + "  AND (CM11.ACCOUNT_MANAGER=REG11.UID OR CM11.BDM=REG11.UID) "
                    + "  AND CM11.CLIENT_ID=CS11.CLIENT_ID "
//                    + "  AND CM11.ACCESS_TYPE IN ('Primary','Secondary') "
                    + "  AND IF (CM11.END_DATE IS NULL,(DATE(SYSDATE()) BETWEEN DATE(CM11.START_DATE) AND DATE(SYSDATE())), "
                    + "  (DATE(SYSDATE()) BETWEEN DATE(CM11.START_DATE) AND DATE(CM11.END_DATE))))>0 "
                    + "  ,1=1) "
                    + "  AND FIND_IN_SET(REG11.UID,REPLACE("+userIdColumn+",' ',''))) ";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sql;
    }
    public BigDecimal getAmountToSave(Object obj){
        String retAmount = "";
        BigDecimal v1 = BigDecimal.ZERO;
        try{
                v1 = BigDecimal.valueOf(Double.parseDouble(obj.toString()));
        }catch(Exception ex){
            
        }
        return v1;
    }
    public BigDecimal getDividedValue(Object v1,Object v2){
        BigDecimal v3 = BigDecimal.ZERO;
        try{
            if(v1!=null && v2 !=null){
                v3 = new BigDecimal(v1.toString().trim().replaceAll(",", "")).divide(new BigDecimal(v2.toString().trim().replaceAll(",", "")));
            }
        }catch(Exception ex){
            
        }
        return v3;
    }
    public BigDecimal getMultipliedValue(Object v1,Object v2){
        BigDecimal v3 = BigDecimal.ZERO;
        try{
            if(v1!=null && v2 !=null){
                v3 = new BigDecimal(v1.toString().trim().replaceAll(",", "")).multiply(new BigDecimal(v2.toString().trim().replaceAll(",", "")));
            }
        }catch(Exception ex){
            
        }
        return v3;
    }
    public BigDecimal getAdditionedValue(Object v1,Object v2){
        BigDecimal v3 = BigDecimal.ZERO;
        String s1 = "";
        String s2 = "";
        try{
            if(v1!=null && v2 !=null){
                s1 = v1.toString().trim().replaceAll(",", "");
                s2 = v2.toString().trim().replaceAll(",", "");
                if(s1.length()==0 || s1.toUpperCase().contains("N")){
                    s1 = "0";
                }
                if(s2.length()==0 || s2.toUpperCase().contains("N")){
                    s2 = "0";
                }
                v3 = new BigDecimal(s1).add(new BigDecimal(s2));
            }
        }catch(Exception ex){
            
        }
        return v3;
    }
    public BigDecimal getSubtractedValue(Object v1,Object v2){
        BigDecimal v3 = BigDecimal.ZERO;
        try{
            if(v1!=null && v2 !=null){
                v3 = new BigDecimal(v1.toString().trim().replaceAll(",", "")).subtract(new BigDecimal(v2.toString().trim().replaceAll(",", "")));
            }
        }catch(Exception ex){
            
        }
        return v3;
    }
    public double getRoundedValue(double input, String type) {
        double out = 0;
        try {
            if(type!=null && type.equalsIgnoreCase("10")){
                out = Math.round(input/10.0)*10.0;
            }else if(type!=null && type.equalsIgnoreCase("Final")){
                out = Math.round(input);
            }else{
                out = Math.round(input * 100.0) / 100.0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
    public BigDecimal getRoundedValueOb(Object input, String type) {
        String out = "0";
        double in = 0;
        BigDecimal ob = BigDecimal.ZERO;
        try {
            in = Double.parseDouble(input.toString());
            if(type!=null && type.equalsIgnoreCase("10")){
                out = Math.round(in/10.0)*10.0+"";
            }else if(type!=null && type.equalsIgnoreCase("Final")){
                out = Math.round(in)+"";
            }else{
                out = Math.round(in * 100.0) / 100.0+"";
            }
            out = this.getViewAmount(out);
            ob = new BigDecimal(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ob;
    }
    public String getViewAmount(Object obj){
        String retAmount = "";
        try{
            if(obj.getClass().getName().equalsIgnoreCase("java.math.BigDecimal")){
                retAmount = ((BigDecimal)obj).toPlainString();
            }else if(obj.getClass().getName().equalsIgnoreCase("java.lang.Double")){
                retAmount = BigDecimal.valueOf((Double)obj).toPlainString();
            }else if(obj.getClass().getName().equalsIgnoreCase("java.lang.String")){
                retAmount = new BigDecimal((String)obj).toPlainString();
            }else{
                retAmount = obj.toString();
            }
        }catch(Exception ex){
            
        }
        return retAmount;
    }
    public String getFormettedAmount(Object obj){
        String retAmountOut = "";
        String retAmount = "";
        String minus = "";
//        Locale locale = null;
        try{
            retAmount = obj.toString().trim();
            if(retAmount.startsWith("-")){
                minus = "-";
                retAmount = retAmount.substring(1);
            }
            if(retAmount.contains(",")){
                retAmountOut = retAmount;
            }else{
                String arr[] = retAmount.split("\\.");
                char carr[] = arr[0].toCharArray();
                int cnt = 0;
                for (int i = (carr.length - 1); i >= 0; i--) {
                    if (cnt == 3 || cnt == 5 || cnt == 7 || cnt == 9 || cnt == 11 || cnt == 13 || cnt == 15 || cnt == 17) {
                        retAmountOut = "," + retAmountOut;
                    }
                    retAmountOut = carr[i] + retAmountOut;
                    cnt++;
                }
                if (arr.length > 1 && arr[1].length() > 0 && new BigDecimal((arr[1])).compareTo(BigDecimal.ZERO) != 0) {
                    retAmountOut += "." + arr[1];
                }
            }
            retAmountOut = minus+retAmountOut;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return retAmountOut;
    }
    public String GetFileNameFormatted(String fileName) {
        String out = "";
        try{
            if(fileName==null){
                fileName = "";
            }
            out = fileName.trim().replaceAll("\\ ", "").replaceAll("\\/", "_");
            out = this.getPathToUse(out);
        }catch(Exception e){
            e.printStackTrace();
        }
        return out;
    }
    public String GetSeqNoFormatted(String seqNo) {
        String out = "";
        try{
            if(seqNo==null){
                seqNo = "";
            }
            out = seqNo.trim().replaceAll("\\ ", "");
        }catch(Exception e){
            e.printStackTrace();
        }
        return out;
    }
    public String GetPaddedNumber(int counter,int len,String padding) {
        String out = "";
        try{
            out = String.format("%"+padding+len+"d", counter);
        }catch(Exception e){
            e.printStackTrace();
        }
        return out;
    }
    public String GetIntArrayToString(int arr[],String type) {
        String out = "";
        try{
            if(arr==null){
                
            }else{
                out = Arrays.toString(arr);
                out = out.trim().replaceAll("\\[", "").replaceAll("\\]", "");
                if(out.startsWith("0,")){
                    out = out.substring(2);
                }else if(out.equalsIgnoreCase("0")){
//                    out = out.substring(2);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return out.trim();
    }    
    
    
    public String setSortingCol(HttpServletRequest request,String url,int selCol,int curCol,int ascDesc,String dummy) {
        String out = "";
        String title = "Click to order by this column";
        String icon = "<i class=\"fa fa-hand-o-down\"/>";
        try {
            String encodedString = this.getEncodedString(request, selCol+"");
            out = "<a href=\""+url+encodedString+" title=\""+title+"\">";
            if(ascDesc==1){
                icon = "<i class=\"fa fa-hand-o-up\"/>";
            }
            if(selCol==curCol){
                out += icon;
            }else{
                out += "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
    public String getPathToUse(String path) {
        String out = "";
        try {
            String os = System.getProperty("os.name");
            if(os!=null && os.toUpperCase().contains("WINDOW")){
                out = path.replace("/", "\\");
            }else{
                out = path.replace("\\", "/");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
    public int currentTaskValue = 1;
}

