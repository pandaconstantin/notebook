/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.notebook.jsonparser;

/**
 *
 * @author constantindrabo
 */
public class ResultModel {

    private String result;

    public ResultModel() {
    }

    public ResultModel(String result) {
        this.result = result;
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
