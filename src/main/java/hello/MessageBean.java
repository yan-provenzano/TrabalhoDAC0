package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.util.*;
import java.io.Serializable;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
     
   
    private String lang;
    private String tratamento;
    private String msg; 
    
    public MessageBean() {
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
    
    public String getTratamento() {
        return tratamento;
    }
    
    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
    
    public String getMsg() {
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        switch (lang){
            case "pt": {
                
                if(hora > 6 && hora < 12) {
                    msg = "Bom Dia, ";
                }
                else {
                    if(hora > 12 && hora < 18)
                        msg = "Boa Tarde, ";
                    else
                        msg = "Boa Noite, ";
                }
                
                if ("sr".equals(tratamento)){
                    msg += "Sr.";
                }
                if ("sra".equals(tratamento)){
                    msg += "Sra.";
                }
             
                break;
            }
            case "en": {
                
                if(hora > 6 && hora < 12) {
                    msg = "Good Morning, ";
				}
		        else {
                    if(hora > 12 && hora < 18){
                        msg = "Good Afternoon, ";
					}
                    else{
                        msg = "Good Evening, ";
                    }
				}
                if ("sr".equals(tratamento)){
                    msg += "Mr.";
                }
                if ("sra".equals(tratamento)){
                    msg += "Mrs.";
                }
                
                break;
			}
            case "de": {
                
                if(hora > 6 && hora < 12){
                    msg = "Guten Morgen, ";
				}
		        else {
                    if(hora > 12 && hora < 18) {
                        msg = "Guten Tag, ";
					}
                    else{
                        msg = "Guten Abend, ";
                    }
				}
                
                if ("sr".equals(tratamento)){
                    msg += "Mr.";
                }
                if ("sra".equals(tratamento)){
                    msg += "Mrs.";
                }
                
                break;
			}

            case "fr":{
                
                if(hora > 6 && hora < 12){
                    msg = "Bonjour, ";
				}
		        else {
                    if(hora > 12 && hora < 18){
                        msg = "Bonjour, ";
					}
                    else {
                        msg = "Bonsoir, ";
					}
				}
              
                if ("sr".equals(tratamento)){
                    msg += "M.";
                }
                if ("sra".equals(tratamento)){
                    msg += "Mme";
                }
                
                break;
			}

            case "it":{
                
                if(hora > 6 && hora < 12){
                    msg = "Buongiorno, ";
				}
		        else {
                    if(hora > 12 && hora < 18){
                        msg = "Buongiorno, ";
					}
                    else{
                        msg = "Buonasera, ";
					}
				}
                
                if ("sr".equals(tratamento)){
                    msg += "Sig.";
                }
                if ("sra".equals(tratamento)){
                    msg += "Sig.ra";
                }
                
                break;
			}

            case "es":{
                
                if(hora > 6 && hora < 12){
                    msg = "Buenos Días, ";
				}
		        else {
                    if(hora > 12 && hora < 18){
                        msg = "Buenas Tardes, ";
					}
                    else {
                        msg = "Buenas Noches, ";
					}
				}
                
                if ("sr".equals(tratamento)){
                    msg += "Sr.";
                }
                if ("sra".equals(tratamento)){
                    msg += "Sra.";
                }
                
                break;
			}

        }
        
        return msg;
    }
      
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
}
