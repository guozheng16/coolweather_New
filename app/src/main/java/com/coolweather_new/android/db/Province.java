package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018-11-26.
 */
public class Province extends  DataSupport  {

    private  int id;
    private  String provienceName;
    private  int provinceCode;

    public  int getId(){
        return id;
    }
    public  void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return  provienceName;
    }
    public  void setProvinceName(String provienceName){
        this
                .provienceName = provienceName;
    }
    public  int getProvinceCode(){
        return  provinceCode;
    }
    public  void  setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }


}
